package com.hchen.hyperislandapi.model.island;

import java.util.Objects;

public final class ProgressInfo {
    private String colorReach;
    private String colorUnReach;
    private Boolean isCCW = Boolean.FALSE;
    private Integer progress;

    public ProgressInfo setColorReach(String colorReach) {
        this.colorReach = colorReach;
        return this;
    }

    public ProgressInfo setColorUnReach(String colorUnReach) {
        this.colorUnReach = colorUnReach;
        return this;
    }

    public ProgressInfo setCCW(Boolean CCW) {
        isCCW = CCW;
        return this;
    }

    public ProgressInfo setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof ProgressInfo that)) return false;
        return Objects.equals(colorReach, that.colorReach) && Objects.equals(colorUnReach,
            that.colorUnReach) && Objects.equals(isCCW, that.isCCW) && Objects.equals(progress,
            that.progress);
    }

    @Override public int hashCode() {
        return Objects.hash(colorReach, colorUnReach, isCCW, progress);
    }

    @Override public String toString() {
        return "ProgressInfo{" +
            "colorReach='" + colorReach + '\'' +
            ", colorUnReach='" + colorUnReach + '\'' +
            ", isCCW=" + isCCW +
            ", progress=" + progress +
            '}';
    }
}
