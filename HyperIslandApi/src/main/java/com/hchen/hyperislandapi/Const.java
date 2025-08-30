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
package com.hchen.hyperislandapi;

import android.net.Uri;

public final class Const {
    public static class ActionType {
        public static final int ACTION_TYPE_NORMAL = 0;
        public static final int ACTION_TYPE_PROGRESS = 1;
        public static final int ACTION_TYPE_TEXT = 2;
    }

    public static class AnimType {
        public static final int ACTION_TYPE_DEFAULT = 0;
        public static final int ANIM_TYPE_SHADER = 2;
        public static final int ANIM_TYPE_VIDEO = 1;
    }

    public static class DynamicIsland {
        public static final String EXTRA_EFFECT_COLOR = "miui.effect.color";
        public static final String EXTRA_EFFECT_SRC = "miui.effect.src";
        public static final String EXTRA_MIUI_PENDING_INTENT = "miui.pending.intent";
        public static final String EXTRA_MIUI_PKG = "miui.pkg.name";
        public static final String EXTRA_MIUI_SBN = "miui.sbn";
        public static final String EXTRA_MIUI_UID = "miui.user.id";
        public static final String LOTTIE_FAKE_VIEW_VID = "miui.focus.lottieView.fake.id";
        public static final String LOTTIE_VIEW_IS_PLAY = "miui.focus.lottieView.isPlay";
        public static final String LOTTIE_VIEW_VID = "miui.focus.lottieView.id";
    }

    public static class FACE_RECOGNITION {
        public static final String FACE_ID = "face_id";
        public static final String FACE_RECOGNITION = "face_recognition";
        public static final String FACE_RECOGNITION_FAILED = "face_recognition_failed";
        public static final String FACE_RECOGNITION_SUCCESS = "face_recognition_success";
        public static final String FACE_TYPE = "face_type";
    }

    public static class Module {
        public static final String MODULE_ANIMATION_TEXT = "moduleAnimationText";
        public static final String MODULE_BACKGROUND = "moduleBackground";
        public static final String MODULE_BUTTON_1 = "moduleButton1";
        public static final String MODULE_BUTTON_2 = "moduleButton2";
        public static final String MODULE_BUTTON_3 = "moduleButton3";
        public static final String MODULE_BUTTON_4 = "moduleButton4";
        public static final String MODULE_BUTTON_5 = "moduleButton5";
        public static final String MODULE_COVER = "moduleCover";
        public static final String MODULE_IMAGE_TEXT_HIGHLIGHT = "moduleImageTextHighlight";
        public static final String MODULE_IMAGE_TEXT_HIGHLIGHT_SPORT = "moduleImageTextHighlightSport";
        public static final String MODULE_IMAGE_TEXT_HIGHLIGHT_TIME = "moduleImageTextHighlightTime";
        public static final String MODULE_IMAGE_TEXT_IM = "moduleImageTextIM";
        public static final String MODULE_MARK_1 = "moduleMark1";
        public static final String MODULE_MARK_2 = "moduleMark2";
        public static final String MODULE_MARK_3 = "moduleMark3";
        public static final String MODULE_MARK_4 = "MODULE_MARK_4";
        public static final String MODULE_MARK_TEXT_IMAGE = "MODULE_MARK_TEXT_IMAGE";
        public static final String MODULE_MULTI_PROGRESS = "moduleMultiProgress";
        public static final String MODULE_NEW_IMAGE_TEXT = "moduleNewImageText";
        public static final String MODULE_PROGRESS = "moduleProgress";
        public static final String MODULE_TEXT_1 = "moduleText1";
        public static final String MODULE_TEXT_2 = "moduleText2";
        public static final String MODULE_TEXT_HINT_INFO = "moduleTextHintInfo";
    }

    public static class Param {
        public static final int BASE_INFO_TYPE = 1;
        public static final int BASE_INFO_REVERSED_TYPE = 2;
        public static final int BG_ALL_TYPE = 1;
        public static final int BG_PART_TYPE = 2;
        public static final int DEEPLINK_TYPE_URL = 1;
        public static final int DEEPLINK_TYPE_ACTION = 2;
        public static final int DEEPLINK_TYPE_SERVICE = 3;
        public static final int HIGHLIGHT_TIME_TYPE = 1;
        public static final int HIGHLIGHT_SPORT_TYPE = 2;
        public static final int HINT_INFO_SIMPLE_TYPE = 1;
        public static final int HINT_INFO_COMPLEX_TYPE = 2;
        public static final int ICON_TEXT_TYPE_EAR = 1;
        public static final int PIC_INFO_SMALL_TYPE = 1;
        public static final int PIC_INFO_MIDDLE_TYPE = 2;
        public static final int PIC_INFO_LARGE_TYPE = 3;
        public static final int PIC_INFO_ACTION_TYPE = 4;
        public static final int PIC_INFO_TEXT_IMAGE_TYPE = 5;
        public static final String ACTION_VId_1 = "miui.focus.action_1";
        public static final String ACTION_VId_2 = "miui.focus.action_2";
        public static final String AOD_ICON_VId = "miui.focus.aodIconId";
        public static final String BG_IMAGE_COLOR_BITMAP = "miui.focus.bgImageColorBitmap";
        public static final String BG_IMAGE_PART_BITMAP = "miui.focus.bgImagePartBitmap";
        public static final String BG_IMAGE_VID = "miui.focus.bgImageId";
        public static final String CHRONOMETER_VId = "miui.focus.chronometerId";
        public static final String COLOR_BG = "colorBg";
        public static final String COLOR_BG_DARK = "colorBgDark";
        public static final String COLOR_CONTENT = "colorContent";
        public static final String COLOR_CONTENT_DARK = "colorContentDark";
        public static final String COLOR_DESC = "colorDesc";
        public static final String COLOR_DESC_DARK = "colorDescDark";
        public static final String COLOR_PROGRESS = "colorProgress";
        public static final String COLOR_PROGRESS_END = "colorProgressEnd";
        public static final String COLOR_TITLE = "colorTitle";
        public static final String COLOR_TITLE_DARK = "colorTitleDark";
        public static final String CONTAINER_VId = "miui.focus.containerId";
        public static final String CONTENT = "content";
        public static final String CONTENT_ADAPT_LAYOUT = "miui.focus.adaptContentLayout";
        public static final String CONTENT_ADAPT_VIEW_IDS = "miui.focus.adaptContentIds";
        public static final String DESC_1 = "desc1";
        public static final String DESC_2 = "desc2";
        public static final String EFFECT_ID = "effect_id";
        public static final String EFFECT_TYPE = "effect_type";
        public static final String ENABLE_FLOAT = "enableFloat";
        public static final String EXTRA_CUSTOM_HIDE_BORDER = "miui.customHideBorder";
        public static final String EXTRA_ENABLE_FLOAT = "miui.enableFloat";
        public static final String EXTRA_EXIT_FLOATING = "miui.exitFloating";
        public static final String EXTRA_FOCUS_ENABLE_ALERT = "miui.focus.enableAlert";
        public static final String EXTRA_FOCUS_REOPEN = "miui.focus.reopen";
        public static final String EXTRA_ISLAND_FIRST_FLOAT = "miui.island.firstFloat";
        public static final String EXTRA_ISLAND_UPDATE_NO_FLOAT = "miui.island.updateNoFloat";
        public static final String EXTRA_MIUI_TIMEOUT = "miui.timeout";
        public static final String EXTRA_PROGRESS_SEGMENTS = "android.progressSegments";
        public static final String EXTRA_TARGET_PKG = "miui.targetPkg";
        public static final String EXTRA_TICKER_AUTO_CLOSE = "miui.focus.tickerAutoClose";
        public static final String FILTER_WHEN_NO_PERMISSION = "filterWhenNoPermission";
        public static final String HAS_CUSTOM_BG = "miui.focus.hasCustomBg";
        public static final String ICON_VId = "miui.focus.iconId";
        public static final String IS_AUTO_PROGRESS = "isAutoProgress";
        public static final String IS_FIRST_FLOAT = "islandFirstFloat";
        public static final String IS_FOCUS_LAYOUT = "miui.focus.isFocus";
        public static final String LAYOUT = "miui.focus.rv";
        public static final String LAYOUT_AOD = "miui.focus.rvAod";
        public static final String LAYOUT_DECO_LAND = "miui.focus.rv.deco.land";
        public static final String LAYOUT_DECO_LAND_NIGHT = "miui.focus.rv.deco.land.night";
        public static final String LAYOUT_DECO_PORT = "miui.focus.rv.deco.port";
        public static final String LAYOUT_DECO_PORT_NIGHT = "miui.focus.rv.deco.port.night";
        public static final String LAYOUT_FLIP_TINY = "miui.focus.rv.tiny";
        public static final String LAYOUT_FLIP_TINY_NIGHT = "miui.focus.rv.tinyNight";
        public static final String LAYOUT_NIGHT = "miui.focus.rvNight";
        public static final String EXTRA_FOCUS_DARK_ISLAND_EXPAND_VIEW = "miui.focus.rv.island.expand";
        public static final String MODULE_BUTTON = "miui.focus.moduleButtonId";
        public static final String NORMAL_HEIGHT = "miui.focus.normalHeight";
        public static final String NOTIFICATION_CANCEL = "cancel";
        public static final String NOTIFICATION_IS_SHOW = "isShowNotification";
        public static final String N_ID = "notificationId";
        public static final String OUT_EFFECT_SRC = "outEffectSrc";
        public static final String PADDING = "padding";
        public static final String PARAM_ACTION_BUNDLE = "miui.focus.actions";
        public static final String PARAM_AOD_PIC = "aodPic";
        public static final String PARAM_AOD_TITLE = "aodTitle";
        public static final String PARAM_BITMAP_BUNDLE = "miui.focus.pics";
        public static final String PARAM_ISLAND = "param_island";
        public static final String PARAM_IS_SOLID_BG = "miui.focus.isSolidBg";
        public static final String PARAM_META = "miui.focus.meta";
        public static final String PARAM_PASS_CUSTOM = "miui.focus.param.custom";
        public static final String PARAM_PASS_THOUGH = "miui.focus.param";
        public static final String PARAM_REOPEN = "reopen";
        public static final String PARAM_TICKER = "ticker";
        public static final String PARAM_TICKER_PIC = "tickerPic";
        public static final String PARAM_TICKER_PIC_DARK = "tickerPicDark";
        public static final String PARAM_V2 = "param_v2";
        public static final String PARAM_V3 = "param_v3";
        public static final String PARAM_VOIP_V2 = "param_voip_v2";
        public static final String PIC_BG = "picBg";
        public static final String PROGRESS = "progress";
        public static final String PROGRESS_BACK_ENABLE = "miui.focus.backProgressEnable";
        public static final String PROGRESS_BACK_VId = "miui.focus.backprogressId";
        public static final String PROGRESS_BAR_VID = "miui.focus.progressBarId";
        public static final String PROGRESS_COUNT = "progressCount";
        public static final String PROGRESS_THUMB_VID = "miui.focus.progressThumbId";
        public static final String PROTOCOL = "protocol";
        public static final String REMOVE_REASON = "miui.focus.removeReason";
        public static final String REOPEN_FALSE = "close";
        public static final String REOPEN_TRUE = "reopen";
        public static final String SCENE = "scene";
        public static final String SCENE_STATE = "sceneState";
        public static final String SEQUENCE = "sequence";
        public static final String SHOW_NOTIFICATION = "show_notification";
        public static final String SHOW_SMALL_ICON = "showSmallIcon";
        public static final String STATUS_PROGRESS_LAYOUT = "StatusProgressLayout";
        public static final String SUB_TITLE = "subTitle";
        public static final String TEXT_VIds = "miui.focus.textIds";
        public static final String TICKER = "miui.focus.ticker";
        public static final String TICKER_PIC = "miui.focus.pic_ticker";
        public static final String TICKER_PIC_DARK = "miui.focus.pic_ticker_dark";
        public static final String TIMEOUT_MIN = "timeout";
        public static final String TIMER_CURRENT = "timerCurrent";
        public static final String TIMER_SYSTEM_CURRENT = "timerSystemCurrent";
        public static final String TIMER_TOTAL = "timerTotal";
        public static final String TIMER_TYPE = "timerType";
        public static final String TIMER_WHEN = "timerWhen";
        public static final String TITLE = "title";
        public static final String TITLE_ADAPT_LAYOUT = "miui.focus.adaptTitleLayout";
        public static final String TITLE_ADAPT_VIEW_IDS = "miui.focus.adaptTitleIds";
        public static final String TITLE_HIGHLIGHT_ADAPT_LAYOUT = "miui.focus.adaptTitleHighlightLayout";
        public static final String TITLE_HIGHLIGHT_ADAPT_VIEW_IDS = "miui.focus.adaptTitleHighlightIds";
        public static final String TITLE_HINT_ADAPT_LAYOUT = "miui.focus.adaptTitleHintLayout";
        public static final String TITLE_HINT_ADAPT_VIEW_IDS = "miui.focus.adaptTitleHintIds";
        public static final String TITLE_SAMPLE_HINT_ADAPT_LAYOUT = "miui.focus.adaptTitleSampleHintLayout";
        public static final String TITLE_SAMPLE_HINT_ADAPT_VIEW_IDS = "miui.focus.adaptTitleSampleHintIds";
        public static final String UPDATABLE = "updatable";
    }

    public static class Pkg {
        public static final String PKG_HYBRID = "com.miui.hybrid";
        public static final String PKG_XMSF = "com.xiaomi.xmsf";
    }

    public static class Provider {
        public static final String METHOD_CAN_SHOW_FOCUS = "canShowFocus";
        public static final String NOTIFICATION_FOCUS_PROTOCOL = "notification_focus_protocol";
        public static final String NOTIFICATION_PROVIDER = "content://statusbar.notification";
        public static final String PARM_CAN_SHOW_FOCUS = "canShowFocus";
        public static final String PARM_PACKAGE = "package";
        public static final Uri URI_CAN_SHOW_FOCUS = Uri.parse("content://statusbar.notification/canShowFocus");
    }

    public static class Scene {
        public static final String ALARM = "alarm";
        public static final String ANNIVERSARY = "anniversary";
        public static final String CAR_HAILING = "carHailing";
        public static final String EVENT = "events";
        public static final String FOOD_DELIVERY = "foodDelivery";
        public static final String MISSED_CALLS = "missedCalls";
        public static final String RECORDER = "recorder";
        public static final String SMART_HOME_ALERT = "smartHomeAlert";
        public static final String SOS = "sos";
        public static final String TIMER = "timer";
        public static final String VERIFY_CODE = "verifyCode";
    }

    public static class Template {
        public static final String TEMPLATE_BASE = "templateBaseScene";
        public static final String TEMPLATE_BASE_PROGRESS = "templateBaseProgressScene";
        public static final String TEMPLATE_BASE_REVERT = "templateRevertScene";
        public static final String TEMPLATE_BASE_REVERT_OVERSIZE = "templateRevertOversizeScene";
        public static final String TEMPLATE_BASE_REVERT_PROGRESS = "templateRevertProgressScene";
    }
}

