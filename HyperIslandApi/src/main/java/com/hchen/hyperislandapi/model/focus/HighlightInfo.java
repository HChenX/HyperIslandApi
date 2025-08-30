package com.hchen.hyperislandapi.model.focus;

import androidx.annotation.NonNull;

import java.util.Objects;

public final class HighlightInfo extends TextAndColorInfo<HighlightInfo> {
    private String picFunction;
    private String picFunctionDark;
    private TimerInfo timerInfo;
    private int type;

    public HighlightInfo setPicFunction(String picFunction) {
        this.picFunction = picFunction;
        return this;
    }

    public HighlightInfo setPicFunctionDark(String picFunctionDark) {
        this.picFunctionDark = picFunctionDark;
        return this;
    }

    public HighlightInfo setTimerInfo(TimerInfo timerInfo) {
        this.timerInfo = timerInfo;
        return this;
    }

    public HighlightInfo setType(int type) {
        this.type = type;
        return this;
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
