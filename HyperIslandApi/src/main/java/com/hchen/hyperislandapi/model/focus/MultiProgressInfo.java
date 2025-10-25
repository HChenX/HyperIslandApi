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

public final class MultiProgressInfo extends TextAndColorInfo<MultiProgressInfo> {
    private String color;
    private int points;
    private int progress;

    public MultiProgressInfo setColor(String color) {
        this.color = color;
        return this;
    }

    public MultiProgressInfo setPoints(int points) {
        this.points = points;
        return this;
    }

    public MultiProgressInfo setProgress(int progress) {
        this.progress = progress;
        return this;
    }

    public String getColor() {
        return color;
    }

    public int getPoints() {
        return points;
    }

    public int getProgress() {
        return progress;
    }

    @NonNull
    @Override
    public String toString() {
        return "MultiProgressInfo{" +
            "color='" + color + '\'' +
            ", points=" + points +
            ", progress=" + progress +
            "} " + super.toString();
    }
}
