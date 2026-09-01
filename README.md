<div align="center">
<h1>HyperIslandApi</h1>

![stars](https://img.shields.io/github/stars/HChenX/HyperIslandApi?style=flat)
![Github repo size](https://img.shields.io/github/repo-size/HChenX/HyperIslandApi)
[![GitHub release (latest by date)](https://img.shields.io/github/v/release/HChenX/HyperIslandApi)](https://github.com/HChenX/HyperIslandApi/releases)
[![GitHub Release Date](https://img.shields.io/github/release-date/HChenX/HyperIslandApi)](https://github.com/HChenX/HyperIslandApi/releases)
![last commit](https://img.shields.io/github/last-commit/HChenX/HyperIslandApi?style=flat)
![language](https://img.shields.io/badge/language-java-purple)

[//]: # (<p><b><a href="README.md">简体中文</a></b></p>)
<p>Hyper Island Api</p>
</div>

---

## ✨ 项目介绍

- 从小米 Hyper OS 系统中提取的超级岛 / 焦点通知 API，整理并封装而成。
- 小米官方接入需要手写 JSON，本库将文件编写转化为直接调用 API 代码，由库自动序列化。

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
    implementation 'com.github.HChenX:HyperIslandApi:0.9' // 引入依赖
    implementation 'com.fasterxml.jackson.core:jackson-databind:2.22.2' // 序列化工具
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

- 注意： 示例仅演示构造过程。

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
