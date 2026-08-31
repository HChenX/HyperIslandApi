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
 * 竞争图标与文案信息，对应官方 {@code miui.systemui.notification.focus.model.CompetitionIconTextInfo}。
 * <p>
 * 用于展示竞争类（sport 等）场景下多个参赛者图标与文字的组合信息，
 * 通过 {@code compIcon} 与 {@code subCompIcon} 分别表示双方图标，
 * {@code timerInfo} 用于携带该模块对应的倒计时。
 */
public final class CompetitionIconTextInfo extends TextAndColorInfo<CompetitionIconTextInfo> {
    private String compIcon;
    private String field;
    private String note;
    private String subCompIcon;
    private String subField;
    private String subNote;
    private TimerInfo subTimerInfo;
    private TimerInfo timerInfo;

    /**
     * 设置主方竞争图标是否为 {@code pic} 字符串 key。
     */
    public CompetitionIconTextInfo setCompIcon(String compIcon) {
        this.compIcon = compIcon;
        return this;
    }

    /**
     * 设置主方竞争字段名称。
     */
    public CompetitionIconTextInfo setField(String field) {
        this.field = field;
        return this;
    }

    /**
     * 设置主方竞争说明文案。
     */
    public CompetitionIconTextInfo setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * 设置次方竞争图标 {@code pic} 字符串 key。
     */
    public CompetitionIconTextInfo setSubCompIcon(String subCompIcon) {
        this.subCompIcon = subCompIcon;
        return this;
    }

    /**
     * 设置次方竞争字段名称。
     */
    public CompetitionIconTextInfo setSubField(String subField) {
        this.subField = subField;
        return this;
    }

    /**
     * 设置次方竞争说明文案。
     */
    public CompetitionIconTextInfo setSubNote(String subNote) {
        this.subNote = subNote;
        return this;
    }

    /**
     * 设置次方倒计时信息。
     */
    public CompetitionIconTextInfo setSubTimerInfo(TimerInfo subTimerInfo) {
        this.subTimerInfo = subTimerInfo;
        return this;
    }

    /**
     * 设置主方倒计时信息。
     */
    public CompetitionIconTextInfo setTimerInfo(TimerInfo timerInfo) {
        this.timerInfo = timerInfo;
        return this;
    }

    public String getCompIcon() {
        return compIcon;
    }

    public String getField() {
        return field;
    }

    public String getNote() {
        return note;
    }

    public String getSubCompIcon() {
        return subCompIcon;
    }

    public String getSubField() {
        return subField;
    }

    public String getSubNote() {
        return subNote;
    }

    public TimerInfo getSubTimerInfo() {
        return subTimerInfo;
    }

    public TimerInfo getTimerInfo() {
        return timerInfo;
    }

    @NonNull
    @Override
    public String toString() {
        return "CompetitionIconTextInfo{" +
            "compIcon='" + compIcon + '\'' +
            ", field='" + field + '\'' +
            ", note='" + note + '\'' +
            ", subCompIcon='" + subCompIcon + '\'' +
            ", subField='" + subField + '\'' +
            ", subNote='" + subNote + '\'' +
            ", subTimerInfo=" + subTimerInfo +
            ", timerInfo=" + timerInfo +
            "} " + super.toString();
    }
}