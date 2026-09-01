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

/**
 * 泛型版本的序列化前回调，用于覆盖单个指定类型的模板。
 * <p>
 * 由 {@link com.hchen.hyperislandapi.HyperIslandApi#build(String, Object, CoverTemplateCallback2)} 使用。
 *
 * @param <T> 模板类型
 */
public interface CoverTemplateCallback2<T> {
    /**
     * 覆盖模板数据。
     *
     * @param template 待覆盖的模板实例
     */
    void cover(T template);
}
