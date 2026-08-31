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
 * 焦点通知的提示信息区，对应官方 {@code HintInfo}，用于补充提示文字或图片。
 */
public final class HintInfo extends TextAndColorInfo<HintInfo> {
    private ActionInfo actionInfo;
    private String colorContentBg;
    private String picContent;
    private TimerInfo timerInfo;
    private int titleLineCount;
    private Integer type;

    /** 设置提示区关联的动作信息。 */
    public HintInfo setActionInfo(ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }

    /** 设置内容背景颜色。 */
    public HintInfo setColorContentBg(String colorContentBg) {
        this.colorContentBg = colorContentBg;
        return this;
    }

    /** 设置提示图片 key。 */
    public HintInfo setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }

    /** 设置内嵌倒计时。 */
    public HintInfo setTimerInfo(TimerInfo timerInfo) {
        this.timerInfo = timerInfo;
        return this;
    }

    /** 设置标题显示行数。 */
    public HintInfo setTitleLineCount(int titleLineCount) {
        this.titleLineCount = titleLineCount;
        return this;
    }

    /** 设置提示信息类型：{@code 1} 简单、{@code 2} 复杂。 */
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

    @NonNull
    @Override
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
