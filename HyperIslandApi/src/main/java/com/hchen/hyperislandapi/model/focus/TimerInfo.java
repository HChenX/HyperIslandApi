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

/**
 * 焦点通知中的倒计时信息，对应官方 {@code TimerInfo}，用于各信息区的计时展示。
 * <p>
 * {@code timerType}：{@code -1} 表示倒计时、{@code 0} 表示正计时；
 * {@code timerWhen} 为计时结束/开始的毫秒时间戳，{@code timerTotal} 为总时长（毫秒）。
 */
public final class TimerInfo {
    private Long timerSystemCurrent;
    private long timerTotal;
    private int timerType;
    private Long timerWhen;

    /** 设置系统当前毫秒时间戳。 */
    public TimerInfo setTimerSystemCurrent(Long timerSystemCurrent) {
        this.timerSystemCurrent = timerSystemCurrent;
        return this;
    }

    /** 设置计时总时长（毫秒）。 */
    public TimerInfo setTimerTotal(long timerTotal) {
        this.timerTotal = timerTotal;
        return this;
    }

    /** 设置计时类型：{@code -1} 倒计时、{@code 0} 正计时。 */
    public TimerInfo setTimerType(int timerType) {
        this.timerType = timerType;
        return this;
    }

    /** 设置计时结束（倒计时）或开始（正计时）的毫秒时间戳。 */
    public TimerInfo setTimerWhen(Long timerWhen) {
        this.timerWhen = timerWhen;
        return this;
    }

    public Long getTimerSystemCurrent() {
        return timerSystemCurrent;
    }

    public long getTimerTotal() {
        return timerTotal;
    }

    public int getTimerType() {
        return timerType;
    }

    public Long getTimerWhen() {
        return timerWhen;
    }

    @NonNull
    @Override
    public String toString() {
        return "TimerInfo{" +
            "timerSystemCurrent=" + timerSystemCurrent +
            ", timerTotal=" + timerTotal +
            ", timerType=" + timerType +
            ", timerWhen=" + timerWhen +
            '}';
    }
}
