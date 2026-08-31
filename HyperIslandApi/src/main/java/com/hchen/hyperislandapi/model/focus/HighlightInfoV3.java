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
 * V3 高亮信息区，对应官方 {@code HighlightInfoV3}，用于双文案高亮展示。
 * <p>
 * 通过 {@code primaryText}/{@code secondaryText} 提供主副两行文案，
 * 字段名为官方原始命名（注意 {@code highLight} 中的大写 {@code L} 与
 * {@code highLightbgColor} 中的小写 {@code bg}），不可修改以免序列化错位。
 */
public final class HighlightInfoV3 extends TextAndColorInfo<HighlightInfoV3> {
    private ActionInfo actionInfo;
    private String highLightText;
    private String highLightTextColor;
    private String highLightTextColorDark;
    private String highLightbgColor;
    private String highLightbgColorDark;
    private String primaryColor;
    private String primaryColorDark;
    private String primaryText;
    private String secondaryColor;
    private String secondaryColorDark;
    private String secondaryText;
    private Boolean showSecondaryLine = Boolean.FALSE;

    /** 设置高亮区关联的动作信息。 */
    public HighlightInfoV3 setActionInfo(ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }

    /** 设置高亮文案。 */
    public HighlightInfoV3 setHighLightText(String highLightText) {
        this.highLightText = highLightText;
        return this;
    }

    /** 设置高亮文案颜色。 */
    public HighlightInfoV3 setHighLightTextColor(String highLightTextColor) {
        this.highLightTextColor = highLightTextColor;
        return this;
    }

    /** 设置深色模式高亮文案颜色。 */
    public HighlightInfoV3 setHighLightTextColorDark(String highLightTextColorDark) {
        this.highLightTextColorDark = highLightTextColorDark;
        return this;
    }

    /** 设置高亮背景颜色。 */
    public HighlightInfoV3 setHighLightbgColor(String highLightbgColor) {
        this.highLightbgColor = highLightbgColor;
        return this;
    }

    /** 设置深色模式高亮背景颜色。 */
    public HighlightInfoV3 setHighLightbgColorDark(String highLightbgColorDark) {
        this.highLightbgColorDark = highLightbgColorDark;
        return this;
    }

    /** 设置主文案主题色。 */
    public HighlightInfoV3 setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
        return this;
    }

    /** 设置深色模式主文案主题色。 */
    public HighlightInfoV3 setPrimaryColorDark(String primaryColorDark) {
        this.primaryColorDark = primaryColorDark;
        return this;
    }

    /** 设置主文案内容。 */
    public HighlightInfoV3 setPrimaryText(String primaryText) {
        this.primaryText = primaryText;
        return this;
    }

    /** 设置副文案主题色。 */
    public HighlightInfoV3 setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
        return this;
    }

    /** 设置深色模式副文案主题色。 */
    public HighlightInfoV3 setSecondaryColorDark(String secondaryColorDark) {
        this.secondaryColorDark = secondaryColorDark;
        return this;
    }

    /** 设置副文案内容。 */
    public HighlightInfoV3 setSecondaryText(String secondaryText) {
        this.secondaryText = secondaryText;
        return this;
    }

    /** 设置是否显示副文案分隔线。 */
    public HighlightInfoV3 setShowSecondaryLine(Boolean showSecondaryLine) {
        this.showSecondaryLine = showSecondaryLine;
        return this;
    }

    public ActionInfo getActionInfo() {
        return actionInfo;
    }

    public String getHighLightText() {
        return highLightText;
    }

    public String getHighLightTextColor() {
        return highLightTextColor;
    }

    public String getHighLightTextColorDark() {
        return highLightTextColorDark;
    }

    public String getHighLightbgColor() {
        return highLightbgColor;
    }

    public String getHighLightbgColorDark() {
        return highLightbgColorDark;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public String getPrimaryColorDark() {
        return primaryColorDark;
    }

    public String getPrimaryText() {
        return primaryText;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public String getSecondaryColorDark() {
        return secondaryColorDark;
    }

    public String getSecondaryText() {
        return secondaryText;
    }

    public Boolean getShowSecondaryLine() {
        return showSecondaryLine;
    }

    @NonNull
    @Override
    public String toString() {
        return "HighlightInfoV3{" +
            "actionInfo=" + actionInfo +
            ", highLightText='" + highLightText + '\'' +
            ", highLightTextColor='" + highLightTextColor + '\'' +
            ", highLightTextColorDark='" + highLightTextColorDark + '\'' +
            ", highLightbgColor='" + highLightbgColor + '\'' +
            ", highLightbgColorDark='" + highLightbgColorDark + '\'' +
            ", primaryColor='" + primaryColor + '\'' +
            ", primaryColorDark='" + primaryColorDark + '\'' +
            ", primaryText='" + primaryText + '\'' +
            ", secondaryColor='" + secondaryColor + '\'' +
            ", secondaryColorDark='" + secondaryColorDark + '\'' +
            ", secondaryText='" + secondaryText + '\'' +
            ", showSecondaryLine=" + showSecondaryLine +
            "} " + super.toString();
    }
}
