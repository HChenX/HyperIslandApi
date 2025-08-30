package com.hchen.hyperislandapi.template;

import com.hchen.hyperislandapi.model.focus.ActionInfo;
import com.hchen.hyperislandapi.model.focus.AnimTextInfo;
import com.hchen.hyperislandapi.model.focus.BaseInfo;
import com.hchen.hyperislandapi.model.focus.BgInfo;
import com.hchen.hyperislandapi.model.focus.ChatInfo;
import com.hchen.hyperislandapi.model.focus.CoverInfo;
import com.hchen.hyperislandapi.model.focus.HighlightInfo;
import com.hchen.hyperislandapi.model.focus.HighlightInfoV3;
import com.hchen.hyperislandapi.model.focus.HintInfo;
import com.hchen.hyperislandapi.model.focus.IconTextInfo;
import com.hchen.hyperislandapi.model.focus.MultiProgressInfo;
import com.hchen.hyperislandapi.model.focus.PicInfo;
import com.hchen.hyperislandapi.model.focus.ProgressInfo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
* param_v2
* */
public final class Template {
    private List<ActionInfo> actions;
    private AnimTextInfo animTextInfo;
    private Integer protocol;
    private String scene;
    private String aodPic;
    private String aodTitle;
    private BaseInfo baseInfo;
    private BgInfo bgInfo;
    private String business;
    private boolean cancel;
    private ChatInfo chatInfo;
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

    public Template setActions(ActionInfo... actions) {
        this.actions = Arrays.asList(actions);
        return this;
    }

    public Template setAnimTextInfo(AnimTextInfo animTextInfo) {
        this.animTextInfo = animTextInfo;
        return this;
    }

    public Template setProtocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    public Template setScene(String scene) {
        this.scene = scene;
        return this;
    }

    public Template setAodPic(String aodPic) {
        this.aodPic = aodPic;
        return this;
    }

    public Template setAodTitle(String aodTitle) {
        this.aodTitle = aodTitle;
        return this;
    }

    public Template setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public Template setBgInfo(BgInfo bgInfo) {
        this.bgInfo = bgInfo;
        return this;
    }

    public Template setBusiness(String business) {
        this.business = business;
        return this;
    }

    public Template setCancel(boolean cancel) {
        this.cancel = cancel;
        return this;
    }

    public Template setChatInfo(ChatInfo chatInfo) {
        this.chatInfo = chatInfo;
        return this;
    }

    public Template setCoverInfo(CoverInfo coverInfo) {
        this.coverInfo = coverInfo;
        return this;
    }

    public Template setEnableFloat(boolean enableFloat) {
        this.enableFloat = enableFloat;
        return this;
    }

    public Template setHideDeco(boolean hideDeco) {
        this.hideDeco = hideDeco;
        return this;
    }

    public Template setHighlightInfo(HighlightInfo highlightInfo) {
        this.highlightInfo = highlightInfo;
        return this;
    }

    public Template setHighlightInfoV3(HighlightInfoV3 highlightInfoV3) {
        this.highlightInfoV3 = highlightInfoV3;
        return this;
    }

    public Template setHintInfo(HintInfo hintInfo) {
        this.hintInfo = hintInfo;
        return this;
    }

    public Template setIconTextInfo(IconTextInfo iconTextInfo) {
        this.iconTextInfo = iconTextInfo;
        return this;
    }

    public Template setShowNotification(Boolean showNotification) {
        isShowNotification = showNotification;
        return this;
    }

    public Template setIslandFirstFloat(Boolean islandFirstFloat) {
        this.islandFirstFloat = islandFirstFloat;
        return this;
    }

    public Template setMultiProgressInfo(MultiProgressInfo multiProgressInfo) {
        this.multiProgressInfo = multiProgressInfo;
        return this;
    }

    public Template setNotifyId(String notifyId) {
        this.notifyId = notifyId;
        return this;
    }

    public Template setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public Template setOutEffectColor(String outEffectColor) {
        this.outEffectColor = outEffectColor;
        return this;
    }

    public Template setOutEffectSrc(String outEffectSrc) {
        this.outEffectSrc = outEffectSrc;
        return this;
    }

    public Template setPicInfo(PicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    public Template setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    public Template setReopen(String reopen) {
        this.reopen = reopen;
        return this;
    }

    public Template setSequence(long sequence) {
        this.sequence = sequence;
        return this;
    }

    public Template setShowSmallIcon(boolean showSmallIcon) {
        this.showSmallIcon = showSmallIcon;
        return this;
    }

    public Template setTextButton(List<ActionInfo> textButton) {
        this.textButton = textButton;
        return this;
    }

    public Template setTicker(String ticker) {
        this.ticker = ticker;
        return this;
    }

    public Template setTickerPic(String tickerPic) {
        this.tickerPic = tickerPic;
        return this;
    }

    public Template setTickerPicDark(String tickerPicDark) {
        this.tickerPicDark = tickerPicDark;
        return this;
    }

    public Template setTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public Template setUpdatable(boolean updatable) {
        this.updatable = updatable;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof Template template)) return false;
        return cancel == template.cancel && enableFloat == template.enableFloat && hideDeco == template.hideDeco && sequence == template.sequence && showSmallIcon == template.showSmallIcon && timeout == template.timeout && updatable == template.updatable && Objects.equals(actions, template.actions) && Objects.equals(animTextInfo, template.animTextInfo) && Objects.equals(protocol, template.protocol) && Objects.equals(scene, template.scene) && Objects.equals(aodPic, template.aodPic) && Objects.equals(aodTitle, template.aodTitle) && Objects.equals(baseInfo, template.baseInfo) && Objects.equals(bgInfo, template.bgInfo) && Objects.equals(business, template.business) && Objects.equals(chatInfo, template.chatInfo) && Objects.equals(coverInfo, template.coverInfo) && Objects.equals(highlightInfo, template.highlightInfo) && Objects.equals(highlightInfoV3, template.highlightInfoV3) && Objects.equals(hintInfo, template.hintInfo) && Objects.equals(iconTextInfo, template.iconTextInfo) && Objects.equals(isShowNotification, template.isShowNotification) && Objects.equals(islandFirstFloat, template.islandFirstFloat) && Objects.equals(multiProgressInfo, template.multiProgressInfo) && Objects.equals(notifyId, template.notifyId) && Objects.equals(orderId, template.orderId) && Objects.equals(outEffectColor, template.outEffectColor) && Objects.equals(outEffectSrc, template.outEffectSrc) && Objects.equals(picInfo, template.picInfo) && Objects.equals(progressInfo, template.progressInfo) && Objects.equals(reopen, template.reopen) && Objects.equals(textButton, template.textButton) && Objects.equals(ticker, template.ticker) && Objects.equals(tickerPic, template.tickerPic) && Objects.equals(tickerPicDark, template.tickerPicDark);
    }

    @Override public int hashCode() {
        return Objects.hash(actions, animTextInfo, protocol, scene, aodPic, aodTitle, baseInfo,
            bgInfo, business, cancel, chatInfo, coverInfo, enableFloat, hideDeco, highlightInfo,
            highlightInfoV3, hintInfo, iconTextInfo, isShowNotification, islandFirstFloat,
            multiProgressInfo, notifyId, orderId, outEffectColor, outEffectSrc, picInfo,
            progressInfo, reopen, sequence, showSmallIcon, textButton, ticker, tickerPic,
            tickerPicDark, timeout, updatable);
    }

    @Override public String toString() {
        return "Template{" +
            "actions=" + actions +
            ", animTextInfo=" + animTextInfo +
            ", protocol=" + protocol +
            ", scene='" + scene + '\'' +
            ", aodPic='" + aodPic + '\'' +
            ", aodTitle='" + aodTitle + '\'' +
            ", baseInfo=" + baseInfo +
            ", bgInfo=" + bgInfo +
            ", business='" + business + '\'' +
            ", cancel=" + cancel +
            ", chatInfo=" + chatInfo +
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
            '}';
    }
}
