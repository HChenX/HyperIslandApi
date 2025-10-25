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

public final class ProgressInfo {
    private String colorReach;
    private String colorUnReach;
    private Boolean isCCW = Boolean.FALSE;
    private Integer progress;

    public ProgressInfo setColorReach(String colorReach) {
        this.colorReach = colorReach;
        return this;
    }

    public ProgressInfo setColorUnReach(String colorUnReach) {
        this.colorUnReach = colorUnReach;
        return this;
    }

    public ProgressInfo setCCW(Boolean CCW) {
        isCCW = CCW;
        return this;
    }

    public ProgressInfo setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    public String getColorReach() {
        return colorReach;
    }

    public String getColorUnReach() {
        return colorUnReach;
    }

    public Boolean getCCW() {
        return isCCW;
    }

    public Integer getProgress() {
        return progress;
    }

    @NonNull
    @Override
    public String toString() {
        return "ProgressInfo{" +
            "colorReach='" + colorReach + '\'' +
            ", colorUnReach='" + colorUnReach + '\'' +
            ", isCCW=" + isCCW +
            ", progress=" + progress +
            '}';
    }
}
