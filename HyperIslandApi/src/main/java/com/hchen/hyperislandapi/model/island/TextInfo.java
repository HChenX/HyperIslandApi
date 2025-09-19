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

import java.util.Objects;

public final class TextInfo {
    private String content;
    private String frontTitle;
    private Boolean isTitleDigit;
    private Boolean narrowFont;
    private Boolean showHighlightColor;
    private String title;
    private Boolean turnAnim;

    public TextInfo setContent(String content) {
        this.content = content;
        return this;
    }

    public TextInfo setFrontTitle(String frontTitle) {
        this.frontTitle = frontTitle;
        return this;
    }

    public TextInfo setTitleDigit(Boolean titleDigit) {
        isTitleDigit = titleDigit;
        return this;
    }

    public TextInfo setNarrowFont(Boolean narrowFont) {
        this.narrowFont = narrowFont;
        return this;
    }

    public TextInfo setShowHighlightColor(Boolean showHighlightColor) {
        this.showHighlightColor = showHighlightColor;
        return this;
    }

    public TextInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    public TextInfo setTurnAnim(Boolean turnAnim) {
        this.turnAnim = turnAnim;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TextInfo textInfo)) return false;
        return Objects.equals(content, textInfo.content) && Objects.equals(frontTitle,
            textInfo.frontTitle) && Objects.equals(isTitleDigit, textInfo.isTitleDigit) && Objects.equals(narrowFont, textInfo.narrowFont) && Objects.equals(showHighlightColor, textInfo.showHighlightColor) && Objects.equals(title, textInfo.title) && Objects.equals(turnAnim, textInfo.turnAnim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, frontTitle, isTitleDigit, narrowFont, showHighlightColor,
            title, turnAnim);
    }

    @Override
    @NonNull
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
