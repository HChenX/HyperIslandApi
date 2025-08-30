package com.hchen.hyperislandapi.model.island;

import java.util.Objects;

public final class SmallIslandArea {
    private CombinePicInfo combinePicInfo;
    private PicInfo picInfo;

    public SmallIslandArea setCombinePicInfo(CombinePicInfo combinePicInfo) {
        this.combinePicInfo = combinePicInfo;
        return this;
    }

    public SmallIslandArea setPicInfo(PicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof SmallIslandArea that)) return false;
        return Objects.equals(combinePicInfo, that.combinePicInfo) && Objects.equals(picInfo,
            that.picInfo);
    }

    @Override public int hashCode() {
        return Objects.hash(combinePicInfo, picInfo);
    }

    @Override public String toString() {
        return "SmallIslandArea{" +
            "combinePicInfo=" + combinePicInfo +
            ", picInfo=" + picInfo +
            '}';
    }
}
