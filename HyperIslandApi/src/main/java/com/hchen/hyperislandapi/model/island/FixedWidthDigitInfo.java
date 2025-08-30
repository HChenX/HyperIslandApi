package com.hchen.hyperislandapi.model.island;

import java.util.Objects;

public final class FixedWidthDigitInfo {
    private String content;
    private String digit;
    private Boolean showHighlightColor = Boolean.FALSE;
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

    @Override public boolean equals(Object o) {
        if (!(o instanceof FixedWidthDigitInfo that)) return false;
        return Objects.equals(content, that.content) && Objects.equals(digit, that.digit) && Objects.equals(showHighlightColor, that.showHighlightColor) && Objects.equals(turnAnim, that.turnAnim);
    }

    @Override public int hashCode() {
        return Objects.hash(content, digit, showHighlightColor, turnAnim);
    }

    @Override public String toString() {
        return "FixedWidthDigitInfo{" +
            "content='" + content + '\'' +
            ", digit='" + digit + '\'' +
            ", showHighlightColor=" + showHighlightColor +
            ", turnAnim=" + turnAnim +
            '}';
    }
}
