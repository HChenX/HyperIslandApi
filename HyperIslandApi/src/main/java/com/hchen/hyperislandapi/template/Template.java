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

import com.hchen.hyperislandapi.model.focus.ActionInfo;
import com.hchen.hyperislandapi.model.focus.AnimTextInfo;
import com.hchen.hyperislandapi.model.focus.BaseInfo;
import com.hchen.hyperislandapi.model.focus.BgInfo;
import com.hchen.hyperislandapi.model.focus.ChatInfo;
import com.hchen.hyperislandapi.model.focus.CompetitionIconTextInfo;
import com.hchen.hyperislandapi.model.focus.CoverInfo;
import com.hchen.hyperislandapi.model.focus.HighlightInfo;
import com.hchen.hyperislandapi.model.focus.HighlightInfoV3;
import com.hchen.hyperislandapi.model.focus.HintInfo;
import com.hchen.hyperislandapi.model.focus.IconTextInfo;
import com.hchen.hyperislandapi.model.focus.MultiProgressInfo;
import com.hchen.hyperislandapi.model.focus.PicInfo;
import com.hchen.hyperislandapi.model.focus.ProgressInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 焦点通知 V2 模板，对应官方 {@code miui.systemui.notification.focus.model.Template}。
 * <p>
 * 这是 {@code miui.focus.param} 中 {@code param_v2} 的核心模型，
 * 组合各类信息区（基础信息、背景、高亮、进度、图片、动作等）描述一条焦点通知；
 * 通过反射内嵌的 {@link IslandTemplate} 可同时启用超级岛。
 */
public final class Template {
    private List<ActionInfo> actions;
    private AnimTextInfo animTextInfo;
    private String aodPic;
    private String aodTitle;
    private BaseInfo baseInfo;
    private BgInfo bgInfo;
    private String business;
    private boolean cancel;
    private ChatInfo chatInfo;
    private CompetitionIconTextInfo competitionIconTextInfo;
    private CoverInfo coverInfo;
    private boolean enableFloat;
    private boolean hideDeco;
    private HighlightInfo highlightInfo;
    private HighlightInfoV3 highlightInfoV3;
    private HintInfo hintInfo;
    private IconTextInfo iconTextInfo;
    private Boolean isShowNotification;
    private Boolean islandFirstFloat;
    private MultiProgressInfo multiProgressInfo;
    private String notifyId;
    private String orderId;
    private String outEffectColor;
    private String outEffectSrc;
    private PicInfo picInfo;
    private ProgressInfo progressInfo;
    private String reopen;
    private long sequence;
    private boolean showSmallIcon;
    private List<ActionInfo> textButton;
    private String ticker;
    private String tickerPic;
    private String tickerPicDark;
    private int timeout;
    private boolean updatable;

    @Keep
    private IslandTemplate param_island; // parse use

    /** 设置动作按钮数组，每个动作对应 {@code miui.focus.actions} Bundle 中的一项。 */
    public Template setActions(ActionInfo... actions) {
        this.actions = actions == null ? null : new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /** 设置动画文字模块。 */
    public Template setAnimTextInfo(AnimTextInfo animTextInfo) {
        this.animTextInfo = animTextInfo;
        return this;
    }

    /** 设置 AOD 常显的图片 key，需与 {@code miui.focus.pics} Bundle 中的键一致。 */
    public Template setAodPic(String aodPic) {
        this.aodPic = aodPic;
        return this;
    }

    /** 设置 AOD 常显的标题文字。 */
    public Template setAodTitle(String aodTitle) {
        this.aodTitle = aodTitle;
        return this;
    }

    /** 设置基础信息区（标题、内容等）。 */
    public Template setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    /** 设置背景信息。 */
    public Template setBgInfo(BgInfo bgInfo) {
        this.bgInfo = bgInfo;
        return this;
    }

    /** 设置业务标识，用于区分通知来源的业务方。 */
    public Template setBusiness(String business) {
        this.business = business;
        return this;
    }

    /** 设置是否取消已存在的同名焦点通知。 */
    public Template setCancel(boolean cancel) {
        this.cancel = cancel;
        return this;
    }

    /** 设置会话（聊天）模块。 */
    public Template setChatInfo(ChatInfo chatInfo) {
        this.chatInfo = chatInfo;
        return this;
    }

    /** 设置竞争图标文案模块（V3 新增）。 */
    public Template setCompetitionIconTextInfo(CompetitionIconTextInfo competitionIconTextInfo) {
        this.competitionIconTextInfo = competitionIconTextInfo;
        return this;
    }

    /** 设置封面模块。 */
    public Template setCoverInfo(CoverInfo coverInfo) {
        this.coverInfo = coverInfo;
        return this;
    }

    /** 设置是否启用悬浮窗展示。 */
    public Template setEnableFloat(boolean enableFloat) {
        this.enableFloat = enableFloat;
        return this;
    }

    /** 设置是否隐藏装饰元素。 */
    public Template setHideDeco(boolean hideDeco) {
        this.hideDeco = hideDeco;
        return this;
    }

    /** 设置高亮信息模块。 */
    public Template setHighlightInfo(HighlightInfo highlightInfo) {
        this.highlightInfo = highlightInfo;
        return this;
    }

    /** 设置 V3 高亮信息模块。 */
    public Template setHighlightInfoV3(HighlightInfoV3 highlightInfoV3) {
        this.highlightInfoV3 = highlightInfoV3;
        return this;
    }

    /** 设置提示信息模块。 */
    public Template setHintInfo(HintInfo hintInfo) {
        this.hintInfo = hintInfo;
        return this;
    }

    /** 设置图标文字模块。 */
    public Template setIconTextInfo(IconTextInfo iconTextInfo) {
        this.iconTextInfo = iconTextInfo;
        return this;
    }

    /** 设置系统通知是否同时展示。 */
    public Template setShowNotification(Boolean showNotification) {
        isShowNotification = showNotification;
        return this;
    }

    /** 设置是否气泡优先进入超级岛。 */
    public Template setIslandFirstFloat(Boolean islandFirstFloat) {
        this.islandFirstFloat = islandFirstFloat;
        return this;
    }

    /** 设置多段进度信息。 */
    public Template setMultiProgressInfo(MultiProgressInfo multiProgressInfo) {
        this.multiProgressInfo = multiProgressInfo;
        return this;
    }

    /** 设置通知业务 ID，用于更新或取消同一条焦点通知。 */
    public Template setNotifyId(String notifyId) {
        this.notifyId = notifyId;
        return this;
    }

    /** 设置订单 ID。 */
    public Template setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /** 设置穿出效果颜色。 */
    public Template setOutEffectColor(String outEffectColor) {
        this.outEffectColor = outEffectColor;
        return this;
    }

    /** 设置穿出效果资源。 */
    public Template setOutEffectSrc(String outEffectSrc) {
        this.outEffectSrc = outEffectSrc;
        return this;
    }

    /** 设置图片信息模块。 */
    public Template setPicInfo(PicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    /** 设置进度信息模块。 */
    public Template setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    /** 设置重新打开行为关键字，取 {@code reopen} 或 {@code close}。 */
    public Template setReopen(String reopen) {
        this.reopen = reopen;
        return this;
    }

    /** 设置通知序号，用于通知排序与去重。 */
    public Template setSequence(long sequence) {
        this.sequence = sequence;
        return this;
    }

    /** 设置是否展示小图标。 */
    public Template setShowSmallIcon(boolean showSmallIcon) {
        this.showSmallIcon = showSmallIcon;
        return this;
    }

    /** 设置文字按钮列表。 */
    public Template setTextButton(List<ActionInfo> textButton) {
        this.textButton = textButton;
        return this;
    }

    /** 设置状态栏 ticker 文本。 */
    public Template setTicker(String ticker) {
        this.ticker = ticker;
        return this;
    }

    /** 设置状态栏 ticker 图标 key。 */
    public Template setTickerPic(String tickerPic) {
        this.tickerPic = tickerPic;
        return this;
    }

    /** 设置深色模式状态栏 ticker 图标 key，未设置时官方回退到 {@code tickerPic}。 */
    public Template setTickerPicDark(String tickerPicDark) {
        this.tickerPicDark = tickerPicDark;
        return this;
    }

    /** 设置焦点通知超时时间（秒）。 */
    public Template setTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    /** 设置是否允许被后续通知更新。 */
    public Template setUpdatable(boolean updatable) {
        this.updatable = updatable;
        return this;
    }

    public List<ActionInfo> getActions() {
        return actions;
    }

    public AnimTextInfo getAnimTextInfo() {
        return animTextInfo;
    }

    public String getAodPic() {
        return aodPic;
    }

    public String getAodTitle() {
        return aodTitle;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public BgInfo getBgInfo() {
        return bgInfo;
    }

    public String getBusiness() {
        return business;
    }

    public boolean isCancel() {
        return cancel;
    }

    public ChatInfo getChatInfo() {
        return chatInfo;
    }

    public CompetitionIconTextInfo getCompetitionIconTextInfo() {
        return competitionIconTextInfo;
    }

    public CoverInfo getCoverInfo() {
        return coverInfo;
    }

    public boolean isEnableFloat() {
        return enableFloat;
    }

    public boolean isHideDeco() {
        return hideDeco;
    }

    public HighlightInfo getHighlightInfo() {
        return highlightInfo;
    }

    public HighlightInfoV3 getHighlightInfoV3() {
        return highlightInfoV3;
    }

    public HintInfo getHintInfo() {
        return hintInfo;
    }

    public IconTextInfo getIconTextInfo() {
        return iconTextInfo;
    }

    public Boolean getShowNotification() {
        return isShowNotification;
    }

    public Boolean getIslandFirstFloat() {
        return islandFirstFloat;
    }

    public MultiProgressInfo getMultiProgressInfo() {
        return multiProgressInfo;
    }

    public String getNotifyId() {
        return notifyId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOutEffectColor() {
        return outEffectColor;
    }

    public String getOutEffectSrc() {
        return outEffectSrc;
    }

    public PicInfo getPicInfo() {
        return picInfo;
    }

    public ProgressInfo getProgressInfo() {
        return progressInfo;
    }

    public String getReopen() {
        return reopen;
    }

    public long getSequence() {
        return sequence;
    }

    public boolean isShowSmallIcon() {
        return showSmallIcon;
    }

    public List<ActionInfo> getTextButton() {
        return textButton;
    }

    public String getTicker() {
        return ticker;
    }

    public String getTickerPic() {
        return tickerPic;
    }

    public String getTickerPicDark() {
        return tickerPicDark;
    }

    public int getTimeout() {
        return timeout;
    }

    public boolean isUpdatable() {
        return updatable;
    }

    @NonNull
    @Override
    public String toString() {
        return "Template{" +
            "actions=" + actions +
            ", animTextInfo=" + animTextInfo +
            ", aodPic='" + aodPic + '\'' +
            ", aodTitle='" + aodTitle + '\'' +
            ", baseInfo=" + baseInfo +
            ", bgInfo=" + bgInfo +
            ", business='" + business + '\'' +
            ", cancel=" + cancel +
            ", chatInfo=" + chatInfo +
            ", competitionIconTextInfo=" + competitionIconTextInfo +
            ", coverInfo=" + coverInfo +
            ", enableFloat=" + enableFloat +
            ", hideDeco=" + hideDeco +
            ", highlightInfo=" + highlightInfo +
            ", highlightInfoV3=" + highlightInfoV3 +
            ", hintInfo=" + hintInfo +
            ", iconTextInfo=" + iconTextInfo +
            ", isShowNotification=" + isShowNotification +
            ", islandFirstFloat=" + islandFirstFloat +
            ", multiProgressInfo=" + multiProgressInfo +
            ", notifyId='" + notifyId + '\'' +
            ", orderId='" + orderId + '\'' +
            ", outEffectColor='" + outEffectColor + '\'' +
            ", outEffectSrc='" + outEffectSrc + '\'' +
            ", picInfo=" + picInfo +
            ", progressInfo=" + progressInfo +
            ", reopen='" + reopen + '\'' +
            ", sequence=" + sequence +
            ", showSmallIcon=" + showSmallIcon +
            ", textButton=" + textButton +
            ", ticker='" + ticker + '\'' +
            ", tickerPic='" + tickerPic + '\'' +
            ", tickerPicDark='" + tickerPicDark + '\'' +
            ", timeout=" + timeout +
            ", updatable=" + updatable +
            ", param_island=" + param_island +
            '}';
    }
}
