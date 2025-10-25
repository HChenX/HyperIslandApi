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

public final class HighlightInfo extends TextAndColorInfo<HighlightInfo> {
    private String picFunction;
    private String picFunctionDark;
    private TimerInfo timerInfo;
    private int type = 1;

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
