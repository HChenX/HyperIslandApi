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
package com.hchen.hyperislandapi.model.island;

import androidx.annotation.NonNull;

/**
 * 超级岛内的文字信息模块，包含标题、内容与数字相关的展示开关。
 */
public final class TextInfo {
    private String content;
    private String frontTitle;
    private Boolean isTitleDigit = Boolean.FALSE;
    private Boolean narrowFont = Boolean.FALSE;
    private Boolean showHighlightColor = Boolean.FALSE;
    private String title;
    private Boolean turnAnim = Boolean.FALSE;

    /** 设置正文内容。 */
    public TextInfo setContent(String content) {
        this.content = content;
        return this;
    }

    /** 设置前导标题。 */
    public TextInfo setFrontTitle(String frontTitle) {
        this.frontTitle = frontTitle;
        return this;
    }

    /** 设置内容是否为数字显示。 */
    public TextInfo setTitleDigit(Boolean titleDigit) {
        isTitleDigit = titleDigit;
        return this;
    }

    /** 设置是否使用窄字体。 */
    public TextInfo setNarrowFont(Boolean narrowFont) {
        this.narrowFont = narrowFont;
        return this;
    }

    /** 设置是否显示高亮颜色。 */
    public TextInfo setShowHighlightColor(Boolean showHighlightColor) {
        this.showHighlightColor = showHighlightColor;
        return this;
    }

    /** 设置主标题。 */
    public TextInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    /** 设置切换动画。 */
    public TextInfo setTurnAnim(Boolean turnAnim) {
        this.turnAnim = turnAnim;
        return this;
    }

    public String getContent() {
        return content;
    }

    public String getFrontTitle() {
        return frontTitle;
    }

    public Boolean getTitleDigit() {
        return isTitleDigit;
    }

    public Boolean getNarrowFont() {
        return narrowFont;
    }

    public Boolean getShowHighlightColor() {
        return showHighlightColor;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getTurnAnim() {
        return turnAnim;
    }

    @NonNull
    @Override
    public String toString() {
        return "TextInfo{" +
            "content='" + content + '\'' +
            ", frontTitle='" + frontTitle + '\'' +
            ", isTitleDigit=" + isTitleDigit +
            ", narrowFont=" + narrowFont +
            ", showHighlightColor=" + showHighlightColor +
            ", title='" + title + '\'' +
            ", turnAnim=" + turnAnim +
            '}';
    }
}
