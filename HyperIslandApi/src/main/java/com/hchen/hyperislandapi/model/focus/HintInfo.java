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

import java.util.Objects;

public final class HintInfo extends TextAndColorInfo<HintInfo> {
    private ActionInfo actionInfo;
    private String colorContentBg;
    private String picContent;
    private TimerInfo timerInfo;
    private int titleLineCount;
    private Integer type;

    public HintInfo setActionInfo(ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }

    public HintInfo setColorContentBg(String colorContentBg) {
        this.colorContentBg = colorContentBg;
        return this;
    }

    public HintInfo setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }

    public HintInfo setTimerInfo(TimerInfo timerInfo) {
        this.timerInfo = timerInfo;
        return this;
    }

    public HintInfo setTitleLineCount(int titleLineCount) {
        this.titleLineCount = titleLineCount;
        return this;
    }

    public HintInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public ActionInfo getActionInfo() {
        return actionInfo;
    }

    public String getColorContentBg() {
        return colorContentBg;
    }

    public String getPicContent() {
        return picContent;
    }

    public TimerInfo getTimerInfo() {
        return timerInfo;
    }

    public int getTitleLineCount() {
        return titleLineCount;
    }

    public Integer getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof HintInfo hintInfo)) return false;
        return titleLineCount == hintInfo.titleLineCount && Objects.equals(actionInfo, hintInfo.actionInfo) && Objects.equals(colorContentBg, hintInfo.colorContentBg) && Objects.equals(picContent, hintInfo.picContent) && Objects.equals(timerInfo, hintInfo.timerInfo) && Objects.equals(type, hintInfo.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionInfo, colorContentBg, picContent, timerInfo, titleLineCount, type);
    }

    @Override
    @NonNull
    public String toString() {
        return "HintInfo{" +
            "actionInfo=" + actionInfo +
            ", colorContentBg='" + colorContentBg + '\'' +
            ", picContent='" + picContent + '\'' +
            ", timerInfo=" + timerInfo +
            ", titleLineCount=" + titleLineCount +
            ", type=" + type +
            "} " + super.toString();
    }
}
