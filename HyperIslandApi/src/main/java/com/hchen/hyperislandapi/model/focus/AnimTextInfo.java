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

public final class AnimTextInfo {
    private AnimIconInfo animIconInfo;
    private TimerInfo timerInfo;

    public AnimTextInfo setAnimIconInfo(AnimIconInfo animIconInfo) {
        this.animIconInfo = animIconInfo;
        return this;
    }

    public AnimTextInfo setTimerInfo(TimerInfo timerInfo) {
        this.timerInfo = timerInfo;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof AnimTextInfo that)) return false;
        return Objects.equals(animIconInfo, that.animIconInfo) && Objects.equals(timerInfo,
            that.timerInfo);
    }

    @Override public int hashCode() {
        return Objects.hash(animIconInfo, timerInfo);
    }

    @Override public String toString() {
        return "AnimTextInfo{" +
            "animIconInfo=" + animIconInfo +
            ", timerInfo=" + timerInfo +
            '}';
    }
}
