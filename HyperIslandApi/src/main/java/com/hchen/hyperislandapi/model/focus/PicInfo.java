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

public final class PicInfo extends TextAndColorInfo<PicInfo> {
    private ActionInfo actionInfo;
    private String pic;
    private String picDark;
    private Integer type;

    public PicInfo setActionInfo(ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }

    public PicInfo setPic(String pic) {
        this.pic = pic;
        return this;
    }

    public PicInfo setPicDark(String picDark) {
        this.picDark = picDark;
        return this;
    }

    public PicInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PicInfo picInfo)) return false;
        return Objects.equals(actionInfo, picInfo.actionInfo) && Objects.equals(pic, picInfo.pic) && Objects.equals(picDark, picInfo.picDark) && Objects.equals(type, picInfo.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionInfo, pic, picDark, type);
    }

    @Override
    @NonNull
    public String toString() {
        return "PicInfo{" +
            "actionInfo=" + actionInfo +
            ", pic='" + pic + '\'' +
            ", picDark='" + picDark + '\'' +
            ", type=" + type +
            "} " + super.toString();
    }
}
