/*
 * This file is part of HyperIslandApi.
 *
 * HyperIslandApi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * HyperIslandApi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with HyperIslandApi. If not, see <https://www.gnu.org/licenses/lgpl-2.1>.
 *
 * Copyright (C) 2023–2025 HChenX
 */
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
