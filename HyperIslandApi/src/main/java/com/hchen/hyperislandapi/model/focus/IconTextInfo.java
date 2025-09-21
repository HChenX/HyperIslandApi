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

import java.util.Objects;

public final class IconTextInfo extends TextAndColorInfo<IconTextInfo> {
    private AnimIconInfo animIconInfo;
    private Integer type;

    public IconTextInfo setAnimIconInfo(AnimIconInfo animIconInfo) {
        this.animIconInfo = animIconInfo;
        return this;
    }

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

    @Override public boolean equals(Object o) {
        if (!(o instanceof IconTextInfo that)) return false;
        return Objects.equals(animIconInfo, that.animIconInfo) && Objects.equals(type, that.type);
    }

    @Override public int hashCode() {
        return Objects.hash(animIconInfo, type);
    }

    @Override public String toString() {
        return "IconTextInfo{" +
            "animIconInfo=" + animIconInfo +
            ", type=" + type +
            "} " + super.toString();
    }
}
