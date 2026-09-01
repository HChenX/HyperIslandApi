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
package com.hchen.hyperislandapi.callback;

import androidx.annotation.Nullable;

import com.hchen.hyperislandapi.HyperIslandApi;
import com.hchen.hyperislandapi.template.IslandTemplate;
import com.hchen.hyperislandapi.template.Template;

/**
 * 序列化前回调，用于同时覆盖焦点模板与超级岛模板。
 * <p>
 * 在 {@link HyperIslandApi#build()} 序列化之前调用，
 * 可在此统一处理动态数据、合并 {@link HyperIslandApi#setMergeJson(String)} 后的结果。
 */
public interface CoverCallback {
    /**
     * 覆盖模板数据。
     *
     * @param template      焦点模板，可能为 {@code null}
     * @param islandTemplate 超级岛模板，可能为 {@code null}
     */
    void cover(@Nullable Template template, @Nullable IslandTemplate islandTemplate);
}
