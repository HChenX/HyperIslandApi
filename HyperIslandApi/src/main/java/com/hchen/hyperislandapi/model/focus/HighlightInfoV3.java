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

    public HighlightInfoV3 setActionInfo(ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }

    public HighlightInfoV3 setHighLightText(String highLightText) {
        this.highLightText = highLightText;
        return this;
    }

    public HighlightInfoV3 setHighLightTextColor(String highLightTextColor) {
        this.highLightTextColor = highLightTextColor;
        return this;
    }

    public HighlightInfoV3 setHighLightTextColorDark(String highLightTextColorDark) {
        this.highLightTextColorDark = highLightTextColorDark;
        return this;
    }

    public HighlightInfoV3 setHighLightbgColor(String highLightbgColor) {
        this.highLightbgColor = highLightbgColor;
        return this;
    }

    public HighlightInfoV3 setHighLightbgColorDark(String highLightbgColorDark) {
        this.highLightbgColorDark = highLightbgColorDark;
        return this;
    }

    public HighlightInfoV3 setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
        return this;
    }

    public HighlightInfoV3 setPrimaryColorDark(String primaryColorDark) {
        this.primaryColorDark = primaryColorDark;
        return this;
    }

    public HighlightInfoV3 setPrimaryText(String primaryText) {
        this.primaryText = primaryText;
        return this;
    }

    public HighlightInfoV3 setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
        return this;
    }

    public HighlightInfoV3 setSecondaryColorDark(String secondaryColorDark) {
        this.secondaryColorDark = secondaryColorDark;
        return this;
    }

    public HighlightInfoV3 setSecondaryText(String secondaryText) {
        this.secondaryText = secondaryText;
        return this;
    }

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
