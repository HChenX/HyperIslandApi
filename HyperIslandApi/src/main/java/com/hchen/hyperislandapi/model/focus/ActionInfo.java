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
 * 焦点通知的动作按钮信息，对应官方 {@code ActionInfo}。
 * <p>
 * 一个动作包含动作标识、类型、图标、标题、手势意图等；
 * {@code action} 需与 {@code miui.focus.actions} Bundle 中的键一一对应。
 */
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

    /** 设置动作标识，需与 {@code miui.focus.actions} Bundle 中的键对应。 */
    public ActionInfo setAction(String action) {
        this.action = action;
        return this;
    }

    /** 设置动作按钮背景颜色。 */
    public ActionInfo setActionBgColor(String actionBgColor) {
        this.actionBgColor = actionBgColor;
        return this;
    }

    /** 设置深色模式动作按钮背景颜色。 */
    public ActionInfo setActionBgColorDark(String actionBgColorDark) {
        this.actionBgColorDark = actionBgColorDark;
        return this;
    }

    /** 设置动作按钮按压态背景颜色。 */
    public ActionInfo setActionBgPressColor(String actionBgPressColor) {
        this.actionBgPressColor = actionBgPressColor;
        return this;
    }

    /** 设置深色模式按压态背景颜色。 */
    public ActionInfo setActionBgPressColorDark(String actionBgPressColorDark) {
        this.actionBgPressColorDark = actionBgPressColorDark;
        return this;
    }

    /** 设置动作图标图片 key。 */
    public ActionInfo setActionIcon(String actionIcon) {
        this.actionIcon = actionIcon;
        return this;
    }

    /** 设置深色模式动作图标图片 key。 */
    public ActionInfo setActionIconDark(String actionIconDark) {
        this.actionIconDark = actionIconDark;
        return this;
    }

    /** 设置动作意图，内容为跳转的 URL、Action 或 Service 标识。 */
    public ActionInfo setActionIntent(String actionIntent) {
        this.actionIntent = actionIntent;
        return this;
    }

    /** 设置意图类型：{@code 1} URL、{@code 2} Action、{@code 3} Service。 */
    public ActionInfo setActionIntentType(Integer actionIntentType) {
        this.actionIntentType = actionIntentType;
        return this;
    }

    /** 设置动作按钮标题文字。 */
    public ActionInfo setActionTitle(String actionTitle) {
        this.actionTitle = actionTitle;
        return this;
    }

    /** 设置动作按钮标题颜色。 */
    public ActionInfo setActionTitleColor(String actionTitleColor) {
        this.actionTitleColor = actionTitleColor;
        return this;
    }

    /** 设置深色模式动作按钮标题颜色。 */
    public ActionInfo setActionTitleColorDark(String actionTitleColorDark) {
        this.actionTitleColorDark = actionTitleColorDark;
        return this;
    }

    /** 设置点击后是否收起岛。 */
    public ActionInfo setClickWithCollapse(boolean clickWithCollapse) {
        this.clickWithCollapse = clickWithCollapse;
        return this;
    }

    /** 设置动作内嵌进度条信息。 */
    public ActionInfo setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    /** 设置动作类型：{@code 0} 普通、{@code 1} 进度、{@code 2} 文字。 */
    public ActionInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getAction() {
        return action;
    }

    public String getActionBgColor() {
        return actionBgColor;
    }

    public String getActionBgColorDark() {
        return actionBgColorDark;
    }

    public String getActionBgPressColor() {
        return actionBgPressColor;
    }

    public String getActionBgPressColorDark() {
        return actionBgPressColorDark;
    }

    public String getActionIcon() {
        return actionIcon;
    }

    public String getActionIconDark() {
        return actionIconDark;
    }

    public String getActionIntent() {
        return actionIntent;
    }

    public Integer getActionIntentType() {
        return actionIntentType;
    }

    public String getActionTitle() {
        return actionTitle;
    }

    public String getActionTitleColor() {
        return actionTitleColor;
    }

    public String getActionTitleColorDark() {
        return actionTitleColorDark;
    }

    public boolean isClickWithCollapse() {
        return clickWithCollapse;
    }

    public ProgressInfo getProgressInfo() {
        return progressInfo;
    }

    public Integer getType() {
        return type;
    }

    @NonNull
    @Override
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
