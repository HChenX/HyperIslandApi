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
 * 动画文字信息模块，对应官方 {@code AnimTextInfo}，用于带动画的文字展示场景。
 */
public final class AnimTextInfo extends TextAndColorInfo<AnimTextInfo> {
    private AnimIconInfo animIconInfo;
    private TimerInfo timerInfo;

    /** 设置动画图标信息。 */
    public AnimTextInfo setAnimIconInfo(AnimIconInfo animIconInfo) {
        this.animIconInfo = animIconInfo;
        return this;
    }

    /** 设置内嵌倒计时。 */
    public AnimTextInfo setTimerInfo(TimerInfo timerInfo) {
        this.timerInfo = timerInfo;
        return this;
    }

    public AnimIconInfo getAnimIconInfo() {
        return animIconInfo;
    }

    public TimerInfo getTimerInfo() {
        return timerInfo;
    }

    @NonNull
    @Override
    public String toString() {
        return "AnimTextInfo{" +
            "animIconInfo=" + animIconInfo +
            ", timerInfo=" + timerInfo +
            "} " + super.toString();
    }
}
