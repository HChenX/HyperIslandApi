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

/**
 * 超级岛模板，对应官方 {@code miui.systemui.dynamicisland.model.IslandTemplate}。
 * <p>
 * 描述超级岛的展示属性与展开/收起区域布局，作为 {@code param_island} 内嵌于
 * {@link Template} 中返回给系统。
 */
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
    private String appContentDescription;
    private Boolean clickDirectIntent;

    /** 设置大岛（展开）区域布局。 */
    public IslandTemplate setBigIslandArea(BigIslandArea bigIslandArea) {
        this.bigIslandArea = bigIslandArea;
        return this;
    }

    /** 设置岛的业务标识。 */
    public IslandTemplate setBusiness(String business) {
        this.business = business;
        return this;
    }

    /** 设置展示后是否自动收起。 */
    public IslandTemplate setDismissIsland(boolean dismissIsland) {
        this.dismissIsland = dismissIsland;
        return this;
    }

    /** 设置展开持续时长（秒）。 */
    public IslandTemplate setExpandedTime(int expandedTime) {
        this.expandedTime = expandedTime;
        return this;
    }

    /** 设置岛的高亮颜色。 */
    public IslandTemplate setHighlightColor(String highlightColor) {
        this.highlightColor = highlightColor;
        return this;
    }

    /** 设置是否按顺序排列岛。 */
    public IslandTemplate setIslandOrder(boolean islandOrder) {
        this.islandOrder = islandOrder;
        return this;
    }

    /** 设置岛的优先级。 */
    public IslandTemplate setIslandPriority(Integer islandPriority) {
        this.islandPriority = islandPriority;
        return this;
    }

    /** 设置岛的形态：{@code 0} 一次性、{@code 1} 信息、{@code 2} 操作。 */
    public IslandTemplate setIslandProperty(Integer islandProperty) {
        this.islandProperty = islandProperty;
        return this;
    }

    /** 设置小岛展示超时时间（毫秒）。 */
    public IslandTemplate setIslandTimeout(int islandTimeout) {
        this.islandTimeout = islandTimeout;
        return this;
    }

    /** 设置是否使用最大尺寸展示。 */
    public IslandTemplate setMaxSize(Boolean maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /** 设置是否需要收起动画。 */
    public IslandTemplate setNeedCloseAnimation(Boolean needCloseAnimation) {
        this.needCloseAnimation = needCloseAnimation;
        return this;
    }

    /** 设置岛分享数据。 */
    public IslandTemplate setShareData(ShareData shareData) {
        this.shareData = shareData;
        return this;
    }

    /** 设置小岛（收起）区域布局。 */
    public IslandTemplate setSmallIslandArea(SmallIslandArea smallIslandArea) {
        this.smallIslandArea = smallIslandArea;
        return this;
    }

    /** 设置岛的无障碍内容描述。 */
    public IslandTemplate setAppContentDescription(String appContentDescription) {
        this.appContentDescription = appContentDescription;
        return this;
    }

    /**
     * 设置点击岛时是否直接派发通知意图。
     * <p>
     * 为 {@code true} 且通知来源包名在系统直跳白名单内时，点击岛直接执行通知点击意图（直接在跳转），
     * 而不展开岛。
     */
    public IslandTemplate setClickDirectIntent(Boolean clickDirectIntent) {
        this.clickDirectIntent = clickDirectIntent;
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

    public String getAppContentDescription() {
        return appContentDescription;
    }

    public Boolean getClickDirectIntent() {
        return clickDirectIntent;
    }

    public SmallIslandArea getSmallIslandArea() {
        return smallIslandArea;
    }

    @NonNull
    @Override
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
            ", appContentDescription='" + appContentDescription + '\'' +
            ", clickDirectIntent=" + clickDirectIntent +
            '}';
    }
}
