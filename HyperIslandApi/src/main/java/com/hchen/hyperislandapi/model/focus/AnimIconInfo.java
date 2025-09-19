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

public final class AnimIconInfo extends TextAndColorInfo<AnimIconInfo> {
    private Boolean autoplay;
    private String effectColor;
    private String effectSrc;
    private Boolean loop;
    private Integer number;
    private String src;
    private String srcDark;
    private Integer type;

    public AnimIconInfo setAutoplay(Boolean autoplay) {
        this.autoplay = autoplay;
        return this;
    }

    public AnimIconInfo setEffectColor(String effectColor) {
        this.effectColor = effectColor;
        return this;
    }

    public AnimIconInfo setEffectSrc(String effectSrc) {
        this.effectSrc = effectSrc;
        return this;
    }

    public AnimIconInfo setLoop(Boolean loop) {
        this.loop = loop;
        return this;
    }

    public AnimIconInfo setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public AnimIconInfo setSrc(String src) {
        this.src = src;
        return this;
    }

    public AnimIconInfo setSrcDark(String srcDark) {
        this.srcDark = srcDark;
        return this;
    }

    public AnimIconInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AnimIconInfo that)) return false;
        return Objects.equals(autoplay, that.autoplay) && Objects.equals(effectColor,
            that.effectColor) && Objects.equals(effectSrc, that.effectSrc) && Objects.equals(loop
            , that.loop) && Objects.equals(number, that.number) && Objects.equals(src, that.src) && Objects.equals(srcDark, that.srcDark) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoplay, effectColor, effectSrc, loop, number, src, srcDark, type);
    }

    @Override
    @NonNull
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
            '}';
    }
}
