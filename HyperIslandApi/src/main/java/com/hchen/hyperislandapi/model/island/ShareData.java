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
package com.hchen.hyperislandapi.model.island;

import androidx.annotation.NonNull;

public final class ShareData {
    private String content;
    private String pic;
    private String shareContent;
    private String sharePic;
    private String title;

    public ShareData setContent(String content) {
        this.content = content;
        return this;
    }

    public ShareData setPic(String pic) {
        this.pic = pic;
        return this;
    }

    public ShareData setShareContent(String shareContent) {
        this.shareContent = shareContent;
        return this;
    }

    public ShareData setSharePic(String sharePic) {
        this.sharePic = sharePic;
        return this;
    }

    public ShareData setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public String getPic() {
        return pic;
    }

    public String getShareContent() {
        return shareContent;
    }

    public String getSharePic() {
        return sharePic;
    }

    public String getTitle() {
        return title;
    }

    @NonNull
    @Override
    public String toString() {
        return "ShareData{" +
            "content='" + content + '\'' +
            ", pic='" + pic + '\'' +
            ", shareContent='" + shareContent + '\'' +
            ", sharePic='" + sharePic + '\'' +
            ", title='" + title + '\'' +
            '}';
    }
}
