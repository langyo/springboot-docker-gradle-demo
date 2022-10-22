# Spring Boot 模板 - 基于 Gradle 与 Docker

请先确保环境已经安装 Docker。如果仅运行而不修改编辑项目，可以不安装 Gradle。

## 构建

```shell
docker build -t spring-test .
```

## 运行

> 默认端口为 3000。如果你需要更改端口，可以修改以下命令的前一个数字。
> 例如，监听 80 端口，就修改为 80:3000。

```shell
docker run -p 3000:3000 spring-test
```
