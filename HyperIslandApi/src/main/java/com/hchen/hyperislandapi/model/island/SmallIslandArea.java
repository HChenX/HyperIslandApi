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
 * 超级岛收起（小岛）区域的布局配置，对应官方 {@code IslandTemplate.smallIslandArea}。
 * <p>
 * 可配置普通图片或组合图片（主图、小图与进度）。
 */
public final class SmallIslandArea {
    private CombinePicInfo combinePicInfo;
    private PicInfo picInfo;

    /** 设置组合图片模块（主图、小图与进度）。 */
    public SmallIslandArea setCombinePicInfo(CombinePicInfo combinePicInfo) {
        this.combinePicInfo = combinePicInfo;
        return this;
    }

    /** 设置普通图片模块。 */
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
