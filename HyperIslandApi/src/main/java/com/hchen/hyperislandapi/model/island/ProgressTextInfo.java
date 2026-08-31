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
 * 进度与文字组合模块，将 {@link ProgressInfo} 与 {@link TextInfo} 一同展示。
 */
public final class ProgressTextInfo {
    private ProgressInfo progressInfo;
    private TextInfo textInfo;

    /** 设置进度条信息。 */
    public ProgressTextInfo setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    /** 设置文字信息。 */
    public ProgressTextInfo setTextInfo(TextInfo textInfo) {
        this.textInfo = textInfo;
        return this;
    }

    public ProgressInfo getProgressInfo() {
        return progressInfo;
    }

    public TextInfo getTextInfo() {
        return textInfo;
    }

    @Override
    @NonNull
    public String toString() {
        return "ProgressTextInfo{" +
            "progressInfo=" + progressInfo +
            ", textInfo=" + textInfo +
            '}';
    }
}
