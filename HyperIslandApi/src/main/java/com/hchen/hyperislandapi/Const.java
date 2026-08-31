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

/**
 * 与 HyperOS 焦点通知/超级岛交互时使用的常量集合。
 * <p>
 * 所有键均与官方 SystemUI 中的 {@code Const.Param} 及 {@code Const.DynamicIsland}
 * 逐字保持一致，用于在 Notification extras 与 Bundle 中定位数据。
 */
public final class Const {
    /**
     * 焦点通知所需的各类 Bundle key 与 JSON 键。
     */
    public static class Param {
        // ----------------------- RV ----------------------------
        /** 日间模式自定义布局 RemoteViews 的 key。 */
        public static final String LAYOUT = "miui.focus.rv";
        /** 夜间模式自定义布局 RemoteViews 的 key。 */
        public static final String LAYOUT_NIGHT = "miui.focus.rvNight";
        /** AOD 场景自定义布局 RemoteViews 的 key。 */
        public static final String LAYOUT_AOD = "miui.focus.rvAod";
        /** 横屏装饰布局 RemoteViews 的 key。 */
        public static final String LAYOUT_DECO_LAND = "miui.focus.rv.deco.land";
        /** 横屏装饰夜间布局 RemoteViews 的 key。 */
        public static final String LAYOUT_DECO_LAND_NIGHT = "miui.focus.rv.deco.land.night";
        /** 竖屏装饰布局 RemoteViews 的 key。 */
        public static final String LAYOUT_DECO_PORT = "miui.focus.rv.deco.port";
        /** 竖屏装饰夜间布局 RemoteViews 的 key。 */
        public static final String LAYOUT_DECO_PORT_NIGHT = "miui.focus.rv.deco.port.night";
        /** 微胶囊布局 RemoteViews 的 key。 */
        public static final String LAYOUT_FLIP_TINY = "miui.focus.rv.tiny";
        /** 微胶囊夜间布局 RemoteViews 的 key。 */
        public static final String LAYOUT_FLIP_TINY_NIGHT = "miui.focus.rv.tinyNight";
        /** 岛展开视图 RemoteViews 的 key。 */
        public static final String EXTRA_FOCUS_DARK_ISLAND_EXPAND_VIEW = "miui.focus.rv.island.expand";

        // -------------------------------------------------------
        /** 焦点通知主 JSON 参数（内容为整个焦点模板 JSON 串）的 extras key。 */
        public static final String PARAM_FOCUS = "miui.focus.param";
        /** 动作 Bundle 的 extras key，键为 {@code miui.focus.action_N}。 */
        public static final String PARAM_ACTION_BUNDLE = "miui.focus.actions";
        /** 图片/图标 Bundle 的 extras key，键与 JSON 中的 {@code pic} 字符串一一对应。 */
        public static final String PARAM_BITMAP_BUNDLE = "miui.focus.pics";
        /** 自定义布局（RemoteViews）时的焦点 JSON 参数 extras key。 */
        public static final String PARAM_FOCUS_CUSTOM = "miui.focus.param.custom";

        // -------------- 以下为官方焦点模型中的 JSON 键 --------------
        /** 焦点模板 V2 协议 JSON 键（{@code param_v2}）。 */
        public static final String PARAM_V2 = "param_v2";
        /** 焦点模板 V3 协议 JSON 键（{@code param_v3}），官方预留。 */
        public static final String PARAM_V3 = "param_v3";
        /** VOIP 焦点通知协议 JSON 键（{@code param_voip_v2}），结构与 {@code param_v2} 一致。 */
        public static final String PARAM_VOIP_V2 = "param_voip_v2";
        /** 超级岛模板 JSON 键（{@code param_island}），官方内嵌于 {@code param_v2} 之中。 */
        public static final String PARAM_ISLAND = "param_island";
        /** 焦点渠道类型 extras 键，取值如 {@code normal}。 */
        public static final String CHANNEL_TYPE = "miui.focus.param.channeltype";
        /** 旧版协议版本号 JSON 键，官方 V3 模型中已移除。 */
        public static final String PROTOCOL = "protocol";
        /** 场景名 JSON 键，用于旧版模板分派。 */
        public static final String SCENE = "scene";
        /** 订单 ID JSON 键。 */
        public static final String ORDER_ID = "orderId";
        /** os4 新增：通知 extras 中携带订单 ID 的键。 */
        public static final String EXTRA_MIUI_FOCUS_PARAM_ORDER_ID = "miui.orderId";
    }

    /**
     * 超级岛（DynamicIsland）相关常量，os4 起官方将其独立维护。
     */
    public static class Island {
        /** 超级岛形态 JSON 键（{@code islandProperty}）。 */
        public static final String KEY_ISLAND_PROPERTY = "islandProperty";
        /** 一次性岛：只展示一次。os4 起该值会使通知自身不再展示。 */
        public static final int ISLAND_PROPERTY_ONCE = 0;
        /** 信息展示型岛。 */
        public static final int ISLAND_PROPERTY_INFO = 1;
        /** 交互操作型岛。 */
        public static final int ISLAND_PROPERTY_OPERA = 2;
        /** os4 新增：岛状态回调的通知 extras key。 */
        public static final String EXTRA_ISLAND_STATE_CALLBACK = "miui.island.state_callback";
        /** os4 新增：岛状态回调过滤条件 key。 */
        public static final String EXTRA_ISLAND_STATE_CALLBACK_FILTER = "miui.island.state_callback_filter";
    }
}