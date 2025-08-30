package com.hchen.hyperislandapi.model.focus;

import androidx.annotation.NonNull;

import java.util.Objects;

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
    private Boolean showSecondaryLine;

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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof HighlightInfoV3 that)) return false;
        return Objects.equals(actionInfo, that.actionInfo) &&
            Objects.equals(highLightText, that.highLightText) &&
            Objects.equals(highLightTextColor, that.highLightTextColor) &&
            Objects.equals(highLightTextColorDark, that.highLightTextColorDark) &&
            Objects.equals(highLightbgColor, that.highLightbgColor) &&
            Objects.equals(highLightbgColorDark, that.highLightbgColorDark) &&
            Objects.equals(primaryColor, that.primaryColor) &&
            Objects.equals(primaryColorDark, that.primaryColorDark) &&
            Objects.equals(primaryText, that.primaryText) &&
            Objects.equals(secondaryColor, that.secondaryColor) &&
            Objects.equals(secondaryColorDark, that.secondaryColorDark) &&
            Objects.equals(secondaryText, that.secondaryText) &&
            Objects.equals(showSecondaryLine, that.showSecondaryLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionInfo, highLightText, highLightTextColor, highLightTextColorDark, highLightbgColor, highLightbgColorDark, primaryColor, primaryColorDark, primaryText, secondaryColor, secondaryColorDark, secondaryText, showSecondaryLine);
    }

    @Override
    @NonNull
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
