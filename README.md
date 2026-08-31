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

## ✨ 项目介绍

- 从小米 Hyper OS 系统中提取的超级岛 / 焦点通知 API，整理并封装而成。
- 小米官方接入需要手写 JSON，本库将文件编写转化为直接调用 API 代码，由库自动序列化。
- 如果不从事模块开发，你大概率用不到本 API。

---

## ✨ 导入依赖

```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' } // 添加 JitPack 库
    }
}

dependencies {
    implementation 'com.github.HChenX:HyperIslandApi:v.0.8' // 引入依赖
    implementation 'com.fasterxml.jackson.core:jackson-databind:2.20.0' // 序列化工具
}
```

- 同步项目并下载完成后即可使用本 API。

---

## 🛠 快速使用

- 三步完成一条焦点通知：
  1. 用 `Template` 配置焦点通知，用 `IslandTemplate` 配置超级岛；
  2. 图片 / 图标放入 `Bundle`，动作放入动作 `Bundle`，与 JSON 中的字符串 key 一一对应；
  3. 调用 `HyperIslandApi#build()` 得到 `Data`，把其中的 JSON 与 Bundle 写入 Notification extras。

- 完整的使用示例（含小米官方 JSON 翻译对照）请参考 `app` 模块下的示例类：

```
app/src/main/java/com/hchen/hyperislandapi/example/MiuiFocusExamples.java
```

- 每个示例都保留了 JSON key 与 API setter 的对应关系，可直接对照官方 JSON 学习字段含义。
- 注意：本库配合模块框架使用，不直接发送通知；小米不允许非授权软件发布 island，
  示例仅演示构造过程。

---

## ✨ 序列化产物说明

- 库只输出 `param_v2`（焦点模板）与其中内嵌的 `param_island`（超级岛模板）字段。
- 未设置字段（null / 默认值 / 空串）不会出现在序列化产物中，与官方 Gson 读取行为一致，
  避免夹杂多余参数导致异常。

---

## ✨ 混淆配置

```text
// 不建议混淆本 API
-keep class com.hchen.hyperislandapi.** {*;}
```

---

## 📜 v.0.8 变更

- 新增 `CompetitionIconTextInfo`（竞争图标文案模块）及 `Template.competitionIconTextInfo`。
- `IslandTemplate` 新增 `appContentDescription`（岛无障碍内容描述）与 `clickDirectIntent`（os4 新增：点击岛直接派发通知意图）；`FixedWidthDigitInfo` 新增 `pic` 字段。
- `MultiProgressInfo.progress` 默认值修正为 `-1`（与官方一致）。
- 新增 VOIP 支持：`setParamKey(Const.Param.PARAM_VOIP_V2)` 可产出通话焦点通知。
- `parse()` 双层自动兼容：既接受完整 `param_v2` 壳，也接受直接给出的模板内容。
- `build()` 不再修改调用方传入的模板实例（构建副本）。
- `Data` 新增 `applyTo(Notification.Builder)` 与 `toExtras()` 便捷写入。
- `HyperIslandApiException` 统一异常。
- 序列化产物不再夹杂空串字段；`Const` 补充官方 `param_island`、VOIP、channeltype、岛状态回调等常量。
- 全量补充 javadoc 文档。