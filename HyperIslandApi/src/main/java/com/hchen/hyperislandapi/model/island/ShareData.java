package com.hchen.hyperislandapi.model.island;

import java.util.Objects;

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

    @Override public boolean equals(Object o) {
        if (!(o instanceof ShareData shareData)) return false;
        return Objects.equals(content, shareData.content) && Objects.equals(pic, shareData.pic) && Objects.equals(shareContent, shareData.shareContent) && Objects.equals(sharePic, shareData.sharePic) && Objects.equals(title, shareData.title);
    }

    @Override public int hashCode() {
        return Objects.hash(content, pic, shareContent, sharePic, title);
    }

    @Override public String toString() {
        return "ShareData{" +
            "content='" + content + '\'' +
            ", pic='" + pic + '\'' +
            ", shareContent='" + shareContent + '\'' +
            ", sharePic='" + sharePic + '\'' +
            ", title='" + title + '\'' +
            '}';
    }
}
