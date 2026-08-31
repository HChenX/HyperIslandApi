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
 * 多段进度信息，对应官方 {@code MultiProgressInfo}，用于分段进度展示。
 * <p>
 * {@code progress} 默认 {@code -1} 表示未设置，{@code points} 为分段数量。
 */
public final class MultiProgressInfo extends TextAndColorInfo<MultiProgressInfo> {
    private String color;
    private int points;
    private int progress = -1;

    /** 设置进度条颜色。 */
    public MultiProgressInfo setColor(String color) {
        this.color = color;
        return this;
    }

    /** 设置分段数量。 */
    public MultiProgressInfo setPoints(int points) {
        this.points = points;
        return this;
    }

    /** 设置当前进度，传 {@code -1} 表示未设置。 */
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
