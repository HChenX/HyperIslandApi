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

public final class BgInfo {
    private String colorBg;
    private String picBg;
    private int type;

    public BgInfo setColorBg(String colorBg) {
        this.colorBg = colorBg;
        return this;
    }

    public BgInfo setPicBg(String picBg) {
        this.picBg = picBg;
        return this;
    }

    public BgInfo setType(int type) {
        this.type = type;
        return this;
    }

    public String getColorBg() {
        return colorBg;
    }

    public String getPicBg() {
        return picBg;
    }

    public int getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BgInfo bgInfo)) return false;
        return type == bgInfo.type && Objects.equals(colorBg, bgInfo.colorBg) && Objects.equals(picBg, bgInfo.picBg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorBg, picBg, type);
    }

    @Override
    @NonNull
    public String toString() {
        return "BgInfo{" +
            "colorBg='" + colorBg + '\'' +
            ", picBg='" + picBg + '\'' +
            ", type=" + type +
            '}';
    }
}
