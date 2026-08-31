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
 * 焦点通知的高亮信息区，对应官方 {@code HighlightInfo}，用于突出展示关键内容。
 * <p>
 * 常与 {@code timerInfo} 配合呈现倒计时场景，{@code type} 默认 {@code 1} 表示时间类型。
 */
public final class HighlightInfo extends TextAndColorInfo<HighlightInfo> {
    private String picFunction;
    private String picFunctionDark;
    private TimerInfo timerInfo;
    private int type = 1;

    /** 设置高亮图标图片 key。 */
    public HighlightInfo setPicFunction(String picFunction) {
        this.picFunction = picFunction;
        return this;
    }

    /** 设置深色模式高亮图标图片 key，未设置时官方回退到 {@code picFunction}。 */
    public HighlightInfo setPicFunctionDark(String picFunctionDark) {
        this.picFunctionDark = picFunctionDark;
        return this;
    }

    /** 设置内嵌倒计时。 */
    public HighlightInfo setTimerInfo(TimerInfo timerInfo) {
        this.timerInfo = timerInfo;
        return this;
    }

    /** 设置高亮类型：{@code 1} 时间、{@code 2} 竞技。 */
    public HighlightInfo setType(int type) {
        this.type = type;
        return this;
    }

    public String getPicFunction() {
        return picFunction;
    }

    public String getPicFunctionDark() {
        return picFunctionDark;
    }

    public TimerInfo getTimerInfo() {
        return timerInfo;
    }

    public int getType() {
        return type;
    }

    @NonNull
    @Override
    public String toString() {
        return "HighlightInfo{" +
            "picFunction='" + picFunction + '\'' +
            ", picFunctionDark='" + picFunctionDark + '\'' +
            ", timerInfo=" + timerInfo +
            ", type=" + type +
            "} " + super.toString();
    }
}
