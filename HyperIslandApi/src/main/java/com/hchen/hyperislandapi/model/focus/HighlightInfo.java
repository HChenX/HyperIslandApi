package com.hchen.hyperislandapi.model.focus;

import androidx.annotation.NonNull;

import java.util.Objects;

public final class HighlightInfo extends TextAndColorInfo {
    private String picFunction;
    private String picFunctionDark;
    private TimerInfo timerInfo;
    private int type = 1;

    public void setPicFunction(String picFunction) {
        this.picFunction = picFunction;
    }

    public void setPicFunctionDark(String picFunctionDark) {
        this.picFunctionDark = picFunctionDark;
    }

    public void setTimerInfo(TimerInfo timerInfo) {
        this.timerInfo = timerInfo;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof HighlightInfo that)) return false;
        return type == that.type &&
            Objects.equals(picFunction, that.picFunction) &&
            Objects.equals(picFunctionDark, that.picFunctionDark) &&
            Objects.equals(timerInfo, that.timerInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(picFunction, picFunctionDark, timerInfo, type);
    }

    @Override
    @NonNull
    public String toString() {
        return "HighlightInfo{" +
            "picFunction='" + picFunction + '\'' +
            ", picFunctionDark='" + picFunctionDark + '\'' +
            ", timerInfo=" + timerInfo +
            ", type=" + type +
            "} " + super.toString();
    }
}
