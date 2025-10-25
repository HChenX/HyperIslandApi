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

public class TextAndColorInfo<T extends TextAndColorInfo<T>> {
    private String colorContent;
    private String colorContentDark;
    private String colorExtraTitle;
    private String colorExtraTitleDark;
    private String colorSpecialBg;
    private String colorSpecialTitle;
    private String colorSpecialTitleDark;
    private String colorSubContent;
    private String colorSubContentDark;
    private String colorSubTitle;
    private String colorSubTitleDark;
    private String colorTitleDark;
    private String title = "";
    private String subTitle = "";
    private String extraTitle = "";
    private String specialTitle = "";
    private String content = "";
    private String subContent = "";
    private String colorTitle = "";

    public T setColorContent(String colorContent) {
        this.colorContent = colorContent;
        return (T) this;
    }

    public T setColorContentDark(String colorContentDark) {
        this.colorContentDark = colorContentDark;
        return (T) this;
    }

    public T setColorExtraTitle(String colorExtraTitle) {
        this.colorExtraTitle = colorExtraTitle;
        return (T) this;
    }

    public T setColorExtraTitleDark(String colorExtraTitleDark) {
        this.colorExtraTitleDark = colorExtraTitleDark;
        return (T) this;
    }

    public T setColorSpecialBg(String colorSpecialBg) {
        this.colorSpecialBg = colorSpecialBg;
        return (T) this;
    }

    public T setColorSpecialTitle(String colorSpecialTitle) {
        this.colorSpecialTitle = colorSpecialTitle;
        return (T) this;
    }

    public T setColorSpecialTitleDark(String colorSpecialTitleDark) {
        this.colorSpecialTitleDark = colorSpecialTitleDark;
        return (T) this;
    }

    public T setColorSubContent(String colorSubContent) {
        this.colorSubContent = colorSubContent;
        return (T) this;
    }

    public T setColorSubContentDark(String colorSubContentDark) {
        this.colorSubContentDark = colorSubContentDark;
        return (T) this;
    }

    public T setColorSubTitle(String colorSubTitle) {
        this.colorSubTitle = colorSubTitle;
        return (T) this;
    }

    public T setColorSubTitleDark(String colorSubTitleDark) {
        this.colorSubTitleDark = colorSubTitleDark;
        return (T) this;
    }

    public T setColorTitleDark(String colorTitleDark) {
        this.colorTitleDark = colorTitleDark;
        return (T) this;
    }

    public T setTitle(String title) {
        this.title = title;
        return (T) this;
    }

    public T setSubTitle(String subTitle) {
        this.subTitle = subTitle;
        return (T) this;
    }

    public T setExtraTitle(String extraTitle) {
        this.extraTitle = extraTitle;
        return (T) this;
    }

    public T setSpecialTitle(String specialTitle) {
        this.specialTitle = specialTitle;
        return (T) this;
    }

    public T setContent(String content) {
        this.content = content;
        return (T) this;
    }

    public T setSubContent(String subContent) {
        this.subContent = subContent;
        return (T) this;
    }

    public T setColorTitle(String colorTitle) {
        this.colorTitle = colorTitle;
        return (T) this;
    }

    public String getColorContent() {
        return colorContent;
    }

    public String getColorContentDark() {
        return colorContentDark;
    }

    public String getColorExtraTitle() {
        return colorExtraTitle;
    }

    public String getColorExtraTitleDark() {
        return colorExtraTitleDark;
    }

    public String getColorSpecialBg() {
        return colorSpecialBg;
    }

    public String getColorSpecialTitle() {
        return colorSpecialTitle;
    }

    public String getColorSpecialTitleDark() {
        return colorSpecialTitleDark;
    }

    public String getColorSubContent() {
        return colorSubContent;
    }

    public String getColorSubContentDark() {
        return colorSubContentDark;
    }

    public String getColorSubTitle() {
        return colorSubTitle;
    }

    public String getColorSubTitleDark() {
        return colorSubTitleDark;
    }

    public String getColorTitleDark() {
        return colorTitleDark;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getExtraTitle() {
        return extraTitle;
    }

    public String getSpecialTitle() {
        return specialTitle;
    }

    public String getContent() {
        return content;
    }

    public String getSubContent() {
        return subContent;
    }

    public String getColorTitle() {
        return colorTitle;
    }

    @NonNull
    @Override
    public String toString() {
        return "TextAndColorInfo{" +
            "colorContent='" + colorContent + '\'' +
            ", colorContentDark='" + colorContentDark + '\'' +
            ", colorExtraTitle='" + colorExtraTitle + '\'' +
            ", colorExtraTitleDark='" + colorExtraTitleDark + '\'' +
            ", colorSpecialBg='" + colorSpecialBg + '\'' +
            ", colorSpecialTitle='" + colorSpecialTitle + '\'' +
            ", colorSpecialTitleDark='" + colorSpecialTitleDark + '\'' +
            ", colorSubContent='" + colorSubContent + '\'' +
            ", colorSubContentDark='" + colorSubContentDark + '\'' +
            ", colorSubTitle='" + colorSubTitle + '\'' +
            ", colorSubTitleDark='" + colorSubTitleDark + '\'' +
            ", colorTitleDark='" + colorTitleDark + '\'' +
            ", title='" + title + '\'' +
            ", subTitle='" + subTitle + '\'' +
            ", extraTitle='" + extraTitle + '\'' +
            ", specialTitle='" + specialTitle + '\'' +
            ", content='" + content + '\'' +
            ", subContent='" + subContent + '\'' +
            ", colorTitle='" + colorTitle + '\'' +
            '}';
    }
}
