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

import android.os.Bundle;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.hchen.hyperislandapi.callback.CoverTemplateCallback;
import com.hchen.hyperislandapi.callback.CoverTemplateCallback2;
import com.hchen.hyperislandapi.template.IslandTemplate;
import com.hchen.hyperislandapi.template.Template;
import com.hchen.hyperislandapi.template.ViewsTemplate;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Objects;

public class HyperIslandApi {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
        .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
        .setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);

    // 外层模板
    private OuterTemplate OUTER_TEMPLATE;
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

    public HyperIslandApi setTemplate(Template template) {
        this.template = template;
        return this;
    }

    public HyperIslandApi setIslandTemplate(IslandTemplate islandTemplate) {
        this.islandTemplate = islandTemplate;
        return this;
    }

    public HyperIslandApi setRemoteViewsTemplate(ViewsTemplate viewsTemplate) {
        this.viewsTemplate = viewsTemplate;
        return this;
    }

    public HyperIslandApi setPicBundle(Bundle picBundle) {
        this.picBundle = picBundle;
        return this;
    }

    public HyperIslandApi setActionBundle(Bundle actionBundle) {
        this.actionBundle = actionBundle;
        return this;
    }

    public HyperIslandApi parse(String parse) {
        this.parse = parse;
        return this;
    }

    public HyperIslandApi cover(CoverTemplateCallback callback) {
        this.callback = callback;
        return this;
    }

    /**
     * 构建合法化模板数据
     */
    public Data build() {
        try {
            Bundle bundle = new Bundle();
            if (picBundle != null) bundle.putBundle(Const.Param.PARAM_BITMAP_BUNDLE, picBundle);
            if (actionBundle != null)
                bundle.putBundle(Const.Param.PARAM_ACTION_BUNDLE, actionBundle);
            if (viewsTemplate != null) bundle.putAll((Bundle) bundle_field.get(viewsTemplate));

            if (OUTER_TEMPLATE == null) OUTER_TEMPLATE = new OuterTemplate();
            if (template == null) template = new Template();
            OUTER_TEMPLATE.param_v2 = template;
            if (islandTemplate != null) param_island_field.set(template, islandTemplate);

            if (parse != null) {
                /*
                 * 将给定的 JSON 串解析成模板并与当前模板的数据合并 (会覆盖当前模板已设置的数值)
                 * */
                JsonNode templateNode = OBJECT_MAPPER.valueToTree(OUTER_TEMPLATE);
                JsonNode updateNode = OBJECT_MAPPER.readTree(parse);
                merge(templateNode, updateNode);
                OUTER_TEMPLATE = OBJECT_MAPPER.treeToValue(templateNode, OuterTemplate.class);
            }

            if (callback != null) {
                template = OUTER_TEMPLATE.param_v2;
                if (template != null)
                    islandTemplate = (IslandTemplate) param_island_field.get(template);
                /*
                 * 覆盖指定数据
                 * */
                callback.cover(template, islandTemplate);
            }

            JSONObject object = new JSONObject(OBJECT_MAPPER.writeValueAsString(OUTER_TEMPLATE));
            bundle.putString(
                viewsTemplate == null ? Const.Param.PARAM_FOCUS : Const.Param.PARAM_FOCUS_CUSTOM,
                object.toString()
            );

            OUTER_TEMPLATE = null;
            return new Data(object.toString(), bundle);
        } catch (JSONException | JsonProcessingException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> String build(String parse, T template) {
        return build(parse, template, null);
    }

    /**
     * 解析合并指定模板
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
            throw new RuntimeException("Error processing json: " + e.getMessage(), e);
        }
    }

    /**
     * 仅构建单个模板
     * <p>
     * 此方法不会执行模板的合法化构建，单纯直出单个模板序列化后的数据
     */
    public String buildSingle() {
        try {
            if (template != null && islandTemplate == null) {
                return new JSONObject(OBJECT_MAPPER.writeValueAsString(template)).toString();
            }
            if (islandTemplate != null && template == null) {
                return new JSONObject(OBJECT_MAPPER.writeValueAsString(islandTemplate)).toString();
            }
            throw new RuntimeException("Not a single build!!");
        } catch (JSONException | JsonProcessingException e) {
            throw new RuntimeException(e);
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
     * @noinspection DeconstructionCanBeUsed
     */
    public record Data(String json, Bundle bundle) {
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
    }

    @Keep
    private static class OuterTemplate {
        @Keep
        public Template param_v2;
    }
}
