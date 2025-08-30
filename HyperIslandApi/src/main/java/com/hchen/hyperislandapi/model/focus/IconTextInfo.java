package com.hchen.hyperislandapi.model.focus;


import java.util.Objects;

public final class IconTextInfo extends TextAndColorInfo {
    private AnimIconInfo animIconInfo;
    private Integer type;

    public IconTextInfo setAnimIconInfo(AnimIconInfo animIconInfo) {
        this.animIconInfo = animIconInfo;
        return this;
    }

    public IconTextInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof IconTextInfo that)) return false;
        return Objects.equals(animIconInfo, that.animIconInfo) && Objects.equals(type, that.type);
    }

    @Override public int hashCode() {
        return Objects.hash(animIconInfo, type);
    }

    @Override public String toString() {
        return "IconTextInfo{" +
            "animIconInfo=" + animIconInfo +
            ", type=" + type +
            "} " + super.toString();
    }
}
