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

import java.util.Objects;

public final class BaseInfo extends TextAndColorInfo<BaseInfo> {
    private String picFunction;
    private Boolean setMarginBottom;
    private Boolean setMarginTop;
    private Boolean showContentDivider;
    private Boolean showDivider;
    private Integer type;

    public BaseInfo setPicFunction(String picFunction) {
        this.picFunction = picFunction;
        return this;
    }

    public BaseInfo setSetMarginBottom(Boolean setMarginBottom) {
        this.setMarginBottom = setMarginBottom;
        return this;
    }

    public BaseInfo setSetMarginTop(Boolean setMarginTop) {
        this.setMarginTop = setMarginTop;
        return this;
    }

    public BaseInfo setShowContentDivider(Boolean showContentDivider) {
        this.showContentDivider = showContentDivider;
        return this;
    }

    public BaseInfo setShowDivider(Boolean showDivider) {
        this.showDivider = showDivider;
        return this;
    }

    public BaseInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BaseInfo baseInfo)) return false;
        return Objects.equals(picFunction, baseInfo.picFunction) && Objects.equals(setMarginBottom, baseInfo.setMarginBottom) && Objects.equals(setMarginTop, baseInfo.setMarginTop) && Objects.equals(showContentDivider, baseInfo.showContentDivider) && Objects.equals(showDivider, baseInfo.showDivider) && Objects.equals(type, baseInfo.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(picFunction, setMarginBottom, setMarginTop, showContentDivider,
            showDivider, type);
    }

    @Override
    @NonNull
    public String toString() {
        return "BaseInfo{" +
            "picFunction='" + picFunction + '\'' +
            ", setMarginBottom=" + setMarginBottom +
            ", setMarginTop=" + setMarginTop +
            ", showContentDivider=" + showContentDivider +
            ", showDivider=" + showDivider +
            ", type=" + type +
            '}';
    }
}
