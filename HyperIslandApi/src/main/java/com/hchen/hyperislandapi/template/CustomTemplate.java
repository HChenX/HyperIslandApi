package com.hchen.hyperislandapi.template;

import android.os.Bundle;
import android.widget.RemoteViews;

import com.hchen.hyperislandapi.Const;

import java.util.Objects;

public final class CustomTemplate {
    private RemoteViews rvView;
    private RemoteViews rvAodView;
    private RemoteViews rvDecoLandView;
    private RemoteViews rvDecoLandNightView;
    private RemoteViews rvDecoPortView;
    private RemoteViews rvDecoPortNightView;
    private RemoteViews rvTinyView;
    private RemoteViews rvTinyNightView;
    private RemoteViews rvNightView;
    private RemoteViews rvIslandExpandView;
    private final Bundle bundle = new Bundle();

    public CustomTemplate setRvView(RemoteViews rvView) {
        this.rvView = rvView;
        bundle.putParcelable(Const.Param.LAYOUT, rvView);
        return this;
    }

    public CustomTemplate setRvAodView(RemoteViews rvAodView) {
        this.rvAodView = rvAodView;
        bundle.putParcelable(Const.Param.LAYOUT_AOD, rvAodView);
        return this;
    }

    public CustomTemplate setRvDecoLandView(RemoteViews rvDecoLandView) {
        this.rvDecoLandView = rvDecoLandView;
        bundle.putParcelable(Const.Param.LAYOUT_DECO_LAND, rvDecoLandView);
        return this;
    }

    public CustomTemplate setRvDecoLandNightView(RemoteViews rvDecoLandNightView) {
        this.rvDecoLandNightView = rvDecoLandNightView;
        bundle.putParcelable(Const.Param.LAYOUT_DECO_LAND_NIGHT, rvDecoLandNightView);
        return this;
    }

    public CustomTemplate setRvDecoPortView(RemoteViews rvDecoPortView) {
        this.rvDecoPortView = rvDecoPortView;
        bundle.putParcelable(Const.Param.LAYOUT_DECO_PORT, rvDecoPortView);
        return this;
    }

    public CustomTemplate setRvDecoPortNightView(RemoteViews rvDecoPortNightView) {
        this.rvDecoPortNightView = rvDecoPortNightView;
        bundle.putParcelable(Const.Param.LAYOUT_DECO_PORT_NIGHT, rvDecoPortNightView);
        return this;
    }

    public CustomTemplate setRvTinyView(RemoteViews rvTinyView) {
        this.rvTinyView = rvTinyView;
        bundle.putParcelable(Const.Param.LAYOUT_FLIP_TINY, rvTinyView);
        return this;
    }

    public CustomTemplate setRvTinyNightView(RemoteViews rvTinyNightView) {
        this.rvTinyNightView = rvTinyNightView;
        bundle.putParcelable(Const.Param.LAYOUT_FLIP_TINY_NIGHT, rvTinyNightView);
        return this;
    }

    public CustomTemplate setRvNightView(RemoteViews rvNightView) {
        this.rvNightView = rvNightView;
        bundle.putParcelable(Const.Param.LAYOUT_NIGHT, rvNightView);
        return this;
    }

    public CustomTemplate setRvIslandExpandView(RemoteViews rvIslandExpandView) {
        this.rvIslandExpandView = rvIslandExpandView;
        bundle.putParcelable(Const.Param.EXTRA_FOCUS_DARK_ISLAND_EXPAND_VIEW, rvIslandExpandView);
        return this;
    }

    // Inner
    public Bundle getBundle() {
        return bundle;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof CustomTemplate that)) return false;
        return Objects.equals(rvView, that.rvView) && Objects.equals(rvAodView, that.rvAodView) && Objects.equals(rvDecoLandView, that.rvDecoLandView) && Objects.equals(rvDecoLandNightView, that.rvDecoLandNightView) && Objects.equals(rvDecoPortView, that.rvDecoPortView) && Objects.equals(rvDecoPortNightView, that.rvDecoPortNightView) && Objects.equals(rvTinyView, that.rvTinyView) && Objects.equals(rvTinyNightView, that.rvTinyNightView) && Objects.equals(rvNightView, that.rvNightView) && Objects.equals(rvIslandExpandView, that.rvIslandExpandView);
    }

    @Override public int hashCode() {
        return Objects.hash(rvView, rvAodView, rvDecoLandView, rvDecoLandNightView, rvDecoPortView, rvDecoPortNightView, rvTinyView, rvTinyNightView, rvNightView, rvIslandExpandView);
    }

    @Override public String toString() {
        return "CustomTemplate{" +
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
