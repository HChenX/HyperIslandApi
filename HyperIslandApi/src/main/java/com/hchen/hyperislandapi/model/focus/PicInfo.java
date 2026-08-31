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
 * 焦点通知中的图片信息，对应官方 {@code PicInfo}。
 * <p>
 * {@code pic} 为图片 key，需与 {@code miui.focus.pics} Bundle 中的键一致；
 * 深色模式可用 {@code picDark} 单独指定。
 */
public final class PicInfo extends TextAndColorInfo<PicInfo> {
    private ActionInfo actionInfo;
    private String pic;
    private String picDark;
    private Integer type;

    /** 设置图片关联的动作信息。 */
    public PicInfo setActionInfo(ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }

    /** 设置图片 key，需与 {@code miui.focus.pics} Bundle 中的键一致。 */
    public PicInfo setPic(String pic) {
        this.pic = pic;
        return this;
    }

    /** 设置深色模式图片 key，未设置时官方回退到 {@code pic}。 */
    public PicInfo setPicDark(String picDark) {
        this.picDark = picDark;
        return this;
    }

    /** 设置图片类型，如小图、中图、大图、动作图等。 */
    public PicInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public ActionInfo getActionInfo() {
        return actionInfo;
    }

    public String getPic() {
        return pic;
    }

    public String getPicDark() {
        return picDark;
    }

    public Integer getType() {
        return type;
    }

    @NonNull
    @Override
    public String toString() {
        return "PicInfo{" +
            "actionInfo=" + actionInfo +
            ", pic='" + pic + '\'' +
            ", picDark='" + picDark + '\'' +
            ", type=" + type +
            "} " + super.toString();
    }
}
