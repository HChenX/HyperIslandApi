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
 * 动画图标信息，对应官方 {@code AnimIconInfo}，用于展示带动画效果的图标。
 * <p>
 * {@code number} 默认 {@code -1} 表示未设置动画帧数量；
 * {@code src} 为动画资源名，深色模式可用 {@code srcDark} 覆盖。
 */
public final class AnimIconInfo extends TextAndColorInfo<AnimIconInfo> {
    private Boolean autoplay;
    private String effectColor;
    private String effectSrc;
    private Boolean loop;
    private int number = -1;
    private String src;
    private String srcDark;
    private Integer type;

    /** 设置是否自动播放动画。 */
    public AnimIconInfo setAutoplay(Boolean autoplay) {
        this.autoplay = autoplay;
        return this;
    }

    /** 设置穿出效果颜色。 */
    public AnimIconInfo setEffectColor(String effectColor) {
        this.effectColor = effectColor;
        return this;
    }

    /** 设置穿出效果资源。 */
    public AnimIconInfo setEffectSrc(String effectSrc) {
        this.effectSrc = effectSrc;
        return this;
    }

    /** 设置是否循环播放动画。 */
    public AnimIconInfo setLoop(Boolean loop) {
        this.loop = loop;
        return this;
    }

    /** 设置动画帧数量，传 {@code -1} 表示未设置。 */
    public AnimIconInfo setNumber(Integer number) {
        this.number = number;
        return this;
    }

    /** 设置动画资源名。 */
    public AnimIconInfo setSrc(String src) {
        this.src = src;
        return this;
    }

    /** 设置深色模式动画资源名，未设置时官方回退到 {@code src}。 */
    public AnimIconInfo setSrcDark(String srcDark) {
        this.srcDark = srcDark;
        return this;
    }

    /** 设置动画类型：{@code 1} 视频、{@code 2} Shader。 */
    public AnimIconInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Boolean getAutoplay() {
        return autoplay;
    }

    public String getEffectColor() {
        return effectColor;
    }

    public String getEffectSrc() {
        return effectSrc;
    }

    public Boolean getLoop() {
        return loop;
    }

    public Integer getNumber() {
        return number;
    }

    public String getSrc() {
        return src;
    }

    public String getSrcDark() {
        return srcDark;
    }

    public Integer getType() {
        return type;
    }

    @NonNull
    @Override
    public String toString() {
        return "AnimIconInfo{" +
            "autoplay=" + autoplay +
            ", effectColor='" + effectColor + '\'' +
            ", effectSrc='" + effectSrc + '\'' +
            ", loop=" + loop +
            ", number=" + number +
            ", src='" + src + '\'' +
            ", srcDark='" + srcDark + '\'' +
            ", type=" + type +
            "} " + super.toString();
    }
}
