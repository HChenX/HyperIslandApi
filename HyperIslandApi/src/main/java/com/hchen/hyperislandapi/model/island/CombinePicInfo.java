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

public final class CombinePicInfo {
    private PicInfo picInfo;
    private ProgressInfo progressInfo;
    private PicInfo smallPicInfo;

    public CombinePicInfo setPicInfo(PicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    public CombinePicInfo setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

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
