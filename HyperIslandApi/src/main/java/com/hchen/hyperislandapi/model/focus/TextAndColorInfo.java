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

import java.util.Objects;

public class TextAndColorInfo<T extends TextAndColorInfo<T>>  {
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
    private String title;
    private String subTitle;
    private String extraTitle;
    private String specialTitle;
    private String content;
    private String subContent;
    private String colorTitle;

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

    @Override public boolean equals(Object o) {
        if (!(o instanceof TextAndColorInfo<?> that)) return false;
        return Objects.equals(colorContent, that.colorContent) && Objects.equals(colorContentDark, that.colorContentDark) && Objects.equals(colorExtraTitle, that.colorExtraTitle) && Objects.equals(colorExtraTitleDark, that.colorExtraTitleDark) && Objects.equals(colorSpecialBg, that.colorSpecialBg) && Objects.equals(colorSpecialTitle, that.colorSpecialTitle) && Objects.equals(colorSpecialTitleDark, that.colorSpecialTitleDark) && Objects.equals(colorSubContent, that.colorSubContent) && Objects.equals(colorSubContentDark, that.colorSubContentDark) && Objects.equals(colorSubTitle, that.colorSubTitle) && Objects.equals(colorSubTitleDark, that.colorSubTitleDark) && Objects.equals(colorTitleDark, that.colorTitleDark) && Objects.equals(title, that.title) && Objects.equals(subTitle, that.subTitle) && Objects.equals(extraTitle, that.extraTitle) && Objects.equals(specialTitle, that.specialTitle) && Objects.equals(content, that.content) && Objects.equals(subContent, that.subContent) && Objects.equals(colorTitle, that.colorTitle);
    }

    @Override public int hashCode() {
        return Objects.hash(colorContent, colorContentDark, colorExtraTitle, colorExtraTitleDark, colorSpecialBg, colorSpecialTitle, colorSpecialTitleDark, colorSubContent, colorSubContentDark, colorSubTitle, colorSubTitleDark, colorTitleDark, title, subTitle, extraTitle, specialTitle, content, subContent, colorTitle);
    }

    @Override public String toString() {
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
