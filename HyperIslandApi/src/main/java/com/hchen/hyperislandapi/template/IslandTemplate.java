package com.hchen.hyperislandapi.template;

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

    @Override public boolean equals(Object o) {
        if (!(o instanceof IslandTemplate that)) return false;
        return dismissIsland == that.dismissIsland && expandedTime == that.expandedTime && islandOrder == that.islandOrder && islandTimeout == that.islandTimeout && Objects.equals(bigIslandArea, that.bigIslandArea) && Objects.equals(business, that.business) && Objects.equals(highlightColor, that.highlightColor) && Objects.equals(islandPriority, that.islandPriority) && Objects.equals(islandProperty, that.islandProperty) && Objects.equals(maxSize, that.maxSize) && Objects.equals(needCloseAnimation, that.needCloseAnimation) && Objects.equals(shareData, that.shareData) && Objects.equals(smallIslandArea, that.smallIslandArea);
    }

    @Override public int hashCode() {
        return Objects.hash(bigIslandArea, business, dismissIsland, expandedTime, highlightColor,
            islandOrder, islandPriority, islandProperty, islandTimeout, maxSize,
            needCloseAnimation, shareData, smallIslandArea);
    }

    @Override public String toString() {
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
