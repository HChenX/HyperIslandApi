package com.hchen.hyperislandapi.model.focus;

import java.util.Objects;

public final class BaseInfo {
    private String picFunction;
    private Boolean setMarginBottom = false;
    private Boolean setMarginTop = false;
    private Boolean showContentDivider = false;
    private Boolean showDivider = false;
    private Integer type;

    public BaseInfo setPicFunction(String picFunction) {
        this.picFunction = picFunction;
        return this;
    }

    public BaseInfo setSetMarginBottom(Boolean setMarginBottom) {
        this.setMarginBottom = setMarginBottom;
        return this;
    }

    public BaseInfo setSetMarginTop(Boolean setMarginTop) {
        this.setMarginTop = setMarginTop;
        return this;
    }

    public BaseInfo setShowContentDivider(Boolean showContentDivider) {
        this.showContentDivider = showContentDivider;
        return this;
    }

    public BaseInfo setShowDivider(Boolean showDivider) {
        this.showDivider = showDivider;
        return this;
    }

    public BaseInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof BaseInfo baseInfo)) return false;
        return Objects.equals(picFunction, baseInfo.picFunction) && Objects.equals(setMarginBottom, baseInfo.setMarginBottom) && Objects.equals(setMarginTop, baseInfo.setMarginTop) && Objects.equals(showContentDivider, baseInfo.showContentDivider) && Objects.equals(showDivider, baseInfo.showDivider) && Objects.equals(type, baseInfo.type);
    }

    @Override public int hashCode() {
        return Objects.hash(picFunction, setMarginBottom, setMarginTop, showContentDivider,
            showDivider, type);
    }

    @Override public String toString() {
        return "BaseInfo{" +
            "picFunction='" + picFunction + '\'' +
            ", setMarginBottom=" + setMarginBottom +
            ", setMarginTop=" + setMarginTop +
            ", showContentDivider=" + showContentDivider +
            ", showDivider=" + showDivider +
            ", type=" + type +
            '}';
    }
}
