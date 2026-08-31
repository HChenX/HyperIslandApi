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

import androidx.annotation.NonNull;

/**
 * 会话（聊天）类焦点通知的信息区，对应官方 {@code ChatInfo}。
 * <p>
 * 包含聊天气泡的应用图标、头像与倒计时等配置。
 */
public final class ChatInfo extends TextAndColorInfo<ChatInfo> {
    private String appIconPkg;
    private String picProfile;
    private String picProfileDark;
    private TimerInfo timerInfo;

    /** 设置聊天应用的应用包名。 */
    public ChatInfo setAppIconPkg(String appIconPkg) {
        this.appIconPkg = appIconPkg;
        return this;
    }

    /** 设置聊天气泡头像图片 key。 */
    public ChatInfo setPicProfile(String picProfile) {
        this.picProfile = picProfile;
        return this;
    }

    /** 设置聊天气泡深色模式头像图片 key，未设置时官方回退到 {@code picProfile}。 */
    public ChatInfo setPicProfileDark(String picProfileDark) {
        this.picProfileDark = picProfileDark;
        return this;
    }

    /** 设置聊天气泡内嵌倒计时。 */
    public ChatInfo setTimerInfo(TimerInfo timerInfo) {
        this.timerInfo = timerInfo;
        return this;
    }

    public String getAppIconPkg() {
        return appIconPkg;
    }

    public String getPicProfile() {
        return picProfile;
    }

    public String getPicProfileDark() {
        return picProfileDark;
    }

    public TimerInfo getTimerInfo() {
        return timerInfo;
    }

    @NonNull
    @Override
    public String toString() {
        return "ChatInfo{" +
            "appIconPkg='" + appIconPkg + '\'' +
            ", picProfile='" + picProfile + '\'' +
            ", picProfileDark='" + picProfileDark + '\'' +
            ", timerInfo=" + timerInfo +
            "} " + super.toString();
    }
}
