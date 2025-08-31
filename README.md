<div align="center">
<h1>HyperIslandApi</h1>

![stars](https://img.shields.io/github/stars/HChenX/HyperIslandApi?style=flat)
![Github repo size](https://img.shields.io/github/repo-size/HChenX/HyperIslandApi)
[![GitHub release (latest by date)](https://img.shields.io/github/v/release/HChenX/HyperIslandApi)](https://github.com/HChenX/HyperIslandApi/releases)
[![GitHub Release Date](https://img.shields.io/github/release-date/HChenX/HyperIslandApi)](https://github.com/HChenX/HyperIslandApi/releases)
![last commit](https://img.shields.io/github/last-commit/HChenX/HyperIslandApi?style=flat)
![language](https://img.shields.io/badge/language-java-purple)

<p><b><a href="README.md">简体中文</a></b></p>
<p>Hyper Island Api</p>
</div>

---

## ✨ API 介绍

- 从 Hyper 系统中提取的超级岛部分 API 并整理而成
- 如果你不是 Root 用户并且不从事模块开发，那么您大概率用不到本 API

---

## ✨ 导入依赖

- 添加依赖：

```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' } // 添加 JitPack 库
    }
}

dependencies {
    implementation 'com.github.HChenX:HyperIslandApi:v.0.2' // 引入依赖
    implementation 'com.fasterxml.jackson.core:jackson-databind:3.5.5' // 序列化工具
}
```

- 同步项目并下载完成后即可使用本 API。

---

## 🛠 模块使用

- 使用方法：

```java
public class Test {
    public void test() {
        // 代码仅作示例，不一定可用
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID);
        // TODO

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
        api.setPicBundle(bundle);
        api.build(builder);

        Notification notification = builder.build();
        notificationManager.notify(1, notification);
    }
}
```

---

## 🌟 混淆配置

```text
// 不建议混淆本 API
-keep class com.hchen.hyperislandapi.* {*;}
```
