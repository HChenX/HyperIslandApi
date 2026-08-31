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
 * 等宽数字信息，适用于计时等对数字宽度一致有要求的场景，可内嵌倒计时。
 */
public final class SameWidthDigitInfo {
    private String content;
    private String digit;
    private Boolean showHighlightColor = Boolean.FALSE;
    private TimerInfo timerInfo;
    private Boolean turnAnim;

    /** 设置附加文案。 */
    public SameWidthDigitInfo setContent(String content) {
        this.content = content;
        return this;
    }

    /** 设置数字字符。 */
    public SameWidthDigitInfo setDigit(String digit) {
        this.digit = digit;
        return this;
    }

    /** 设置是否显示高亮颜色。 */
    public SameWidthDigitInfo setShowHighlightColor(Boolean showHighlightColor) {
        this.showHighlightColor = showHighlightColor;
        return this;
    }

    /** 设置内嵌倒计时信息。 */
    public SameWidthDigitInfo setTimerInfo(TimerInfo timerInfo) {
        this.timerInfo = timerInfo;
        return this;
    }

    /** 设置切换动画。 */
    public SameWidthDigitInfo setTurnAnim(Boolean turnAnim) {
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

    public TimerInfo getTimerInfo() {
        return timerInfo;
    }

    public Boolean getTurnAnim() {
        return turnAnim;
    }

    @NonNull
    @Override
    public String toString() {
        return "SameWidthDigitInfo{" +
            "content='" + content + '\'' +
            ", digit='" + digit + '\'' +
            ", showHighlightColor=" + showHighlightColor +
            ", timerInfo=" + timerInfo +
            ", turnAnim=" + turnAnim +
            '}';
    }
}
