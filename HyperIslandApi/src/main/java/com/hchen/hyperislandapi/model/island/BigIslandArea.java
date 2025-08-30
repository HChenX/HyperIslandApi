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

import java.util.Objects;

public final class BigIslandArea {
    private FixedWidthDigitInfo fixedWidthDigitInfo;
    private ImageTextInfo imageTextInfoLeft;
    private ImageTextInfo imageTextInfoRight;
    private PicInfo picInfo;
    private ProgressTextInfo progressTextInfo;
    private SameWidthDigitInfo sameWidthDigitInfo;
    private TextInfo textInfo;

    public BigIslandArea setFixedWidthDigitInfo(FixedWidthDigitInfo fixedWidthDigitInfo) {
        this.fixedWidthDigitInfo = fixedWidthDigitInfo;
        return this;
    }

    public BigIslandArea setImageTextInfoLeft(ImageTextInfo imageTextInfoLeft) {
        this.imageTextInfoLeft = imageTextInfoLeft;
        return this;
    }

    public BigIslandArea setImageTextInfoRight(ImageTextInfo imageTextInfoRight) {
        this.imageTextInfoRight = imageTextInfoRight;
        return this;
    }

    public BigIslandArea setPicInfo(PicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    public BigIslandArea setProgressTextInfo(ProgressTextInfo progressTextInfo) {
        this.progressTextInfo = progressTextInfo;
        return this;
    }

    public BigIslandArea setSameWidthDigitInfo(SameWidthDigitInfo sameWidthDigitInfo) {
        this.sameWidthDigitInfo = sameWidthDigitInfo;
        return this;
    }

    public BigIslandArea setTextInfo(TextInfo textInfo) {
        this.textInfo = textInfo;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof BigIslandArea that)) return false;
        return Objects.equals(fixedWidthDigitInfo, that.fixedWidthDigitInfo) && Objects.equals(imageTextInfoLeft, that.imageTextInfoLeft) && Objects.equals(imageTextInfoRight, that.imageTextInfoRight) && Objects.equals(picInfo, that.picInfo) && Objects.equals(progressTextInfo, that.progressTextInfo) && Objects.equals(sameWidthDigitInfo, that.sameWidthDigitInfo) && Objects.equals(textInfo, that.textInfo);
    }

    @Override public int hashCode() {
        return Objects.hash(fixedWidthDigitInfo, imageTextInfoLeft, imageTextInfoRight, picInfo,
            progressTextInfo, sameWidthDigitInfo, textInfo);
    }

    @Override public String toString() {
        return "BigIslandArea{" +
            "fixedWidthDigitInfo=" + fixedWidthDigitInfo +
            ", imageTextInfoLeft=" + imageTextInfoLeft +
            ", imageTextInfoRight=" + imageTextInfoRight +
            ", picInfo=" + picInfo +
            ", progressTextInfo=" + progressTextInfo +
            ", sameWidthDigitInfo=" + sameWidthDigitInfo +
            ", textInfo=" + textInfo +
            '}';
    }
}
