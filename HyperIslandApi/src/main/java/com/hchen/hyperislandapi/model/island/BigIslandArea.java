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
 * 超级岛展开区域的布局配置，对应官方 {@code IslandTemplate.bigIslandArea}。
 * <p>
 * 可组合配置图片文字、纯图片、纯文字、进度文字、等宽/定宽数字等模块，
 * 各模块通常只配置一个即可。
 */
public final class BigIslandArea {
    private FixedWidthDigitInfo fixedWidthDigitInfo;
    private ImageTextInfo imageTextInfoLeft;
    private ImageTextInfo imageTextInfoRight;
    private PicInfo picInfo;
    private ProgressTextInfo progressTextInfo;
    private SameWidthDigitInfo sameWidthDigitInfo;
    private TextInfo textInfo;

    /** 设置定宽数字信息模块。 */
    public BigIslandArea setFixedWidthDigitInfo(FixedWidthDigitInfo fixedWidthDigitInfo) {
        this.fixedWidthDigitInfo = fixedWidthDigitInfo;
        return this;
    }

    /** 设置左侧图片文字模块。 */
    public BigIslandArea setImageTextInfoLeft(ImageTextInfo imageTextInfoLeft) {
        this.imageTextInfoLeft = imageTextInfoLeft;
        return this;
    }

    /** 设置右侧图片文字模块。 */
    public BigIslandArea setImageTextInfoRight(ImageTextInfo imageTextInfoRight) {
        this.imageTextInfoRight = imageTextInfoRight;
        return this;
    }

    /** 设置纯图片模块。 */
    public BigIslandArea setPicInfo(PicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    /** 设置进度文字模块。 */
    public BigIslandArea setProgressTextInfo(ProgressTextInfo progressTextInfo) {
        this.progressTextInfo = progressTextInfo;
        return this;
    }

    /** 设置等宽数字模块。 */
    public BigIslandArea setSameWidthDigitInfo(SameWidthDigitInfo sameWidthDigitInfo) {
        this.sameWidthDigitInfo = sameWidthDigitInfo;
        return this;
    }

    /** 设置纯文字模块。 */
    public BigIslandArea setTextInfo(TextInfo textInfo) {
        this.textInfo = textInfo;
        return this;
    }

    public FixedWidthDigitInfo getFixedWidthDigitInfo() {
        return fixedWidthDigitInfo;
    }

    public ImageTextInfo getImageTextInfoLeft() {
        return imageTextInfoLeft;
    }

    public ImageTextInfo getImageTextInfoRight() {
        return imageTextInfoRight;
    }

    public PicInfo getPicInfo() {
        return picInfo;
    }

    public ProgressTextInfo getProgressTextInfo() {
        return progressTextInfo;
    }

    public SameWidthDigitInfo getSameWidthDigitInfo() {
        return sameWidthDigitInfo;
    }

    public TextInfo getTextInfo() {
        return textInfo;
    }

    @NonNull
    @Override
    public String toString() {
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
