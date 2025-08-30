package com.hchen.hyperislandapi.model.island;

import java.util.Objects;

public final class ProgressTextInfo {
    private ProgressInfo progressInfo;
    private TextInfo textInfo;

    public ProgressTextInfo setProgressInfo(ProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    public ProgressTextInfo setTextInfo(TextInfo textInfo) {
        this.textInfo = textInfo;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof ProgressTextInfo that)) return false;
        return Objects.equals(progressInfo, that.progressInfo) && Objects.equals(textInfo,
            that.textInfo);
    }

    @Override public int hashCode() {
        return Objects.hash(progressInfo, textInfo);
    }

    @Override public String toString() {
        return "ProgressTextInfo{" +
            "progressInfo=" + progressInfo +
            ", textInfo=" + textInfo +
            '}';
    }
}
