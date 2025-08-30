package com.hchen.hyperislandapi.model.island;

import java.util.Objects;

public final class CombinePicInfo {
    private PicInfo picInfo;
    private ProgressInfo progressInfo;
    private PicInfo smallPicInfo;

    public CombinePicInfo setPicInfo(PicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    public CombinePicInfo setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    public CombinePicInfo setSmallPicInfo(PicInfo smallPicInfo) {
        this.smallPicInfo = smallPicInfo;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof CombinePicInfo that)) return false;
        return Objects.equals(picInfo, that.picInfo) && Objects.equals(progressInfo,
            that.progressInfo) && Objects.equals(smallPicInfo, that.smallPicInfo);
    }

    @Override public int hashCode() {
        return Objects.hash(picInfo, progressInfo, smallPicInfo);
    }

    @Override public String toString() {
        return "CombinePicInfo{" +
            "picInfo=" + picInfo +
            ", progressInfo=" + progressInfo +
            ", smallPicInfo=" + smallPicInfo +
            '}';
    }
}
