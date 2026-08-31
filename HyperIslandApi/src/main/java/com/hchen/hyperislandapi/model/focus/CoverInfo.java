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
 * 焦点通知封面信息，对应官方 {@code CoverInfo}，通常用于媒体类通知的封面图。
 */
public final class CoverInfo extends TextAndColorInfo<CoverInfo> {
    private String picCover;

    /** 设置封面图片 key，需与 {@code miui.focus.pics} Bundle 中的键一致。 */
    public CoverInfo setPicCover(String picCover) {
        this.picCover = picCover;
        return this;
    }

    public String getPicCover() {
        return picCover;
    }

    @NonNull
    @Override
    public String toString() {
        return "CoverInfo{" +
            "picCover='" + picCover + '\'' +
            "} " + super.toString();
    }
}
