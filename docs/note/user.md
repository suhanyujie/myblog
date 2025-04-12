# 用户管理

用户管理需要调用 MySQL 服务，因此事先准备好对应的配置文件配置项，以及代码相关的 entity，mapper，service 等。

## MySQL 配置

MySQL 配置可以在当前项目下的 resources 目录下的 application.yml 文件中进行配置：

```yaml
spring:
  application:
    name: m-web
  datasource:
    url: jdbc:mysql://localhost:10006/grtblog?serverTimezone=GMT%2B8&characterEncoding=utf-8&useSSL=false
    username: test
    password: test
    driver-class-name: com.mysql.cj.jdbc.Driver
```

## 创建新用户

