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

import java.util.Objects;

public final class PicInfo {
    private Boolean autoplay;
    private String contentDescription;
    private String effectColor;
    private String effectSrc;
    private Boolean loop;
    private Integer number;
    private String pic;
    private Integer type;

    public PicInfo setAutoplay(Boolean autoplay) {
        this.autoplay = autoplay;
        return this;
    }

    public PicInfo setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
        return this;
    }

    public PicInfo setEffectColor(String effectColor) {
        this.effectColor = effectColor;
        return this;
    }

    public PicInfo setEffectSrc(String effectSrc) {
        this.effectSrc = effectSrc;
        return this;
    }

    public PicInfo setLoop(Boolean loop) {
        this.loop = loop;
        return this;
    }

    public PicInfo setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public PicInfo setPic(String pic) {
        this.pic = pic;
        return this;
    }

    public PicInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PicInfo picInfo)) return false;
        return Objects.equals(autoplay, picInfo.autoplay) && Objects.equals(contentDescription,
            picInfo.contentDescription) && Objects.equals(effectColor, picInfo.effectColor) && Objects.equals(effectSrc, picInfo.effectSrc) && Objects.equals(loop, picInfo.loop) && Objects.equals(number, picInfo.number) && Objects.equals(pic, picInfo.pic) && Objects.equals(type, picInfo.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoplay, contentDescription, effectColor, effectSrc, loop, number,
            pic, type);
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
