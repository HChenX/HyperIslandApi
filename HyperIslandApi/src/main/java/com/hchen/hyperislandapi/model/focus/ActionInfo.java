package com.hchen.hyperislandapi.model.focus;

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
    private boolean clickWithCollapse = false;
    private ProgressInfo progressInfo;
    private Integer type = 32767;

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

    @Override public boolean equals(Object o) {
        if (!(o instanceof ActionInfo that)) return false;
        return clickWithCollapse == that.clickWithCollapse && Objects.equals(action, that.action) && Objects.equals(actionBgColor, that.actionBgColor) && Objects.equals(actionBgColorDark, that.actionBgColorDark) && Objects.equals(actionBgPressColor, that.actionBgPressColor) && Objects.equals(actionBgPressColorDark, that.actionBgPressColorDark) && Objects.equals(actionIcon, that.actionIcon) && Objects.equals(actionIconDark, that.actionIconDark) && Objects.equals(actionIntent, that.actionIntent) && Objects.equals(actionIntentType, that.actionIntentType) && Objects.equals(actionTitle, that.actionTitle) && Objects.equals(actionTitleColor, that.actionTitleColor) && Objects.equals(actionTitleColorDark, that.actionTitleColorDark) && Objects.equals(progressInfo, that.progressInfo) && Objects.equals(type, that.type);
    }

    @Override public int hashCode() {
        return Objects.hash(action, actionBgColor, actionBgColorDark, actionBgPressColor,
            actionBgPressColorDark, actionIcon, actionIconDark, actionIntent, actionIntentType,
            actionTitle, actionTitleColor, actionTitleColorDark, clickWithCollapse, progressInfo,
            type);
    }

    @Override public String toString() {
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
