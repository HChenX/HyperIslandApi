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

public final class SmallIslandArea {
    private CombinePicInfo combinePicInfo;
    private PicInfo picInfo;

    public SmallIslandArea setCombinePicInfo(CombinePicInfo combinePicInfo) {
        this.combinePicInfo = combinePicInfo;
        return this;
    }

    public SmallIslandArea setPicInfo(PicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    public CombinePicInfo getCombinePicInfo() {
        return combinePicInfo;
    }

    public PicInfo getPicInfo() {
        return picInfo;
    }

    @NonNull
    @Override
    public String toString() {
        return "SmallIslandArea{" +
            "combinePicInfo=" + combinePicInfo +
            ", picInfo=" + picInfo +
            '}';
    }
}
