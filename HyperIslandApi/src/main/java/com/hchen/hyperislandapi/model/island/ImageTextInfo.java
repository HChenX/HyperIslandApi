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
package com.hchen.hyperislandapi.model.island;

import java.util.Objects;

public final class ImageTextInfo {
    private PicInfo picInfo;
    private ProgressInfo progressInfo;
    private TextInfo textInfo;
    private Integer type;

    public ImageTextInfo setPicInfo(PicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    public ImageTextInfo setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    public ImageTextInfo setTextInfo(TextInfo textInfo) {
        this.textInfo = textInfo;
        return this;
    }

    public ImageTextInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof ImageTextInfo that)) return false;
        return Objects.equals(picInfo, that.picInfo) && Objects.equals(progressInfo,
            that.progressInfo) && Objects.equals(textInfo, that.textInfo) && Objects.equals(type,
            that.type);
    }

    @Override public int hashCode() {
        return Objects.hash(picInfo, progressInfo, textInfo, type);
    }

    @Override public String toString() {
        return "ImageTextInfo{" +
            "picInfo=" + picInfo +
            ", progressInfo=" + progressInfo +
            ", textInfo=" + textInfo +
            ", type=" + type +
            '}';
    }
}
