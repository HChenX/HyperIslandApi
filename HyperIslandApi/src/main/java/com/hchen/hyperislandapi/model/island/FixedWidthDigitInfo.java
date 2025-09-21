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

public final class FixedWidthDigitInfo {
    private String content;
    private String digit;
    private Boolean showHighlightColor;
    private Boolean turnAnim;

    public FixedWidthDigitInfo setContent(String content) {
        this.content = content;
        return this;
    }

    public FixedWidthDigitInfo setDigit(String digit) {
        this.digit = digit;
        return this;
    }

    public FixedWidthDigitInfo setShowHighlightColor(Boolean showHighlightColor) {
        this.showHighlightColor = showHighlightColor;
        return this;
    }

    public FixedWidthDigitInfo setTurnAnim(Boolean turnAnim) {
        this.turnAnim = turnAnim;
        return this;
    }

    public String getContent() {
        return content;
    }

    public String getDigit() {
        return digit;
    }

    public Boolean getShowHighlightColor() {
        return showHighlightColor;
    }

    public Boolean getTurnAnim() {
        return turnAnim;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FixedWidthDigitInfo that)) return false;
        return Objects.equals(content, that.content) && Objects.equals(digit, that.digit) && Objects.equals(showHighlightColor, that.showHighlightColor) && Objects.equals(turnAnim, that.turnAnim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, digit, showHighlightColor, turnAnim);
    }

    @Override
    @NonNull
    public String toString() {
        return "FixedWidthDigitInfo{" +
            "content='" + content + '\'' +
            ", digit='" + digit + '\'' +
            ", showHighlightColor=" + showHighlightColor +
            ", turnAnim=" + turnAnim +
            '}';
    }
}
