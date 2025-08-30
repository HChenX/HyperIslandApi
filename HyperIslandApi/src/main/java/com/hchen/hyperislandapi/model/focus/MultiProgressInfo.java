package com.hchen.hyperislandapi.model.focus;


import java.util.Objects;

public final class MultiProgressInfo extends TextAndColorInfo {
    private String color;
    private int points = 0;
    private int progress = -1;

    public MultiProgressInfo setColor(String color) {
        this.color = color;
        return this;
    }

    public MultiProgressInfo setPoints(int points) {
        this.points = points;
        return this;
    }

    public MultiProgressInfo setProgress(int progress) {
        this.progress = progress;
        return this;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof MultiProgressInfo that)) return false;
        return points == that.points && progress == that.progress && Objects.equals(color,
            that.color);
    }

    @Override public int hashCode() {
        return Objects.hash(color, points, progress);
    }

    @Override public String toString() {
        return "MultiProgressInfo{" +
            "color='" + color + '\'' +
            ", points=" + points +
            ", progress=" + progress +
            "} " + super.toString();
    }
}
