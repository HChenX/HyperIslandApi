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
 * 定宽数字信息，适用于倒计时等要求数字等宽对齐的场景。
 * <p>
 * {@code digit} 指定每个数字字符展示内容，{@code content} 为附加文案，
 * {@code pic} 可为数字展示指定图片 key。
 */
public final class FixedWidthDigitInfo {
    private String content;
    private String digit;
    private String pic;
    private Boolean showHighlightColor = Boolean.FALSE;
    private Boolean turnAnim;

    /** 设置附加文案。 */
    public FixedWidthDigitInfo setContent(String content) {
        this.content = content;
        return this;
    }

    /** 设置数字字符。 */
    public FixedWidthDigitInfo setDigit(String digit) {
        this.digit = digit;
        return this;
    }

    /** 设置图片 key。 */
    public FixedWidthDigitInfo setPic(String pic) {
        this.pic = pic;
        return this;
    }

    /** 设置是否显示高亮颜色。 */
    public FixedWidthDigitInfo setShowHighlightColor(Boolean showHighlightColor) {
        this.showHighlightColor = showHighlightColor;
        return this;
    }

    /** 设置切换动画。 */
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

    public String getPic() {
        return pic;
    }

    public Boolean getShowHighlightColor() {
        return showHighlightColor;
    }

    public Boolean getTurnAnim() {
        return turnAnim;
    }

    @NonNull
    @Override
    public String toString() {
        return "FixedWidthDigitInfo{" +
            "content='" + content + '\'' +
            ", digit='" + digit + '\'' +
            ", pic='" + pic + '\'' +
            ", showHighlightColor=" + showHighlightColor +
            ", turnAnim=" + turnAnim +
            '}';
    }
}
