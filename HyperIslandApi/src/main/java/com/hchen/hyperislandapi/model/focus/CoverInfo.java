package com.hchen.hyperislandapi.model.focus;

import androidx.annotation.NonNull;

import java.util.Objects;

public final class CoverInfo extends TextAndColorInfo<CoverInfo> {
    private String picCover;

    public CoverInfo setPicCover(String picCover) {
        this.picCover = picCover;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CoverInfo coverInfo)) return false;
        return Objects.equals(picCover, coverInfo.picCover);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(picCover);
    }

    @Override
    @NonNull
    public String toString() {
        return "CoverInfo{" +
            "picCover='" + picCover + '\'' +
            "} " + super.toString();
    }
}
