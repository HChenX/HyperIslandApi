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

import android.os.Bundle;
import android.widget.RemoteViews;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import com.hchen.hyperislandapi.Const;

/**
 * 自定布局模板，对应官方 RemoteViews 自定义焦点通知/超级岛能力。
 * <p>
 * 各场景（日间/夜间、AOD、装饰、微胶囊、岛展开）均可单独指定
 * {@link RemoteViews}，最终以 {@code miui.focus.param.custom} 的方式返回给系统。
 */
public final class ViewsTemplate {
    private RemoteViews rvView;
    private RemoteViews rvNightView;
    private RemoteViews rvAodView;
    private RemoteViews rvDecoLandView;
    private RemoteViews rvDecoLandNightView;
    private RemoteViews rvDecoPortView;
    private RemoteViews rvDecoPortNightView;
    private RemoteViews rvTinyView;
    private RemoteViews rvTinyNightView;
    private RemoteViews rvIslandExpandView;

    @Keep
    private final Bundle bundle = new Bundle(); // inner use

    /** 设置日间模式通知视图。 */
    public ViewsTemplate setRvView(RemoteViews rvView) {
        this.rvView = rvView;
        bundle.putParcelable(Const.Param.LAYOUT, rvView);
        return this;
    }

    /** 设置夜间模式通知视图。 */
    public ViewsTemplate setRvNightView(RemoteViews rvNightView) {
        this.rvNightView = rvNightView;
        bundle.putParcelable(Const.Param.LAYOUT_NIGHT, rvNightView);
        return this;
    }

    /** 设置 AOD 场景通知视图。 */
    public ViewsTemplate setRvAodView(RemoteViews rvAodView) {
        this.rvAodView = rvAodView;
        bundle.putParcelable(Const.Param.LAYOUT_AOD, rvAodView);
        return this;
    }

    /** 设置横屏装饰视图。 */
    public ViewsTemplate setRvDecoLandView(RemoteViews rvDecoLandView) {
        this.rvDecoLandView = rvDecoLandView;
        bundle.putParcelable(Const.Param.LAYOUT_DECO_LAND, rvDecoLandView);
        return this;
    }

    /** 设置横屏装饰夜间视图。 */
    public ViewsTemplate setRvDecoLandNightView(RemoteViews rvDecoLandNightView) {
        this.rvDecoLandNightView = rvDecoLandNightView;
        bundle.putParcelable(Const.Param.LAYOUT_DECO_LAND_NIGHT, rvDecoLandNightView);
        return this;
    }

    /** 设置竖屏装饰视图。 */
    public ViewsTemplate setRvDecoPortView(RemoteViews rvDecoPortView) {
        this.rvDecoPortView = rvDecoPortView;
        bundle.putParcelable(Const.Param.LAYOUT_DECO_PORT, rvDecoPortView);
        return this;
    }

    /** 设置竖屏装饰夜间视图。 */
    public ViewsTemplate setRvDecoPortNightView(RemoteViews rvDecoPortNightView) {
        this.rvDecoPortNightView = rvDecoPortNightView;
        bundle.putParcelable(Const.Param.LAYOUT_DECO_PORT_NIGHT, rvDecoPortNightView);
        return this;
    }

    /** 设置微胶囊（翻转）视图。 */
    public ViewsTemplate setRvTinyView(RemoteViews rvTinyView) {
        this.rvTinyView = rvTinyView;
        bundle.putParcelable(Const.Param.LAYOUT_FLIP_TINY, rvTinyView);
        return this;
    }

    /** 设置微胶囊夜间视图。 */
    public ViewsTemplate setRvTinyNightView(RemoteViews rvTinyNightView) {
        this.rvTinyNightView = rvTinyNightView;
        bundle.putParcelable(Const.Param.LAYOUT_FLIP_TINY_NIGHT, rvTinyNightView);
        return this;
    }

    /** 设置岛展开视图。 */
    public ViewsTemplate setRvIslandExpandView(RemoteViews rvIslandExpandView) {
        this.rvIslandExpandView = rvIslandExpandView;
        bundle.putParcelable(Const.Param.EXTRA_FOCUS_DARK_ISLAND_EXPAND_VIEW, rvIslandExpandView);
        return this;
    }

    public RemoteViews getRvView() {
        return rvView;
    }

    public RemoteViews getRvNightView() {
        return rvNightView;
    }

    public RemoteViews getRvAodView() {
        return rvAodView;
    }

    public RemoteViews getRvDecoLandView() {
        return rvDecoLandView;
    }

    public RemoteViews getRvDecoLandNightView() {
        return rvDecoLandNightView;
    }

    public RemoteViews getRvDecoPortView() {
        return rvDecoPortView;
    }

    public RemoteViews getRvDecoPortNightView() {
        return rvDecoPortNightView;
    }

    public RemoteViews getRvTinyView() {
        return rvTinyView;
    }

    public RemoteViews getRvTinyNightView() {
        return rvTinyNightView;
    }

    public RemoteViews getRvIslandExpandView() {
        return rvIslandExpandView;
    }

    @NonNull
    @Override
    public String toString() {
        return "ViewsTemplate{" +
            "rvView=" + rvView +
            ", rvAodView=" + rvAodView +
            ", rvDecoLandView=" + rvDecoLandView +
            ", rvDecoLandNightView=" + rvDecoLandNightView +
            ", rvDecoPortView=" + rvDecoPortView +
            ", rvDecoPortNightView=" + rvDecoPortNightView +
            ", rvTinyView=" + rvTinyView +
            ", rvTinyNightView=" + rvTinyNightView +
            ", rvNightView=" + rvNightView +
            ", rvIslandExpandView=" + rvIslandExpandView +
            '}';
    }
}
