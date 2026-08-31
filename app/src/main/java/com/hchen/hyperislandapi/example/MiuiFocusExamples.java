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
 */
package com.hchen.hyperislandapi.example;

import com.hchen.hyperislandapi.HyperIslandApi;
import com.hchen.hyperislandapi.model.focus.ActionInfo;
import com.hchen.hyperislandapi.model.focus.AnimIconInfo;
import com.hchen.hyperislandapi.model.focus.AnimTextInfo;
import com.hchen.hyperislandapi.model.focus.BaseInfo;
import com.hchen.hyperislandapi.model.focus.BgInfo;
import com.hchen.hyperislandapi.model.focus.HighlightInfo;
import com.hchen.hyperislandapi.model.focus.IconTextInfo;
import com.hchen.hyperislandapi.model.focus.ProgressInfo;
import com.hchen.hyperislandapi.model.focus.TimerInfo;
import com.hchen.hyperislandapi.model.island.BigIslandArea;
import com.hchen.hyperislandapi.model.island.ImageTextInfo;
import com.hchen.hyperislandapi.model.island.PicInfo;
import com.hchen.hyperislandapi.model.island.SameWidthDigitInfo;
import com.hchen.hyperislandapi.model.island.SmallIslandArea;
import com.hchen.hyperislandapi.template.IslandTemplate;
import com.hchen.hyperislandapi.template.Template;

/**
 * 小米官方焦点通知 json 的 API 翻译示例。
 * <p>
 * 每个静态方法对应 {@code HyperIslandApi/src/main/example/} 下的一个官方 json，
 * 展示如何用代码表达 SystemUI 自用的焦点通知/超级岛数据，返回值即
 * {@link HyperIslandApi.Data}（内含 JSON 与 Bundle），示例仅演示构造、不发送通知
 * （小米不允许非授权软件发布 island）。
 * <p>
 * 官方 json 中残留的旧协议键（如 {@code protocol}、{@code scene}、旧的
 * {@code timerType} 等）已在 V3 模型中移除，系统经 Gson 读取时会忽略，
 * 本库无需也不应输出这些键，以保证序列化产物纯净。
 */
public final class MiuiFocusExamples {

    private MiuiFocusExamples() {
    }

    /**
     * 倒计时焦点通知，翻译自 {@code clock_focus.json} 的 {@code param_v2}。
     * <p>
     * key 对照：{@code updatable→setUpdatable}、{@code aodTitle→setAodTitle}、
     * {@code aodPic→setAodPic}、{@code highlightInfo→setHighlightInfo}、
     * {@code animTextInfo→setAnimTextInfo}、{@code actions→setActions}、
     * {@code param_island→setIslandTemplate}。
     * <p>
     * 官方 json 顶层与 {@code param_v2} 顶层的 {@code protocol}、{@code scene}、
     * {@code timerType} 等旧键省略，由 V3 忽略。
     */
    public static HyperIslandApi.Data clockFocus() {
        HighlightInfo highlightInfo = new HighlightInfo()
            .setSubContent("倒计时")
            .setColorSubContent("#3482FF")
            .setColorSubContentDark("#277AF7")
            .setPicFunction("miui.focus.pic_timer")
            .setTimerInfo(new TimerInfo()
                .setTimerType(-1)
                .setTimerSystemCurrent(1756533481427L)
                .setTimerWhen(1756616582326L));

        Template template = new Template()
            .setUpdatable(true)
            .setEnableFloat(true)
            .setAodTitle("倒计时中")
            .setAodPic("miui.focus.pic_ticker")
            .setIslandFirstFloat(false)
            .setHighlightInfo(highlightInfo)
            .setAnimTextInfo(new AnimTextInfo()
                .setContent("倒计时")
                .setColorContent("#99000000")
                .setColorContentDark("#80FFFFFF")
                .setAnimIconInfo(new AnimIconInfo()
                    .setType(2)
                    .setSrc("hourglass_big")
                    .setAutoplay(true))
                .setTimerInfo(new TimerInfo()
                    .setTimerType(-1)
                    .setTimerSystemCurrent(1756533481427L)
                    .setTimerWhen(1756616582326L)))
            .setActions(
                new ActionInfo()
                    .setType(1)
                    .setProgressInfo(new ProgressInfo()
                        .setProgress(100)
                        .setColorProgress("#3482FF")
                        .setColorProgressDark("#4788FF")
                        .setColorProgressEnd("#1A000000")
                        .setColorProgressEndDark("#29FFFFFF")
                        .setAutoProgress(true)
                        .setCCW(true))
                    .setAction("miui.focus.action_1"),
                new ActionInfo().setAction("miui.focus.action_2"));

        IslandTemplate islandTemplate = new IslandTemplate()
            .setIslandProperty(1)
            .setIslandOrder(true)
            .setExpandedTime(60)
            .setBigIslandArea(new BigIslandArea()
                .setImageTextInfoLeft(new ImageTextInfo()
                    .setType(1)
                    .setPicInfo(new PicInfo()
                        .setType(2)
                        .setPic("hourglass")
                        .setAutoplay(true)))
                .setSameWidthDigitInfo(new SameWidthDigitInfo()
                    .setTimerInfo(new com.hchen.hyperislandapi.model.island.TimerInfo()
                        .setTimerType(-1)
                        .setTimerSystemCurrent(1756533481427L)
                        .setTimerWhen(1756616582326L))))
            .setSmallIslandArea(new SmallIslandArea()
                .setPicInfo(new PicInfo()
                    .setType(2)
                    .setPic("hourglass")
                    .setAutoplay(true)));

        return new HyperIslandApi()
            .setTemplate(template)
            .setIslandTemplate(islandTemplate)
            .build();
    }

    /**
     * 录音进行中的焦点通知，翻译自 {@code recorder_focus.json} 的 {@code param_v2}。
     * <p>
     * key 对照：{@code notifyId→setNotifyId}、{@code animTextInfo→setAnimTextInfo}、
     * {@code actions→setActions}、{@code param_island({@code islandPriority/islandProperty})
     * → setIslandPriority/setIslandProperty}。
     * <p>
     * 官方 {@code param_v2} 顶层的 {@code protocol}、{@code scene}、{@code content}、
     * {@code timerType} 等旧键省略，由 V3 忽略；时间展示经 {@code animTextInfo.timerInfo}
     * 与 {@code param_island} 中的 {@code timerInfo} 表达。
     */
    public static HyperIslandApi.Data recorderFocus() {
        Template template = new Template()
            .setIslandFirstFloat(false)
            .setNotifyId("com.android.soundrecorder100")
            .setAnimTextInfo(new AnimTextInfo()
                .setAnimIconInfo(new AnimIconInfo()
                    .setType(1)
                    .setSrc("voiceWaveBig")
                    .setNumber(0)
                    .setAutoplay(true)
                    .setLoop(true))
                .setTimerInfo(new TimerInfo()
                    .setTimerType(1)
                    .setTimerSystemCurrent(1756538576063L)
                    .setTimerWhen(1756538576059L)))
            .setActions(
                new ActionInfo()
                    .setType(0)
                    .setActionIntentType(0)
                    .setAction("miui.focus.action_1"),
                new ActionInfo()
                    .setType(0)
                    .setActionIntentType(0)
                    .setAction("miui.focus.action_2"));

        IslandTemplate islandTemplate = new IslandTemplate()
            .setIslandProperty(2)
            .setIslandPriority(1)
            .setBigIslandArea(new BigIslandArea()
                .setImageTextInfoLeft(new ImageTextInfo()
                    .setType(1)
                    .setPicInfo(new PicInfo()
                        .setType(2)
                        .setPic("voiceWaveSmall")
                        .setAutoplay(true)
                        .setLoop(true)))
                .setSameWidthDigitInfo(new SameWidthDigitInfo()
                    .setTimerInfo(new com.hchen.hyperislandapi.model.island.TimerInfo()
                        .setTimerType(1)
                        .setTimerSystemCurrent(1756538576063L)
                        .setTimerWhen(1756538576059L))))
            .setSmallIslandArea(new SmallIslandArea()
                .setPicInfo(new PicInfo()
                    .setType(2)
                    .setPic("voiceWaveSmall")
                    .setAutoplay(true)
                    .setLoop(true)));

        return new HyperIslandApi()
            .setTemplate(template)
            .setIslandTemplate(islandTemplate)
            .build();
    }

    /**
     * 录音完成的焦点通知，翻译自 {@code recorder_done_focus.json} 的 {@code param_v2}。
     * <p>
     * key 对照：{@code notifyId→setNotifyId}、{@code animTextInfo.title→setTitle}（动画模块）、
     * {@code actions.actionIntent(actionIntentType=1)→setActionIntent/setActionIntentType}、
     * {@code param_island.islandTimeout→setIslandTimeout}、大岛顶格 {@code picInfo} → setPicInfo。
     * <p>
     * 官方 json 中的 {@code protocol}、{@code scene} 与 {@code param_v2} 顶层的旧键省略。
     */
    public static HyperIslandApi.Data recorderDoneFocus() {
        Template template = new Template()
            .setIslandFirstFloat(false)
            .setNotifyId("com.android.soundrecorder100")
            .setAnimTextInfo(new AnimTextInfo()
                .setTitle("录音已完成")
                .setAnimIconInfo(new AnimIconInfo()
                    .setType(1)
                    .setSrc("voiceWaveBig")
                    .setNumber(0)
                    .setAutoplay(false)
                    .setLoop(false)))
            .setActions(new ActionInfo()
                .setType(0)
                .setActionIntentType(1)
                .setActionIcon("action_done")
                .setActionTitle("录音已完成")
                .setActionIntent(
                    "intent:#Intent;component=com.android.soundrecorder/.RecordPreviewActivity;"
                        + "B.extra_is_from_notify=true;i.need_cancel_notification_id=100;end"));

        IslandTemplate islandTemplate = new IslandTemplate()
            .setIslandProperty(2)
            .setIslandPriority(1)
            .setIslandTimeout(15)
            .setBigIslandArea(new BigIslandArea()
                .setImageTextInfoLeft(new ImageTextInfo()
                    .setType(1)
                    .setPicInfo(new PicInfo()
                        .setType(2)
                        .setPic("voiceWaveSmall")
                        .setAutoplay(false)
                        .setLoop(false)))
                .setPicInfo(new PicInfo()
                    .setType(1)
                    .setPic("miui.focus.pic_1")
                    .setContentDescription("录音已完成")))
            .setSmallIslandArea(new SmallIslandArea()
                .setPicInfo(new PicInfo()
                    .setType(1)
                    .setPic("miui.focus.pic_2")));

        return new HyperIslandApi()
            .setTemplate(template)
            .setIslandTemplate(islandTemplate)
            .build();
    }

    /**
     * 手电筒使用中的焦点通知，翻译自 {@code flashlight_focus.json} 的 {@code param_v2}。
     * <p>
     * key 对照：{@code reopen("reopen")→setReopen}、{@code baseInfo→setBaseInfo}、
     * {@code bgInfo→setBgInfo}、{@code iconTextInfo→setIconTextInfo}、
     * {@code actions.actionIntent}(使用中动画) → setActionIntent。
     * <p>
     * 官方 json 中的 {@code protocol}、{@code scene} 旧键省略。
     */
    public static HyperIslandApi.Data flashlightFocus() {
        Template template = new Template()
            .setTicker("使用中")
            .setTickerPic("miui.focus.pic_ticker_pic")
            .setTickerPicDark("miui.focus.pic_ticker_pic")
            .setAodTitle("使用中")
            .setAodPic("miui.focus.pic_ado_pic")
            .setEnableFloat(true)
            .setUpdatable(true)
            .setReopen("reopen")
            .setIslandFirstFloat(false)
            .setBaseInfo(new BaseInfo()
                .setTitle("手电筒")
                .setColorTitle("#FFFFFF")
                .setContent("使用中")
                .setColorContent("#7FFFFFFF")
                .setSubContent("")
                .setColorSubContent("#FFFFFF")
                .setType(2))
            .setBgInfo(new BgInfo()
                .setColorBg("#1A1A1A"))
            .setIconTextInfo(new IconTextInfo()
                .setTitle("手电筒")
                .setContent("使用中")
                .setSubContent("")
                .setColorSubContent("")
                .setColorSubContentDark("")
                .setAnimIconInfo(new AnimIconInfo()
                    .setSrc("doubleCharge")
                    .setType(2)))
            .setActions(new ActionInfo()
                .setType(2)
                .setActionTitle("关闭")
                .setActionTitleColor("#FFFFFF")
                .setActionBgColor("#1EFFFFFF")
                .setActionBgPressColor("#24FFFFFF")
                .setActionIntentType(2)
                .setActionIntent("intent:#Intent;action=miui.systemui.action.ACTION_CLOSE_FLASHLIGHT;"
                    + "package=miui.systemui.plugin;end")
                .setActionIcon("miui.focus.pic_mark_v2"));

        IslandTemplate islandTemplate = new IslandTemplate()
            .setIslandProperty(2)
            .setBigIslandArea(new BigIslandArea()
                .setImageTextInfoLeft(new ImageTextInfo()
                    .setType(1)
                    .setPicInfo(new PicInfo()
                        .setType(3)
                        .setPic("flash_light_icon"))))
            .setSmallIslandArea(new SmallIslandArea()
                .setPicInfo(new PicInfo()
                    .setType(3)
                    .setPic("flash_light_icon")));

        return new HyperIslandApi()
            .setTemplate(template)
            .setIslandTemplate(islandTemplate)
            .build();
    }
}