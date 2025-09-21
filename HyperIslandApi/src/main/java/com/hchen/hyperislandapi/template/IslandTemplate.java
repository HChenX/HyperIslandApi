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

import androidx.annotation.NonNull;

import com.hchen.hyperislandapi.model.island.BigIslandArea;
import com.hchen.hyperislandapi.model.island.ShareData;
import com.hchen.hyperislandapi.model.island.SmallIslandArea;

import java.util.Objects;

/*
 * param_island
 * */
public final class IslandTemplate {
    private BigIslandArea bigIslandArea;
    private String business;
    private boolean dismissIsland;
    private int expandedTime;
    private String highlightColor;
    private boolean islandOrder;
    private Integer islandPriority;
    private Integer islandProperty;
    private int islandTimeout;
    private Boolean maxSize;
    private Boolean needCloseAnimation;
    private ShareData shareData;
    private SmallIslandArea smallIslandArea;

    public IslandTemplate setBigIslandArea(BigIslandArea bigIslandArea) {
        this.bigIslandArea = bigIslandArea;
        return this;
    }

    public IslandTemplate setBusiness(String business) {
        this.business = business;
        return this;
    }

    public IslandTemplate setDismissIsland(boolean dismissIsland) {
        this.dismissIsland = dismissIsland;
        return this;
    }

    public IslandTemplate setExpandedTime(int expandedTime) {
        this.expandedTime = expandedTime;
        return this;
    }

    public IslandTemplate setHighlightColor(String highlightColor) {
        this.highlightColor = highlightColor;
        return this;
    }

    public IslandTemplate setIslandOrder(boolean islandOrder) {
        this.islandOrder = islandOrder;
        return this;
    }

    public IslandTemplate setIslandPriority(Integer islandPriority) {
        this.islandPriority = islandPriority;
        return this;
    }

    public IslandTemplate setIslandProperty(Integer islandProperty) {
        this.islandProperty = islandProperty;
        return this;
    }

    public IslandTemplate setIslandTimeout(int islandTimeout) {
        this.islandTimeout = islandTimeout;
        return this;
    }

    public IslandTemplate setMaxSize(Boolean maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    public IslandTemplate setNeedCloseAnimation(Boolean needCloseAnimation) {
        this.needCloseAnimation = needCloseAnimation;
        return this;
    }

    public IslandTemplate setShareData(ShareData shareData) {
        this.shareData = shareData;
        return this;
    }

    public IslandTemplate setSmallIslandArea(SmallIslandArea smallIslandArea) {
        this.smallIslandArea = smallIslandArea;
        return this;
    }

    public BigIslandArea getBigIslandArea() {
        return bigIslandArea;
    }

    public String getBusiness() {
        return business;
    }

    public boolean isDismissIsland() {
        return dismissIsland;
    }

    public int getExpandedTime() {
        return expandedTime;
    }

    public String getHighlightColor() {
        return highlightColor;
    }

    public boolean isIslandOrder() {
        return islandOrder;
    }

    public Integer getIslandPriority() {
        return islandPriority;
    }

    public Integer getIslandProperty() {
        return islandProperty;
    }

    public int getIslandTimeout() {
        return islandTimeout;
    }

    public Boolean getMaxSize() {
        return maxSize;
    }

    public Boolean getNeedCloseAnimation() {
        return needCloseAnimation;
    }

    public ShareData getShareData() {
        return shareData;
    }

    public SmallIslandArea getSmallIslandArea() {
        return smallIslandArea;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof IslandTemplate that)) return false;
        return dismissIsland == that.dismissIsland && expandedTime == that.expandedTime && islandOrder == that.islandOrder && islandTimeout == that.islandTimeout && Objects.equals(bigIslandArea, that.bigIslandArea) && Objects.equals(business, that.business) && Objects.equals(highlightColor, that.highlightColor) && Objects.equals(islandPriority, that.islandPriority) && Objects.equals(islandProperty, that.islandProperty) && Objects.equals(maxSize, that.maxSize) && Objects.equals(needCloseAnimation, that.needCloseAnimation) && Objects.equals(shareData, that.shareData) && Objects.equals(smallIslandArea, that.smallIslandArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bigIslandArea, business, dismissIsland, expandedTime, highlightColor,
            islandOrder, islandPriority, islandProperty, islandTimeout, maxSize,
            needCloseAnimation, shareData, smallIslandArea);
    }

    @Override
    @NonNull
    public String toString() {
        return "IslandTemplate{" +
            "bigIslandArea=" + bigIslandArea +
            ", business='" + business + '\'' +
            ", dismissIsland=" + dismissIsland +
            ", expandedTime=" + expandedTime +
            ", highlightColor='" + highlightColor + '\'' +
            ", islandOrder=" + islandOrder +
            ", islandPriority=" + islandPriority +
            ", islandProperty=" + islandProperty +
            ", islandTimeout=" + islandTimeout +
            ", maxSize=" + maxSize +
            ", needCloseAnimation=" + needCloseAnimation +
            ", shareData=" + shareData +
            ", smallIslandArea=" + smallIslandArea +
            '}';
    }
}
