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

public final class TimerInfo {
    private Long timerSystemCurrent;
    private long timerTotal;
    private int timerType;
    private Long timerWhen;

    public TimerInfo setTimerSystemCurrent(Long timerSystemCurrent) {
        this.timerSystemCurrent = timerSystemCurrent;
        return this;
    }

    public TimerInfo setTimerTotal(long timerTotal) {
        this.timerTotal = timerTotal;
        return this;
    }

    public TimerInfo setTimerType(int timerType) {
        this.timerType = timerType;
        return this;
    }

    public TimerInfo setTimerWhen(Long timerWhen) {
        this.timerWhen = timerWhen;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof TimerInfo timerInfo)) return false;
        return timerTotal == timerInfo.timerTotal && timerType == timerInfo.timerType && Objects.equals(timerSystemCurrent, timerInfo.timerSystemCurrent) && Objects.equals(timerWhen, timerInfo.timerWhen);
    }

    @Override public int hashCode() {
        return Objects.hash(timerSystemCurrent, timerTotal, timerType, timerWhen);
    }

    @Override public String toString() {
        return "TimerInfo{" +
            "timerSystemCurrent=" + timerSystemCurrent +
            ", timerTotal=" + timerTotal +
            ", timerType=" + timerType +
            ", timerWhen=" + timerWhen +
            '}';
    }
}
