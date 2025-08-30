package com.hchen.hyperislandapi.model.focus;

import java.util.Objects;

public final class PicInfo extends TextAndColorInfo<PicInfo> {
    private ActionInfo actionInfo;
    private String pic;
    private String picDark;
    private Integer type;

    public PicInfo setActionInfo(ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }

    public PicInfo setPic(String pic) {
        this.pic = pic;
        return this;
    }

    public PicInfo setPicDark(String picDark) {
        this.picDark = picDark;
        return this;
    }

    public PicInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof PicInfo picInfo)) return false;
        return Objects.equals(actionInfo, picInfo.actionInfo) && Objects.equals(pic, picInfo.pic) && Objects.equals(picDark, picInfo.picDark) && Objects.equals(type, picInfo.type);
    }

    @Override public int hashCode() {
        return Objects.hash(actionInfo, pic, picDark, type);
    }

    @Override public String toString() {
        return "PicInfo{" +
            "actionInfo=" + actionInfo +
            ", pic='" + pic + '\'' +
            ", picDark='" + picDark + '\'' +
            ", type=" + type +
            "} " + super.toString();
    }
}
