# 我的博客
每个人都应该自己手动写一个博客，记录自己的学习和生活。即使是在 AI 辅助编程如此发达的现在。

## 技术栈
- Spring Boot + MyBatis Plus 

## 前言
写这个烂大街的项目有很多个，最主要的原因是像熟悉 Java 的 springboot 这一套开发流程。之前只用过 PHP 和 Go 语言。

其次，即使是最简单的项目，如果要把它做到极致的好，也是非常难的。

写这个项目的同时，也配套一定的文档指南，以提供给和我一样需要着手使用 Java 开发 web 服务的人。

为了能尽快开始进入开发，就省略掉 MySQL 的表设计，直接使用[现有的表](https://github.com/grtsinry43/grtblog/blob/48279bb81c6e7dd339b59a84f25e8c3c87e842b9/mysql-init/init.sql)，来自于 [grtblog 项目](https://github.com/grtsinry43/grtblog)

与原项目不同的是，我会先[根据接口](https://grtblog.js.org/api-examples.html)，按照自己的想法实现，当然如果遇到不知道如何实现的地方，还是会去参考[源代码](https://github.com/grtsinry43/grtblog)。

### 项目的创建
直接使用 idea 作为 ide，为了能用上多模块，我硬是将服务拆成了 `web` module 和 `m-service` module。但是不知道为什么，idea 无法正确识别父子模块（有知道的朋友，欢迎告诉我原因）。

为了不影响项目开发，小问题我暂且跳过。

### 用户模块
[点击查看](./docs/note/user.md)

### 文章管理
- todo

### 分类管理
- todo

### 标签管理
- todo

## ref
- https://github.com/grtsinry43/grtblog