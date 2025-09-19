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
package com.hchen.hyperislandapi.template;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import java.util.Objects;

public final class FocusTemplate {
    private String aodPic;
    private String aodTitle;
    private Integer colorBg;
    private String content;
    private Integer contentColor;
    private Integer contentColorDark;
    private String desc;
    private String desc1;
    private String desc2;
    private Integer descColor;
    private Integer descColorDark;
    private boolean enableFloat;
    private boolean padding;
    private int protocol;
    private String reopen;
    private String scene;
    private String ticker;
    private String tickerPic;
    private String tickerPicDark;
    private int timeoutMin;
    private String title;
    private Integer titleColor;
    private Integer titleColorDark;
    private boolean updatable;

    private int progress;
    private int progressCount;
    private boolean showSmallIcon;

    private long timerCurrent;
    private long timerSystemCurrent;
    private long timerTotal;
    private int timerType;
    private long timerWhen;

    @Keep
    private Template param_v2;  // parse use

    public FocusTemplate setAodPic(String aodPic) {
        this.aodPic = aodPic;
        return this;
    }

    public FocusTemplate setAodTitle(String aodTitle) {
        this.aodTitle = aodTitle;
        return this;
    }

    public FocusTemplate setColorBg(Integer colorBg) {
        this.colorBg = colorBg;
        return this;
    }

    public FocusTemplate setContent(String content) {
        this.content = content;
        return this;
    }

    public FocusTemplate setContentColor(Integer contentColor) {
        this.contentColor = contentColor;
        return this;
    }

    public FocusTemplate setContentColorDark(Integer contentColorDark) {
        this.contentColorDark = contentColorDark;
        return this;
    }

    public FocusTemplate setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public FocusTemplate setDesc1(String desc1) {
        this.desc1 = desc1;
        return this;
    }

    public FocusTemplate setDesc2(String desc2) {
        this.desc2 = desc2;
        return this;
    }

    public FocusTemplate setDescColor(Integer descColor) {
        this.descColor = descColor;
        return this;
    }

    public FocusTemplate setDescColorDark(Integer descColorDark) {
        this.descColorDark = descColorDark;
        return this;
    }

    public FocusTemplate setEnableFloat(boolean enableFloat) {
        this.enableFloat = enableFloat;
        return this;
    }

    public FocusTemplate setPadding(boolean padding) {
        this.padding = padding;
        return this;
    }

    public FocusTemplate setProtocol(int protocol) {
        this.protocol = protocol;
        return this;
    }

    public FocusTemplate setReopen(String reopen) {
        this.reopen = reopen;
        return this;
    }

    public FocusTemplate setScene(String scene) {
        this.scene = scene;
        return this;
    }

    public FocusTemplate setTicker(String ticker) {
        this.ticker = ticker;
        return this;
    }

    public FocusTemplate setTickerPic(String tickerPic) {
        this.tickerPic = tickerPic;
        return this;
    }

    public FocusTemplate setTickerPicDark(String tickerPicDark) {
        this.tickerPicDark = tickerPicDark;
        return this;
    }

    public FocusTemplate setTimeoutMin(int timeoutMin) {
        this.timeoutMin = timeoutMin;
        return this;
    }

    public FocusTemplate setTitle(String title) {
        this.title = title;
        return this;
    }

    public FocusTemplate setTitleColor(Integer titleColor) {
        this.titleColor = titleColor;
        return this;
    }

    public FocusTemplate setTitleColorDark(Integer titleColorDark) {
        this.titleColorDark = titleColorDark;
        return this;
    }

    public FocusTemplate setUpdatable(boolean updatable) {
        this.updatable = updatable;
        return this;
    }

    public FocusTemplate setProgress(int progress) {
        this.progress = progress;
        return this;
    }

    public FocusTemplate setProgressCount(int progressCount) {
        this.progressCount = progressCount;
        return this;
    }

    public FocusTemplate setShowSmallIcon(boolean showSmallIcon) {
        this.showSmallIcon = showSmallIcon;
        return this;
    }

    public FocusTemplate setTimerCurrent(long timerCurrent) {
        this.timerCurrent = timerCurrent;
        return this;
    }

    public FocusTemplate setTimerSystemCurrent(long timerSystemCurrent) {
        this.timerSystemCurrent = timerSystemCurrent;
        return this;
    }

    public FocusTemplate setTimerTotal(long timerTotal) {
        this.timerTotal = timerTotal;
        return this;
    }

    public FocusTemplate setTimerType(int timerType) {
        this.timerType = timerType;
        return this;
    }

    public FocusTemplate setTimerWhen(long timerWhen) {
        this.timerWhen = timerWhen;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FocusTemplate that)) return false;
        return enableFloat == that.enableFloat && padding == that.padding && protocol == that.protocol && timeoutMin == that.timeoutMin && updatable == that.updatable && progress == that.progress && progressCount == that.progressCount && showSmallIcon == that.showSmallIcon && timerCurrent == that.timerCurrent && timerSystemCurrent == that.timerSystemCurrent && timerTotal == that.timerTotal && timerType == that.timerType && timerWhen == that.timerWhen && Objects.equals(aodPic, that.aodPic) && Objects.equals(aodTitle, that.aodTitle) && Objects.equals(colorBg, that.colorBg) && Objects.equals(content, that.content) && Objects.equals(contentColor, that.contentColor) && Objects.equals(contentColorDark, that.contentColorDark) && Objects.equals(desc, that.desc) && Objects.equals(desc1, that.desc1) && Objects.equals(desc2, that.desc2) && Objects.equals(descColor, that.descColor) && Objects.equals(descColorDark, that.descColorDark) && Objects.equals(reopen, that.reopen) && Objects.equals(scene, that.scene) && Objects.equals(ticker, that.ticker) && Objects.equals(tickerPic, that.tickerPic) && Objects.equals(tickerPicDark, that.tickerPicDark) && Objects.equals(title, that.title) && Objects.equals(titleColor, that.titleColor) && Objects.equals(titleColorDark, that.titleColorDark) && Objects.equals(param_v2, that.param_v2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aodPic, aodTitle, colorBg, content, contentColor, contentColorDark, desc, desc1, desc2, descColor, descColorDark, enableFloat, padding, protocol, reopen, scene, ticker, tickerPic, tickerPicDark, timeoutMin, title, titleColor, titleColorDark, updatable, progress, progressCount, showSmallIcon, timerCurrent, timerSystemCurrent, timerTotal, timerType, timerWhen, param_v2);
    }

    @Override
    @NonNull
    public String toString() {
        return "FocusTemplate{" +
            "aodPic='" + aodPic + '\'' +
            ", aodTitle='" + aodTitle + '\'' +
            ", colorBg=" + colorBg +
            ", content='" + content + '\'' +
            ", contentColor=" + contentColor +
            ", contentColorDark=" + contentColorDark +
            ", desc='" + desc + '\'' +
            ", desc1='" + desc1 + '\'' +
            ", desc2='" + desc2 + '\'' +
            ", descColor=" + descColor +
            ", descColorDark=" + descColorDark +
            ", enableFloat=" + enableFloat +
            ", padding=" + padding +
            ", protocol=" + protocol +
            ", reopen='" + reopen + '\'' +
            ", scene='" + scene + '\'' +
            ", ticker='" + ticker + '\'' +
            ", tickerPic='" + tickerPic + '\'' +
            ", tickerPicDark='" + tickerPicDark + '\'' +
            ", timeoutMin=" + timeoutMin +
            ", title='" + title + '\'' +
            ", titleColor=" + titleColor +
            ", titleColorDark=" + titleColorDark +
            ", updatable=" + updatable +
            ", progress=" + progress +
            ", progressCount=" + progressCount +
            ", showSmallIcon=" + showSmallIcon +
            ", timerCurrent=" + timerCurrent +
            ", timerSystemCurrent=" + timerSystemCurrent +
            ", timerTotal=" + timerTotal +
            ", timerType=" + timerType +
            ", timerWhen=" + timerWhen +
            ", param_v2=" + param_v2 +
            "} " + super.toString();
    }
}
