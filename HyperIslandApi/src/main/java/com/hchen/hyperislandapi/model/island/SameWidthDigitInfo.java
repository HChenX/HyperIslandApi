package com.hchen.hyperislandapi.model.island;

import java.util.Objects;

public final class SameWidthDigitInfo {
    private String content;
    private String digit;
    private Boolean showHighlightColor = Boolean.FALSE;
    private TimerInfo timerInfo;
    private Boolean turnAnim;

    public SameWidthDigitInfo setContent(String content) {
        this.content = content;
        return this;
    }

    public SameWidthDigitInfo setDigit(String digit) {
        this.digit = digit;
        return this;
    }

    public SameWidthDigitInfo setShowHighlightColor(Boolean showHighlightColor) {
        this.showHighlightColor = showHighlightColor;
        return this;
    }

    public SameWidthDigitInfo setTimerInfo(TimerInfo timerInfo) {
        this.timerInfo = timerInfo;
        return this;
    }

    public SameWidthDigitInfo setTurnAnim(Boolean turnAnim) {
        this.turnAnim = turnAnim;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof SameWidthDigitInfo that)) return false;
        return Objects.equals(content, that.content) && Objects.equals(digit, that.digit) && Objects.equals(showHighlightColor, that.showHighlightColor) && Objects.equals(timerInfo, that.timerInfo) && Objects.equals(turnAnim, that.turnAnim);
    }

    @Override public int hashCode() {
        return Objects.hash(content, digit, showHighlightColor, timerInfo, turnAnim);
    }

    @Override public String toString() {
        return "SameWidthDigitInfo{" +
            "content='" + content + '\'' +
            ", digit='" + digit + '\'' +
            ", showHighlightColor=" + showHighlightColor +
            ", timerInfo=" + timerInfo +
            ", turnAnim=" + turnAnim +
            '}';
    }
}
