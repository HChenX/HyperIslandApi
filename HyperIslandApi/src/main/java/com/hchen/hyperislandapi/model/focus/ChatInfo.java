package com.hchen.hyperislandapi.model.focus;

import java.util.Objects;

public final class ChatInfo extends TextAndColorInfo<ChatInfo> {
    private String appIconPkg;
    private String picProfile;
    private String picProfileDark;
    private TimerInfo timerInfo;

    public ChatInfo setAppIconPkg(String appIconPkg) {
        this.appIconPkg = appIconPkg;
        return this;
    }

    public ChatInfo setPicProfile(String picProfile) {
        this.picProfile = picProfile;
        return this;
    }

    public ChatInfo setPicProfileDark(String picProfileDark) {
        this.picProfileDark = picProfileDark;
        return this;
    }

    public ChatInfo setTimerInfo(TimerInfo timerInfo) {
        this.timerInfo = timerInfo;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof ChatInfo chatInfo)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(appIconPkg, chatInfo.appIconPkg) && Objects.equals(picProfile,
            chatInfo.picProfile) && Objects.equals(picProfileDark, chatInfo.picProfileDark) && Objects.equals(timerInfo, chatInfo.timerInfo);
    }

    @Override public int hashCode() {
        return Objects.hash(super.hashCode(), appIconPkg, picProfile, picProfileDark, timerInfo);
    }

    @Override public String toString() {
        return "ChatInfo{" +
            "appIconPkg='" + appIconPkg + '\'' +
            ", picProfile='" + picProfile + '\'' +
            ", picProfileDark='" + picProfileDark + '\'' +
            ", timerInfo=" + timerInfo +
            "} " + super.toString();
    }
}
