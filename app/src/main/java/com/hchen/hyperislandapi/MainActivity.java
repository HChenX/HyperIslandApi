package com.hchen.hyperislandapi;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hchen.hyperislandapi.model.focus.ActionInfo;
import com.hchen.hyperislandapi.model.focus.BaseInfo;
import com.hchen.hyperislandapi.model.focus.BgInfo;
import com.hchen.hyperislandapi.model.island.BigIslandArea;
import com.hchen.hyperislandapi.model.island.ImageTextInfo;
import com.hchen.hyperislandapi.model.island.PicInfo;
import com.hchen.hyperislandapi.model.island.SmallIslandArea;
import com.hchen.hyperislandapi.template.IslandTemplate;
import com.hchen.hyperislandapi.template.Template;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        EdgeToEdge.enable(this);
        getWindow().setNavigationBarContrastEnforced(false); // Xiaomi moment, this code must be here
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() {
            @NonNull
            @Override
            public WindowInsetsCompat onApplyWindowInsets(@NonNull View v, @NonNull WindowInsetsCompat insets) {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            }
        });

        Button button = findViewById(R.id.click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: " + v);
                sendNotification(MainActivity.this, "Hello", "Hello World", null);
                v.performHapticFeedback(HapticFeedbackConstants.CONTEXT_CLICK);
            }
        });
    }

    private static final String CHANNEL_ID = "channel_id";
    private static final String CHANNEL_NAME = "Channel Name";
    private static final String CHANNEL_DESCRIPTION = "Channel Description";

    public static void sendNotification(Context context, String title, String content, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        createNotificationChannel(context, notificationManager);

        // PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
            .setContentTitle(title)
            .setContentText(content)
            .setSmallIcon(R.mipmap.ic_launcher)
            // .setContentIntent(pendingIntent)
            .setAutoCancel(true);  //  点击通知后自动移除

        HyperIslandApi api = new HyperIslandApi();
        api.setTemplate(new Template()
            .setProtocol(1)
            .setEnableFloat(true)
            .setUpdatable(true)
            .setScene("template_v2")
            .setAodTitle("Aod Title")
            .setTicker("Ticker")
            .setTickerPic("api.demo.pic")
            .setAodPic("api.demo.pic")
            .setIslandFirstFloat(false)
            .setBaseInfo(new BaseInfo()
                .setTitle("B Title")
                .setColorTitle("#FFFFFF")
                .setContent("B Content")
                .setColorContent("#FFFFFF")
                .setSubContent("")
                .setType(2)
            )
            .setBgInfo(new BgInfo()
                .setColorBg("#1A1A1A")
            )
            .setActions(new ActionInfo[]{new ActionInfo()
                .setType(2)
                .setActionTitle("Close")
                .setActionTitleColor("#FFFFFF")
                .setActionBgColor("#1EFFFFFF")
                .setActionBgPressColor("#24FFFFFF")
                .setActionIntentType(2)
            })
        );
        api.setIslandTemplate(new IslandTemplate()
            .setIslandProperty(2)
            .setBigIslandArea(new BigIslandArea()
                .setImageTextInfoLeft(new ImageTextInfo()
                    .setType(1)
                    .setPicInfo(new PicInfo()
                        .setType(1)
                        .setPic("api.demo.island.pic")
                    )
                )
            )
            .setSmallIslandArea(new SmallIslandArea()
                .setPicInfo(new PicInfo()
                    .setType(1)
                    .setPic("api.demo.island.pic")
                )
            )
        );

        Bundle bundle = new Bundle();
        bundle.putParcelable("api.demo.pic", Icon.createWithBitmap(getBitmapFromDrawable(context, R.drawable.ic_launcher_foreground)));
        bundle.putParcelable("api.demo.island.pic", Icon.createWithBitmap(getBitmapFromDrawable(context, R.drawable.ic_launcher_foreground)));
        bundle.putParcelable("miui.appIcon", Icon.createWithBitmap(getBitmapFromDrawable(context, R.drawable.ic_launcher_foreground)));
        api.setPicBundle(bundle);
        api.build(builder);

        Notification notification = builder.build();
        notificationManager.notify(1, notification); // 使用唯一的通知ID
    }

    private static Bitmap getBitmapFromDrawable(Context context, int i2) {
        Drawable drawable = ContextCompat.getDrawable(context, i2);
        if (drawable == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private static void createNotificationChannel(Context context, NotificationManager notificationManager) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription(CHANNEL_DESCRIPTION);
            notificationManager.createNotificationChannel(channel);
        }
    }
}
