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
