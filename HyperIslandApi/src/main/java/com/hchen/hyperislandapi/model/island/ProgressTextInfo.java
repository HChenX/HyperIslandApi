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

public final class ProgressTextInfo {
    private ProgressInfo progressInfo;
    private TextInfo textInfo;

    public ProgressTextInfo setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    public ProgressTextInfo setTextInfo(TextInfo textInfo) {
        this.textInfo = textInfo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ProgressTextInfo that)) return false;
        return Objects.equals(progressInfo, that.progressInfo) && Objects.equals(textInfo,
            that.textInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progressInfo, textInfo);
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
