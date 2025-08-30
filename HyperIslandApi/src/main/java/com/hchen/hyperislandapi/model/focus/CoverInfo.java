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

public final class CoverInfo extends TextAndColorInfo<CoverInfo> {
    private String picCover;

    public CoverInfo setPicCover(String picCover) {
        this.picCover = picCover;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CoverInfo coverInfo)) return false;
        return Objects.equals(picCover, coverInfo.picCover);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(picCover);
    }

    @Override
    @NonNull
    public String toString() {
        return "CoverInfo{" +
            "picCover='" + picCover + '\'' +
            "} " + super.toString();
    }
}
