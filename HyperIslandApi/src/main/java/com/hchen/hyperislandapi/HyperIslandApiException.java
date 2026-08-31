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
package com.hchen.hyperislandapi;

/**
 * HyperIslandApi 的统一运行期异常，所有构建与序列化失败均包装为该异常抛出。
 * <p>
 * 包装时保留原始 {@code cause}，调用方可通过 {@link #getCause()} 定位根因。
 */
public class HyperIslandApiException extends RuntimeException {
    /**
     * 构造异常。
     *
     * @param message 异常说明
     */
    public HyperIslandApiException(String message) {
        super(message);
    }

    /**
     * 构造异常并携带根因。
     *
     * @param message 异常说明
     * @param cause   根因
     */
    public HyperIslandApiException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构造异常并携带根因，说明沿用根因。
     *
     * @param cause 根因
     */
    public HyperIslandApiException(Throwable cause) {
        super(cause);
    }
}