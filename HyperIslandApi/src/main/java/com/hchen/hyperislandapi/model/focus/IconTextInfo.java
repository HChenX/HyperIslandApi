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
 * 图标与文字组合信息，对应官方 {@code IconTextInfo}，常与 {@code islandFirstFloat} 配合使用。
 */
public final class IconTextInfo extends TextAndColorInfo<IconTextInfo> {
    private AnimIconInfo animIconInfo;
    private Integer type;

    /** 设置动画图标信息。 */
    public IconTextInfo setAnimIconInfo(AnimIconInfo animIconInfo) {
        this.animIconInfo = animIconInfo;
        return this;
    }

    /** 设置展示类型。 */
    public IconTextInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public AnimIconInfo getAnimIconInfo() {
        return animIconInfo;
    }

    public Integer getType() {
        return type;
    }

    @NonNull
    @Override
    public String toString() {
        return "IconTextInfo{" +
            "animIconInfo=" + animIconInfo +
            ", type=" + type +
            "} " + super.toString();
    }
}
