package com.hchen.hyperislandapi.model.island;

import java.util.Objects;

public final class ImageTextInfo {
    private PicInfo picInfo;
    private ProgressInfo progressInfo;
    private TextInfo textInfo;
    private Integer type;

    public ImageTextInfo setPicInfo(PicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    public ImageTextInfo setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    public ImageTextInfo setTextInfo(TextInfo textInfo) {
        this.textInfo = textInfo;
        return this;
    }

    public ImageTextInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof ImageTextInfo that)) return false;
        return Objects.equals(picInfo, that.picInfo) && Objects.equals(progressInfo,
            that.progressInfo) && Objects.equals(textInfo, that.textInfo) && Objects.equals(type,
            that.type);
    }

    @Override public int hashCode() {
        return Objects.hash(picInfo, progressInfo, textInfo, type);
    }

    @Override public String toString() {
        return "ImageTextInfo{" +
            "picInfo=" + picInfo +
            ", progressInfo=" + progressInfo +
            ", textInfo=" + textInfo +
            ", type=" + type +
            '}';
    }
}
