package com.hchen.hyperislandapi;

import android.os.Bundle;

import androidx.core.app.NotificationCompat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hchen.hyperislandapi.template.FocusTemplate;
import com.hchen.hyperislandapi.template.IslandTemplate;
import com.hchen.hyperislandapi.template.Template;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class HyperIslandApi {
    private static final Gson gson =
        new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
    // param_v2
    private Template template;
    // OS1/2 可能使用的焦点数据
    // OS3 同样可用但是是超级岛形态
    private FocusTemplate focusTemplate;
    // OS3 超级岛数据
    // param_island
    private IslandTemplate islandTemplate;
    // 所有 图片/图标 等数据放置此处
    // 并且和 pic 等数据 key 相同
    // 比如 picBundle.putParcelable("miui.focus.pic_ado_pic", Icon.createWithBitmap(bitmap))
    // 则 "aodPic": "miui.focus.pic_ado_pic"
    private Bundle picBundle;
    // 与上面类似，所有动作相关数据放置此处
    // 并且与 action 数据 key 对应
    private Bundle actionBundle;

    public HyperIslandApi() {
    }

    public HyperIslandApi setTemplate(Template template) {
        this.template = template;
        return this;
    }

    public HyperIslandApi setFocusTemplate(FocusTemplate focusTemplate) {
        this.focusTemplate = focusTemplate;
        return this;
    }

    public HyperIslandApi setIslandTemplate(IslandTemplate islandTemplate) {
        this.islandTemplate = islandTemplate;
        return this;
    }

    public HyperIslandApi setPicBundle(Bundle picBundle) {
        this.picBundle = picBundle;
        return this;
    }

    public HyperIslandApi setActionBundle(Bundle actionBundle) {
        this.actionBundle = actionBundle;
        return this;
    }

    public NotificationCompat.Builder build(NotificationCompat.Builder builder) {
        Objects.requireNonNull(builder);

        Bundle bundle = new Bundle();
        if (picBundle != null) bundle.putBundle("miui.focus.pics", picBundle);
        if (actionBundle != null) bundle.putBundle("miui.focus.actions", actionBundle);
        if (focusTemplate == null) focusTemplate = new FocusTemplate();

        try {
            JSONObject object = new JSONObject(gson.toJson(focusTemplate));
            if (template != null) object.put("param_v2", new JSONObject(gson.toJson(template)));
            if (islandTemplate != null)
                object.put("param_island", new JSONObject(gson.toJson(islandTemplate)));
            bundle.putString("miui.focus.param", object.toString());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        Bundle extras = builder.getExtras();
        extras.putAll(bundle);
        return builder;
    }
}
