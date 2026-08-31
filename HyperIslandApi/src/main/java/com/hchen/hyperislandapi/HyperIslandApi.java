/*
 * This file is part of HyperIslandApi.
 *
 * HyperIslandApi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * HyperIslandApi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with HyperIslandApi. If not, see <https://www.gnu.org/licenses/lgpl-2.1>.
 *
 * Copyright (C) 2023–2025 HChenX
 */
package com.hchen.hyperislandapi;

import android.app.Notification;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.hchen.hyperislandapi.callback.CoverTemplateCallback;
import com.hchen.hyperislandapi.callback.CoverTemplateCallback2;
import com.hchen.hyperislandapi.template.IslandTemplate;
import com.hchen.hyperislandapi.template.Template;
import com.hchen.hyperislandapi.template.ViewsTemplate;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Objects;

/**
 * 焦点通知/超级岛 API 入口，负责将模板对象合法化并序列化为系统可识别的数据。
 * <p>
 * 通过 {@link #setTemplate(Template)}、{@link #setIslandTemplate(IslandTemplate)}、
 * {@link #setRemoteViewsTemplate(ViewsTemplate)} 配置模板，图片/动作放入 Bundle，
 * 最终 {@link #build()} 返回包含 JSON 字符串与 Bundle 的 {@link Data}，
 * 供模块开发者写入 Notification extras。
 */
public class HyperIslandApi {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
        .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
        .setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT)
        // 与官方 Gson 读取行为一致：忽略模板中未知/遗留的 JSON 键（如 protocol、scene）
        .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

    // OS2/OS3 焦点通知数据
    // param_v2
    private Template template;
    // OS3 超级岛数据
    // param_island
    private IslandTemplate islandTemplate;
    // 自定义布局
    private ViewsTemplate viewsTemplate;
    // 所有 图片/图标 等数据放置此处
    // 并且和 pic 等数据 key 相同
    // 比如 picBundle.putParcelable("miui.focus.pic_ado_pic", Icon.createWithBitmap(bitmap))
    // 则 "aodPic": "miui.focus.pic_ado_pic"
    private Bundle picBundle;
    // 与上面类似，所有动作相关数据放置此处
    // 并且与 action 数据 key 对应
    private Bundle actionBundle;
    // 解析已有的数据并合并，可能会覆盖已经设置的值
    private String parse;
    // 覆盖即将序列化为字符串的数据
    private CoverTemplateCallback callback;
    // 外层参数键，默认 param_v2；填 param_voip_v2 可产出 VOIP 焦点通知
    private String paramKey = Const.Param.PARAM_V2;

    // 这两个字段不得混淆
    private final static Field bundle_field;
    private final static Field param_island_field;

    static {
        try {
            bundle_field = ViewsTemplate.class.getDeclaredField("bundle");
            bundle_field.setAccessible(true);

            param_island_field = Template.class.getDeclaredField("param_island");
            param_island_field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public HyperIslandApi() {
    }

    /**
     * 设置焦点通知模板。
     *
     * @param template 焦点通知模板（外层 JSON 键 {@code param_v2} 的数据）
     */
    public HyperIslandApi setTemplate(Template template) {
        this.template = template;
        return this;
    }

    /**
     * 设置外层参数键，决定产物 JSON 的外层包裹键。
     *
     * @param paramKey {@link Const.Param#PARAM_V2}（默认）或
     *                 {@link Const.Param#PARAM_VOIP_V2}（VOIP 通话焦点通知）；传 {@code null} 时回退到
     *                 {@code param_v2}
     */
    public HyperIslandApi setParamKey(String paramKey) {
        this.paramKey = paramKey;
        return this;
    }

    /**
     * 设置超级岛模板，构建时内嵌到焦点 JSON 的 {@code param_island}。
     *
     * @param islandTemplate 超级岛模板，可传 {@code null} 表示不带超级岛
     */
    public HyperIslandApi setIslandTemplate(IslandTemplate islandTemplate) {
        this.islandTemplate = islandTemplate;
        return this;
    }

    /**
     * 设置自定义远程视图模板，构建时以自定义布局的方式输出焦点。
     *
     * @param viewsTemplate 各场景（日间/夜间/AOD/装饰/微胶囊/岛展开）的 RemoteViews 布局
     */
    public HyperIslandApi setRemoteViewsTemplate(ViewsTemplate viewsTemplate) {
        this.viewsTemplate = viewsTemplate;
        return this;
    }

    /**
     * 设置图片/图标数据，键与模板中的 {@code pic} 字符串一一对应。
     *
     * @param picBundle 键为图片 key、值为 {@code Icon} 等 Parcelable 的 Bundle
     */
    public HyperIslandApi setPicBundle(Bundle picBundle) {
        this.picBundle = picBundle;
        return this;
    }

    /**
     * 设置动作数据，键与模板中的 {@code action} 字符串一一对应。
     *
     * @param actionBundle 键为动作 key、值为动作相关数据的 Bundle
     */
    public HyperIslandApi setActionBundle(Bundle actionBundle) {
        this.actionBundle = actionBundle;
        return this;
    }

    /**
     * 设置需要解析并合并进构建结果的 JSON。
     * <p>
     * 兼容两种形态：完整的 {@code {param_v2: ...}} 外层壳，或直接给出模板字段内容；
     * 解析出的字段会覆盖模板中已设置的相同字段。
     *
     * @param parse 焦点模板 JSON 字符串
     */
    public HyperIslandApi parse(String parse) {
        this.parse = parse;
        return this;
    }

    /**
     * 设置在序列化前覆盖模板数据的回调。
     *
     * @param callback 覆盖回调，在最终 JSON 序列化之前调用，可统一调整动态字段
     */
    public HyperIslandApi cover(CoverTemplateCallback callback) {
        this.callback = callback;
        return this;
    }

    /**
     * 获取当前设置的焦点通知模板。
     *
     * @return 焦点通知模板，可能为 {@code null}
     */
    public Template getTemplate() {
        return template;
    }

    /**
     * 获取当前设置的超级岛模板。
     *
     * @return 超级岛模板，可能为 {@code null}
     */
    public IslandTemplate getIslandTemplate() {
        return islandTemplate;
    }

    /**
     * 获取当前设置的自定义远程视图模板。
     *
     * @return 自定义远程视图模板，可能为 {@code null}
     */
    public ViewsTemplate getRemoteViewsTemplate() {
        return viewsTemplate;
    }

    /**
     * 获取当前设置的图片/图标 Bundle。
     *
     * @return 图片 Bundle，可能为 {@code null}
     */
    public Bundle getPicBundle() {
        return picBundle;
    }

    /**
     * 获取当前设置的动作 Bundle。
     *
     * @return 动作 Bundle，可能为 {@code null}
     */
    public Bundle getActionBundle() {
        return actionBundle;
    }

    /**
     * 获取当前设置的外层参数键。
     *
     * @return 外层参数键，默认 {@code param_v2}
     */
    public String getParamKey() {
        return paramKey;
    }

    /**
     * 构建合法化模板数据。
     * <p>
     * 依次执行：图片/动作数据打包、模板副本构建、可选的 JSON 解析合并与覆盖回调，
     * 最终输出含 JSON 字符串与相应 Bundle 的 {@link Data}。
     *
     * @return 含焦点 JSON 与图片/动作 Bundle 的构建结果
     * @throws HyperIslandApiException 当 JSON 处理或反射写入失败时
     */
    public Data build() {
        try {
            Bundle bundle = new Bundle();
            if (picBundle != null) bundle.putBundle(Const.Param.PARAM_BITMAP_BUNDLE, picBundle);
            if (actionBundle != null)
                bundle.putBundle(Const.Param.PARAM_ACTION_BUNDLE, actionBundle);
            if (viewsTemplate != null) bundle.putAll((Bundle) bundle_field.get(viewsTemplate));

            // 复制模板副本，避免把超级岛写回到调用方传入的 template 实例
            Template template = new Template();
            if (this.template != null) {
                template = OBJECT_MAPPER.treeToValue(
                    OBJECT_MAPPER.valueToTree(this.template), Template.class);
            }
            if (islandTemplate != null) param_island_field.set(template, islandTemplate);

            String key = paramKey == null ? Const.Param.PARAM_V2 : paramKey;
            ObjectNode root = OBJECT_MAPPER.createObjectNode();
            root.set(key, OBJECT_MAPPER.valueToTree(template));

            if (parse != null) {
                /*
                 * 将给定的 JSON 串解析成模板并与当前模板的数据合并 (会覆盖当前模板已设置的数值)。
                 * 兼容两种输入：完整的 {param_v2: ...} 壳，或直接给出 param_v2 的内容。
                 * */
                JsonNode updateNode = OBJECT_MAPPER.readTree(parse);
                if (updateNode.isObject()) {
                    boolean hasShell = updateNode.has(Const.Param.PARAM_V2) || updateNode.has(key);
                    if (!hasShell) {
                        ObjectNode wrapped = OBJECT_MAPPER.createObjectNode();
                        wrapped.set(key, updateNode);
                        updateNode = wrapped;
                    }
                    merge(root, updateNode);
                }
            }

            if (callback != null) {
                /*
                 * 覆盖指定数据
                 * */
                JsonNode inner = root.get(key);
                Template coverTarget = inner == null
                    ? null
                    : OBJECT_MAPPER.treeToValue(inner, Template.class);
                IslandTemplate coverIsland = coverTarget == null
                    ? null
                    : (IslandTemplate) param_island_field.get(coverTarget);
                callback.cover(coverTarget, coverIsland);
                if (coverTarget != null) {
                    root.set(key, OBJECT_MAPPER.valueToTree(coverTarget));
                }
            }

            String json = OBJECT_MAPPER.writeValueAsString(root);
            bundle.putString(
                viewsTemplate == null ? Const.Param.PARAM_FOCUS : Const.Param.PARAM_FOCUS_CUSTOM,
                json
            );
            return new Data(json, bundle,
                viewsTemplate == null ? Const.Param.PARAM_FOCUS : Const.Param.PARAM_FOCUS_CUSTOM);
        } catch (JsonProcessingException | IllegalAccessException e) {
            throw new HyperIslandApiException("构建焦点通知数据失败", e);
        }
    }

    /**
     * 将 JSON 解析后合并进指定模板并返回序列化结果。
     * <p>
     * 注意：parse 须为模板字段内容的裸 JSON（不带外层 {@code param_v2} 壳）。
     *
     * @param parse    待合并的 JSON 字符串
     * @param template 目标模板对象
     * @return 合并并序列化后的 JSON 字符串
     * @throws NullPointerException    当 {@code parse} 或 {@code template} 为空时
     * @throws HyperIslandApiException 当 JSON 解析或合并失败时
     */
    public <T> String build(String parse, T template) {
        return build(parse, template, null);
    }

    /**
     * 将 JSON 解析后合并进指定模板，经覆盖回调后再序列化。
     * <p>
     * 注意：parse 须为模板字段内容的裸 JSON（不带外层 {@code param_v2} 壳）。
     *
     * @param parse    待合并的 JSON 字符串，不可为空
     * @param template 目标模板对象，不可为空
     * @param callback2 序列化前覆盖回调，可传 {@code null}
     * @return 合并并序列化后的 JSON 字符串
     * @throws NullPointerException    当 {@code parse} 或 {@code template} 为空时
     * @throws HyperIslandApiException 当 JSON 解析或合并失败时
     */
    public <T> String build(String parse, T template, CoverTemplateCallback2<T> callback2) {
        Objects.requireNonNull(parse);
        Objects.requireNonNull(template);

        try {
            JsonNode templateNode = OBJECT_MAPPER.valueToTree(template);
            JsonNode updateNode = OBJECT_MAPPER.readTree(parse);
            merge(templateNode, updateNode);
            template = (T) OBJECT_MAPPER.treeToValue(templateNode, template.getClass());
            if (callback2 != null) callback2.cover(template);
            return OBJECT_MAPPER.writeValueAsString(template);
        } catch (JsonProcessingException e) {
            throw new HyperIslandApiException("解析并合并 JSON 失败: " + e.getOriginalMessage(), e);
        }
    }

    /**
     * 仅构建单个模板。
     * <p>
     * 此方法不会执行模板的合法化构建，单纯直出单个模板序列化后的数据；
     * 只允许在焦点模板与超级岛模板中二选一。
     *
     * @return 单个模板序列化后的 JSON 字符串
     * @throws HyperIslandApiException 当焦点模板与超级岛模板未二选一，或序列化失败时
     */
    public String buildSingle() {
        try {
            if (template != null && islandTemplate == null) {
                return OBJECT_MAPPER.writeValueAsString(template);
            }
            if (islandTemplate != null && template == null) {
                return OBJECT_MAPPER.writeValueAsString(islandTemplate);
            }
            throw new HyperIslandApiException("仅支持在焦点模板与超级岛模板中二选一进行单独构建");
        } catch (JsonProcessingException e) {
            throw new HyperIslandApiException("单个模板序列化失败", e);
        }
    }

    private void merge(JsonNode target, JsonNode source) {
        if (!source.isObject() || !target.isObject()) {
            return;
        }

        Iterator<String> fieldNames = source.fieldNames();
        while (fieldNames.hasNext()) {
            String field = fieldNames.next();
            JsonNode sourceValue = source.get(field);
            JsonNode targetValue = target.get(field);

            if (sourceValue.isObject() && targetValue != null && targetValue.isObject()) {
                merge(targetValue, sourceValue);
            } else {
                ((ObjectNode) target).set(field, sourceValue);
            }
        }
    }

    /**
     * 构建结果数据，包含焦点 JSON 字符串与配套的图片/动作 Bundle。
     * <p>
     * 可通过 {@link Data#toExtras()} 或 {@link Data#applyTo(Notification.Builder)}
     * 便捷写入通知的 extras。
     */
    public record Data(String json, Bundle bundle, String focusKey) {
        /**
         * 便捷构造，焦点键按 Bundle 内容推测：存在自定义布局键时为
         * {@code miui.focus.param.custom}，否则为 {@code miui.focus.param}。
         */
        public Data(String json, Bundle bundle) {
            this(json, bundle,
                bundle.containsKey(Const.Param.LAYOUT)
                    ? Const.Param.PARAM_FOCUS_CUSTOM
                    : Const.Param.PARAM_FOCUS);
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Data data)) return false;
            return Objects.equals(json, data.json) && Objects.equals(bundle, data.bundle);
        }

        @Override
        public int hashCode() {
            return Objects.hash(json, bundle);
        }

        @Override
        @NonNull
        public String toString() {
            return "Data{" +
                "json='" + json + '\'' +
                ", bundle=" + bundle +
                '}';
        }

        /**
         * 将本数据写入通知构建器的 extras。
         * <p>
         * 自动把 JSON 放入 {@code miui.focus.param}（自定义布局时为
         * {@code miui.focus.param.custom}），并把图片/动作等 Bundle 一并合并。
         *
         * @param builder 目标通知构建器
         */
        public void applyTo(@NonNull Notification.Builder builder) {
            builder.getExtras().putAll(toExtras());
        }

        /**
         * 生成本数据对应的独立 extras Bundle，不修改本对象持有的 Bundle。
         *
         * @return 含 JSON 与图片/动作数据的 Bundle
         */
        @NonNull
        public Bundle toExtras() {
            Bundle extras = new Bundle();
            extras.putString(focusKey, json);
            extras.putAll(bundle);
            return extras;
        }
    }
}
