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
 * 组合图片信息，用于小岛同时展示主图、小图与进度条的场景。
 */
public final class CombinePicInfo {
    private PicInfo picInfo;
    private ProgressInfo progressInfo;
    private PicInfo smallPicInfo;

    /** 设置主图信息。 */
    public CombinePicInfo setPicInfo(PicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    /** 设置主图进度条。 */
    public CombinePicInfo setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    /** 设置小图信息。 */
    public CombinePicInfo setSmallPicInfo(PicInfo smallPicInfo) {
        this.smallPicInfo = smallPicInfo;
        return this;
    }

    public PicInfo getPicInfo() {
        return picInfo;
    }

    public ProgressInfo getProgressInfo() {
        return progressInfo;
    }

    public PicInfo getSmallPicInfo() {
        return smallPicInfo;
    }

    @NonNull
    @Override
    public String toString() {
        return "CombinePicInfo{" +
            "picInfo=" + picInfo +
            ", progressInfo=" + progressInfo +
            ", smallPicInfo=" + smallPicInfo +
            '}';
    }
}
