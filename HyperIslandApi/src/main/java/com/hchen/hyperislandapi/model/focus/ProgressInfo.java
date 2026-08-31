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
 * 焦点通知中的进度条信息，对应官方 {@code ProgressInfo}。
 * <p>
 * 支持纯进度条与自定义首尾图片进度条，并可按进度方向（顺时针/逆时针）展示。
 */
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

    /** 设置进度条颜色。 */
    public ProgressInfo setColorProgress(String colorProgress) {
        this.colorProgress = colorProgress;
        return this;
    }

    /** 设置深色模式进度条颜色。 */
    public ProgressInfo setColorProgressDark(String colorProgressDark) {
        this.colorProgressDark = colorProgressDark;
        return this;
    }

    /** 设置进度条终点颜色。 */
    public ProgressInfo setColorProgressEnd(String colorProgressEnd) {
        this.colorProgressEnd = colorProgressEnd;
        return this;
    }

    /** 设置深色模式进度条终点颜色。 */
    public ProgressInfo setColorProgressEndDark(String colorProgressEndDark) {
        this.colorProgressEndDark = colorProgressEndDark;
        return this;
    }

    /** 设置是否自动推进进度。 */
    public ProgressInfo setAutoProgress(boolean autoProgress) {
        isAutoProgress = autoProgress;
        return this;
    }

    /** 设置是否逆时针填充。 */
    public ProgressInfo setCCW(boolean CCW) {
        isCCW = CCW;
        return this;
    }

    /** 设置进度条终点图片 key。 */
    public ProgressInfo setPicEnd(String picEnd) {
        this.picEnd = picEnd;
        return this;
    }

    /** 设置进度条终点未选中态图片 key。 */
    public ProgressInfo setPicEndUnselected(String picEndUnselected) {
        this.picEndUnselected = picEndUnselected;
        return this;
    }

    /** 设置进度条起始图片 key。 */
    public ProgressInfo setPicForward(String picForward) {
        this.picForward = picForward;
        return this;
    }

    /** 设置进度条中间图片 key。 */
    public ProgressInfo setPicMiddle(String picMiddle) {
        this.picMiddle = picMiddle;
        return this;
    }

    /** 设置进度条中间未选中态图片 key。 */
    public ProgressInfo setPicMiddleUnselected(String picMiddleUnselected) {
        this.picMiddleUnselected = picMiddleUnselected;
        return this;
    }

    /** 设置进度值，负数会被官方读取端钳制为 0。 */
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
