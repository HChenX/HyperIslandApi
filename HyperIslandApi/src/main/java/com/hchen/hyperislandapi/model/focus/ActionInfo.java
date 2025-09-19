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

public final class ActionInfo {
    private String action;
    private String actionBgColor;
    private String actionBgColorDark;
    private String actionBgPressColor;
    private String actionBgPressColorDark;
    private String actionIcon;
    private String actionIconDark;
    private String actionIntent;
    private Integer actionIntentType;
    private String actionTitle;
    private String actionTitleColor;
    private String actionTitleColorDark;
    private boolean clickWithCollapse;
    private ProgressInfo progressInfo;
    private Integer type;

    public ActionInfo setAction(String action) {
        this.action = action;
        return this;
    }

    public ActionInfo setActionBgColor(String actionBgColor) {
        this.actionBgColor = actionBgColor;
        return this;
    }

    public ActionInfo setActionBgColorDark(String actionBgColorDark) {
        this.actionBgColorDark = actionBgColorDark;
        return this;
    }

    public ActionInfo setActionBgPressColor(String actionBgPressColor) {
        this.actionBgPressColor = actionBgPressColor;
        return this;
    }

    public ActionInfo setActionBgPressColorDark(String actionBgPressColorDark) {
        this.actionBgPressColorDark = actionBgPressColorDark;
        return this;
    }

    public ActionInfo setActionIcon(String actionIcon) {
        this.actionIcon = actionIcon;
        return this;
    }

    public ActionInfo setActionIconDark(String actionIconDark) {
        this.actionIconDark = actionIconDark;
        return this;
    }

    public ActionInfo setActionIntent(String actionIntent) {
        this.actionIntent = actionIntent;
        return this;
    }

    public ActionInfo setActionIntentType(Integer actionIntentType) {
        this.actionIntentType = actionIntentType;
        return this;
    }

    public ActionInfo setActionTitle(String actionTitle) {
        this.actionTitle = actionTitle;
        return this;
    }

    public ActionInfo setActionTitleColor(String actionTitleColor) {
        this.actionTitleColor = actionTitleColor;
        return this;
    }

    public ActionInfo setActionTitleColorDark(String actionTitleColorDark) {
        this.actionTitleColorDark = actionTitleColorDark;
        return this;
    }

    public ActionInfo setClickWithCollapse(boolean clickWithCollapse) {
        this.clickWithCollapse = clickWithCollapse;
        return this;
    }

    public ActionInfo setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    public ActionInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ActionInfo that)) return false;
        return clickWithCollapse == that.clickWithCollapse && Objects.equals(action, that.action) && Objects.equals(actionBgColor, that.actionBgColor) && Objects.equals(actionBgColorDark, that.actionBgColorDark) && Objects.equals(actionBgPressColor, that.actionBgPressColor) && Objects.equals(actionBgPressColorDark, that.actionBgPressColorDark) && Objects.equals(actionIcon, that.actionIcon) && Objects.equals(actionIconDark, that.actionIconDark) && Objects.equals(actionIntent, that.actionIntent) && Objects.equals(actionIntentType, that.actionIntentType) && Objects.equals(actionTitle, that.actionTitle) && Objects.equals(actionTitleColor, that.actionTitleColor) && Objects.equals(actionTitleColorDark, that.actionTitleColorDark) && Objects.equals(progressInfo, that.progressInfo) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, actionBgColor, actionBgColorDark, actionBgPressColor,
            actionBgPressColorDark, actionIcon, actionIconDark, actionIntent, actionIntentType,
            actionTitle, actionTitleColor, actionTitleColorDark, clickWithCollapse, progressInfo,
            type);
    }

    @Override
    @NonNull
    public String toString() {
        return "ActionInfo{" +
            "action='" + action + '\'' +
            ", actionBgColor='" + actionBgColor + '\'' +
            ", actionBgColorDark='" + actionBgColorDark + '\'' +
            ", actionBgPressColor='" + actionBgPressColor + '\'' +
            ", actionBgPressColorDark='" + actionBgPressColorDark + '\'' +
            ", actionIcon='" + actionIcon + '\'' +
            ", actionIconDark='" + actionIconDark + '\'' +
            ", actionIntent='" + actionIntent + '\'' +
            ", actionIntentType=" + actionIntentType +
            ", actionTitle='" + actionTitle + '\'' +
            ", actionTitleColor='" + actionTitleColor + '\'' +
            ", actionTitleColorDark='" + actionTitleColorDark + '\'' +
            ", clickWithCollapse=" + clickWithCollapse +
            ", progressInfo=" + progressInfo +
            ", type=" + type +
            '}';
    }
}
