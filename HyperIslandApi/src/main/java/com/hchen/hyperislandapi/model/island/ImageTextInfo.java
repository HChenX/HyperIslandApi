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

import androidx.annotation.NonNull;

/**
 * 图片与文字组合模块，用于岛内图片、文字、进度同时展示的布局。
 * <p>
 * {@code type} 决定模块的展示类型，其余字段按需配置。
 */
public final class ImageTextInfo {
    private PicInfo picInfo;
    private ProgressInfo progressInfo;
    private TextInfo textInfo;
    private Integer type;

    /** 设置图片信息。 */
    public ImageTextInfo setPicInfo(PicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    /** 设置进度条信息。 */
    public ImageTextInfo setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    /** 设置文字信息。 */
    public ImageTextInfo setTextInfo(TextInfo textInfo) {
        this.textInfo = textInfo;
        return this;
    }

    /** 设置模块展示类型。 */
    public ImageTextInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public PicInfo getPicInfo() {
        return picInfo;
    }

    public ProgressInfo getProgressInfo() {
        return progressInfo;
    }

    public TextInfo getTextInfo() {
        return textInfo;
    }

    public Integer getType() {
        return type;
    }

    @NonNull
    @Override
    public String toString() {
        return "ImageTextInfo{" +
            "picInfo=" + picInfo +
            ", progressInfo=" + progressInfo +
            ", textInfo=" + textInfo +
            ", type=" + type +
            '}';
    }
}
