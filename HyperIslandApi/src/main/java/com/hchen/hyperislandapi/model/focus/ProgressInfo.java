package com.hchen.hyperislandapi.model.focus;


import java.util.Objects;

public final class ProgressInfo {
    private String colorProgress;
    private String colorProgressDark;
    private String colorProgressEnd;
    private String colorProgressEndDark;
    private boolean isAutoProgress = false;
    private boolean isCCW = false;
    private String picEnd;
    private String picEndUnselected;
    private String picForward;
    private String picMiddle;
    private String picMiddleUnselected;
    private int progress;

    public ProgressInfo setColorProgress(String colorProgress) {
        this.colorProgress = colorProgress;
        return this;
    }

    public ProgressInfo setColorProgressDark(String colorProgressDark) {
        this.colorProgressDark = colorProgressDark;
        return this;
    }

    public ProgressInfo setColorProgressEnd(String colorProgressEnd) {
        this.colorProgressEnd = colorProgressEnd;
        return this;
    }

    public ProgressInfo setColorProgressEndDark(String colorProgressEndDark) {
        this.colorProgressEndDark = colorProgressEndDark;
        return this;
    }

    public ProgressInfo setAutoProgress(boolean autoProgress) {
        isAutoProgress = autoProgress;
        return this;
    }

    public ProgressInfo setCCW(boolean CCW) {
        isCCW = CCW;
        return this;
    }

    public ProgressInfo setPicEnd(String picEnd) {
        this.picEnd = picEnd;
        return this;
    }

    public ProgressInfo setPicEndUnselected(String picEndUnselected) {
        this.picEndUnselected = picEndUnselected;
        return this;
    }

    public ProgressInfo setPicForward(String picForward) {
        this.picForward = picForward;
        return this;
    }

    public ProgressInfo setPicMiddle(String picMiddle) {
        this.picMiddle = picMiddle;
        return this;
    }

    public ProgressInfo setPicMiddleUnselected(String picMiddleUnselected) {
        this.picMiddleUnselected = picMiddleUnselected;
        return this;
    }

    public ProgressInfo setProgress(int progress) {
        this.progress = progress;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof ProgressInfo that)) return false;
        return isAutoProgress == that.isAutoProgress && isCCW == that.isCCW && progress == that.progress && Objects.equals(colorProgress, that.colorProgress) && Objects.equals(colorProgressDark, that.colorProgressDark) && Objects.equals(colorProgressEnd, that.colorProgressEnd) && Objects.equals(colorProgressEndDark, that.colorProgressEndDark) && Objects.equals(picEnd, that.picEnd) && Objects.equals(picEndUnselected, that.picEndUnselected) && Objects.equals(picForward, that.picForward) && Objects.equals(picMiddle, that.picMiddle) && Objects.equals(picMiddleUnselected, that.picMiddleUnselected);
    }

    @Override public int hashCode() {
        return Objects.hash(colorProgress, colorProgressDark, colorProgressEnd,
            colorProgressEndDark, isAutoProgress, isCCW, picEnd, picEndUnselected, picForward,
            picMiddle, picMiddleUnselected, progress);
    }

    @Override public String toString() {
        return "ProgressInfo{" +
            "colorProgress='" + colorProgress + '\'' +
            ", colorProgressDark='" + colorProgressDark + '\'' +
            ", colorProgressEnd='" + colorProgressEnd + '\'' +
            ", colorProgressEndDark='" + colorProgressEndDark + '\'' +
            ", isAutoProgress=" + isAutoProgress +
            ", isCCW=" + isCCW +
            ", picEnd='" + picEnd + '\'' +
            ", picEndUnselected='" + picEndUnselected + '\'' +
            ", picForward='" + picForward + '\'' +
            ", picMiddle='" + picMiddle + '\'' +
            ", picMiddleUnselected='" + picMiddleUnselected + '\'' +
            ", progress=" + progress +
            '}';
    }
}
