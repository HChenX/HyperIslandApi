package com.hchen.hyperislandapi.model.island;

import com.hchen.hyperislandapi.model.focus.PicInfo;

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
