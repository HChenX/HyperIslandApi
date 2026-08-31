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
package com.hchen.hyperislandapi.model.focus;

import androidx.annotation.NonNull;

/**
 * 焦点通知的基础信息区，对应官方 {@code BaseInfo}。
 * <p>
 * 包含标题、内容、副标题与分割线、边距、展示类型等配置，
 * 继承 {@link TextAndColorInfo} 提供文字与颜色设置。
 */
public final class BaseInfo extends TextAndColorInfo<BaseInfo> {
    private String picFunction;
    private Boolean setMarginBottom = Boolean.FALSE;
    private Boolean setMarginTop = Boolean.FALSE;
    private Boolean showContentDivider = Boolean.FALSE;
    private Boolean showDivider = Boolean.FALSE;
    private Integer type;

    /** 设置图片功能，指定该信息区使用哪个图标资源。 */
    public BaseInfo setPicFunction(String picFunction) {
        this.picFunction = picFunction;
        return this;
    }

    /** 设置内容区域底部是否留白。 */
    public BaseInfo setSetMarginBottom(Boolean setMarginBottom) {
        this.setMarginBottom = setMarginBottom;
        return this;
    }

    /** 设置内容区域顶部是否留白。 */
    public BaseInfo setSetMarginTop(Boolean setMarginTop) {
        this.setMarginTop = setMarginTop;
        return this;
    }

    /** 设置是否显示内容下方的分割线。 */
    public BaseInfo setShowContentDivider(Boolean showContentDivider) {
        this.showContentDivider = showContentDivider;
        return this;
    }

    /** 设置是否显示整体分割线。 */
    public BaseInfo setShowDivider(Boolean showDivider) {
        this.showDivider = showDivider;
        return this;
    }

    /** 设置基础信息的展示类型，如普通型、反转型等。 */
    public BaseInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getPicFunction() {
        return picFunction;
    }

    public Boolean getSetMarginBottom() {
        return setMarginBottom;
    }

    public Boolean getSetMarginTop() {
        return setMarginTop;
    }

    public Boolean getShowContentDivider() {
        return showContentDivider;
    }

    public Boolean getShowDivider() {
        return showDivider;
    }

    public Integer getType() {
        return type;
    }

    @NonNull
    @Override
    public String toString() {
        return "BaseInfo{" +
            "picFunction='" + picFunction + '\'' +
            ", setMarginBottom=" + setMarginBottom +
            ", setMarginTop=" + setMarginTop +
            ", showContentDivider=" + showContentDivider +
            ", showDivider=" + showDivider +
            ", type=" + type +
            "} " + super.toString();
    }
}
