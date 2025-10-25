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

public final class ProgressInfo {
    private String colorProgress;
    private String colorProgressDark;
    private String colorProgressEnd;
    private String colorProgressEndDark;
    private boolean isAutoProgress;
    private boolean isCCW;
    private String picEnd;
    private String picEndUnselected;
    private String picForward;
    private String picMiddle;
    private String picMiddleUnselected;
    private int progress;

    public ProgressInfo setColorProgress(String colorProgress) {
        this.colorProgress = colorProgress;
        return this;
    }

    public ProgressInfo setColorProgressDark(String colorProgressDark) {
        this.colorProgressDark = colorProgressDark;
        return this;
    }

    public ProgressInfo setColorProgressEnd(String colorProgressEnd) {
        this.colorProgressEnd = colorProgressEnd;
        return this;
    }

    public ProgressInfo setColorProgressEndDark(String colorProgressEndDark) {
        this.colorProgressEndDark = colorProgressEndDark;
        return this;
    }

    public ProgressInfo setAutoProgress(boolean autoProgress) {
        isAutoProgress = autoProgress;
        return this;
    }

    public ProgressInfo setCCW(boolean CCW) {
        isCCW = CCW;
        return this;
    }

    public ProgressInfo setPicEnd(String picEnd) {
        this.picEnd = picEnd;
        return this;
    }

    public ProgressInfo setPicEndUnselected(String picEndUnselected) {
        this.picEndUnselected = picEndUnselected;
        return this;
    }

    public ProgressInfo setPicForward(String picForward) {
        this.picForward = picForward;
        return this;
    }

    public ProgressInfo setPicMiddle(String picMiddle) {
        this.picMiddle = picMiddle;
        return this;
    }

    public ProgressInfo setPicMiddleUnselected(String picMiddleUnselected) {
        this.picMiddleUnselected = picMiddleUnselected;
        return this;
    }

    public ProgressInfo setProgress(int progress) {
        this.progress = progress;
        return this;
    }

    public String getColorProgress() {
        return colorProgress;
    }

    public String getColorProgressDark() {
        return colorProgressDark;
    }

    public String getColorProgressEnd() {
        return colorProgressEnd;
    }

    public String getColorProgressEndDark() {
        return colorProgressEndDark;
    }

    public boolean isAutoProgress() {
        return isAutoProgress;
    }

    public boolean isCCW() {
        return isCCW;
    }

    public String getPicEnd() {
        return picEnd;
    }

    public String getPicEndUnselected() {
        return picEndUnselected;
    }

    public String getPicForward() {
        return picForward;
    }

    public String getPicMiddle() {
        return picMiddle;
    }

    public String getPicMiddleUnselected() {
        return picMiddleUnselected;
    }

    public int getProgress() {
        return progress;
    }

    @NonNull
    @Override
    public String toString() {
        return "ProgressInfo{" +
            "colorProgress='" + colorProgress + '\'' +
            ", colorProgressDark='" + colorProgressDark + '\'' +
            ", colorProgressEnd='" + colorProgressEnd + '\'' +
            ", colorProgressEndDark='" + colorProgressEndDark + '\'' +
            ", isAutoProgress=" + isAutoProgress +
            ", isCCW=" + isCCW +
            ", picEnd='" + picEnd + '\'' +
            ", picEndUnselected='" + picEndUnselected + '\'' +
            ", picForward='" + picForward + '\'' +
            ", picMiddle='" + picMiddle + '\'' +
            ", picMiddleUnselected='" + picMiddleUnselected + '\'' +
            ", progress=" + progress +
            '}';
    }
}
