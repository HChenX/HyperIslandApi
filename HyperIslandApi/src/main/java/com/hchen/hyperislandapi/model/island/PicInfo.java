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
 * 超级岛内的图片信息，对应官方 {@code miui.systemui.dynamicisland.model.PicInfo}。
 * <p>
 * {@code pic} 为与 {@code miui.focus.pics} Bundle 中键一致的字符串；
 * {@code number} 默认 {@code -1} 表示未设置帧数量。
 */
public final class PicInfo {
    private Boolean autoplay = Boolean.FALSE;
    private String contentDescription;
    private String effectColor;
    private String effectSrc;
    private Boolean loop = Boolean.FALSE;
    private int number = -1;
    private String pic;
    private Integer type;

    /** 设置是否自动播放。 */
    public PicInfo setAutoplay(Boolean autoplay) {
        this.autoplay = autoplay;
        return this;
    }

    /** 设置图片内容描述，用于无障碍播报。 */
    public PicInfo setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
        return this;
    }

    /** 设置穿出效果颜色。 */
    public PicInfo setEffectColor(String effectColor) {
        this.effectColor = effectColor;
        return this;
    }

    /** 设置穿出效果资源。 */
    public PicInfo setEffectSrc(String effectSrc) {
        this.effectSrc = effectSrc;
        return this;
    }

    /** 设置是否循环播放。 */
    public PicInfo setLoop(Boolean loop) {
        this.loop = loop;
        return this;
    }

    /** 设置动画帧数量，传 {@code -1} 表示未设置。 */
    public PicInfo setNumber(Integer number) {
        this.number = number;
        return this;
    }

    /** 设置图片 key，需与 {@code miui.focus.pics} Bundle 中的键一致。 */
    public PicInfo setPic(String pic) {
        this.pic = pic;
        return this;
    }

    /** 设置图片类型。 */
    public PicInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Boolean getAutoplay() {
        return autoplay;
    }

    public String getContentDescription() {
        return contentDescription;
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

    public String getPic() {
        return pic;
    }

    public Integer getType() {
        return type;
    }

    @Override
    @NonNull
    public String toString() {
        return "PicInfo{" +
            "autoplay=" + autoplay +
            ", contentDescription='" + contentDescription + '\'' +
            ", effectColor='" + effectColor + '\'' +
            ", effectSrc='" + effectSrc + '\'' +
            ", loop=" + loop +
            ", number=" + number +
            ", pic='" + pic + '\'' +
            ", type=" + type +
            '}';
    }
}
