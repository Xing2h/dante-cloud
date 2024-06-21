<p align="center"><img src="./readme/new-logo.png" height="300" width="400" alt="logo"/></p>
<h2 align="center">简洁优雅 · 稳定高效 | 宁静致远 · 精益求精 </h2>
<h4 align="center">基于 Spring Authorization Server 全新适配 OAuth 2.1 协议的企业级微服务架构</h4>

---

<p align="center">
    <a href="https://github.com/spring-projects/spring-authorization-server" target="_blank"><img src="https://img.shields.io/badge/Spring%20Authorization%20Server-1.3.1-blue.svg?logo=spring" alt="Spring Authorization Server 1.3.1"></a>
    <a href="https://spring.io/projects/spring-boot" target="_blank"><img src="https://img.shields.io/badge/Spring%20Boot-3.3.1-blue.svg?logo=spring" alt="Spring Boot 3.3.1"></a>
    <a href="https://spring.io/projects/spring-cloud" target="_blank"><img src="https://img.shields.io/badge/Spring%20Cloud-2023.0.2-blue.svg?logo=spring" alt="Spring Cloud 2023.0.2"></a>
    <a href="https://github.com/alibaba/spring-cloud-alibaba" target="_blank"><img src="https://img.shields.io/badge/Spring%20Cloud%20Alibaba-2023.0.1.0-blue.svg?logo=alibabadotcom" alt="Spring Cloud Alibaba 2023.0.1.0"></a>
    <a href="https://github.com/Tencent/spring-cloud-tencent" target="_blank"><img src="https://img.shields.io/badge/Spring%20Cloud%20Tencent-1.14.0--2023.0.0-blue.svg?logo=tencentqq" alt="Spring Cloud Tencent 1.14.0--2023.0.0-SNAPSHOT"></a>
    <a href="https://nacos.io/zh-cn/index.html" target="_blank"><img src="https://img.shields.io/badge/Nacos-2.3.2-brightgreen.svg?logo=alibabadotcom" alt="Nacos 2.3.2"></a>
</p>
<p align="center">
    <a href="#" target="_blank"><img src="https://img.shields.io/badge/Version-3.3.1.0-red.svg?logo=spring" alt="Version 3.3.1.0"></a>
    <a href="https://www.herodotus.cn" target="_blank"><img src="https://img.shields.io/badge/Dante%20Engine-3.3.1.0-red.svg?logo=spring" alt="Dante Engine 3.3.1.0"></a>
    <a href="https://gitee.com/herodotus/dante-oss" target="_blank"><img src="https://img.shields.io/badge/Dante%20OSS-3.3.1.0-red.svg?logo=spring" alt="Dante OSS 3.3.1.0"></a>
    <a href="https://bell-sw.com/pages/downloads/#downloads" target="_blank"><img src="https://img.shields.io/badge/JDK-17%2B-green.svg?logo=openjdk" alt="Java 17"></a>
    <a href="./LICENSE"><img src="https://img.shields.io/badge/License-AGPL--3.0-blue.svg?logo=apache" alt="License AGPL 3.0"></a>
    <a href="https://www.herodotus.cn"><img src="https://visitor-badge.laobi.icu/badge?page_id=dante-cloud&title=Total%20Visits" alt="Total Visits"></a>
    <a href="https://blog.csdn.net/Pointer_v" target="_blank"><img src="https://img.shields.io/badge/Author-%E7%A0%81%E5%8C%A0%E5%90%9B-orange" alt="码匠君"></a>
    <a href="https://gitee.com/dromara/dante-cloud"><img src="https://img.shields.io/github/stars/herodotus-cloud/dante-cloud?style=flat&logo=github" alt="Github star"></a>
    <a href="https://gitee.com/dromara/dante-cloud"><img src="https://img.shields.io/github/forks/herodotus-cloud/dante-cloud?style=flat&logo=github" alt="Github fork"></a>
    <a href="https://gitee.com/dromara/dante-cloud"><img src="https://gitee.com/dromara/dante-cloud/badge/star.svg?theme=dark" alt="Gitee star"></a>
    <a href="https://gitee.com/dromara/dante-cloud"><img src="https://gitee.com/dromara/dante-cloud/badge/fork.svg?theme=dark" alt="Gitee fork"></a>
</p>
<p align="center">
    <a href="https://github.com/dromara/dante-cloud">Github 仓库</a> &nbsp; | &nbsp;
    <a href="https://gitee.com/dromara/dante-cloud">Gitee 仓库</a> &nbsp; | &nbsp;
    <a href="https://www.herodotus.cn">旧版文档</a>
    <a href="https://www.herodotus.vip">新版文档</a>
</p>

<h1 align="center"> 如果您觉得有帮助，请点右上角 "Star" 支持一下，谢谢！</h1>

---

## 重要说明

因频繁出现修改包名、删除作者版权信息、二次开源的行为，为保护作者权益，特进行以下几项说明：

1. Dante Cloud 项目自 3.3.X 版本开始，开源协议变更为 AGPL 3.0。
2. 自2024年6月1日起，永久关闭 Dante Engine 工程不再开放。这不会影响使用，代码会持续更新并上传中央仓库，可以通过 source.jar 方式查看。
3. 如自用需修改 Dante Engine 代码，可[【留言登记】](https://gitee.com/dromara/dante-cloud/issues/I65F5B)，联系作者开放私库。
4. 商用 Dante Cloud 以及相关项目，不管阻塞式版本还是响应式版本，均需申请授权，点击[【了解详情】](https://www.herodotus.cn/support/authorization.html)

## 企业级技术中台微服务架构与服务能力开发和管理平台

**Dante Cloud** 是国内首个支持阻塞式和响应式融合的微服务。以「**高质量代码、低安全漏洞**」为核心，**采用领域驱动模型(DDD)设计思想，完全基于 Spring 生态全域开源技术和 OAuth2.1 协议，支持智能电视、IoT等物联网设备认证**，满足**国家三级等保要求**、支持接口**国密数字信封加解密**、防刷、高防XSS和SQL注入等一系列安全体系的**多租户微服务解决方案**。

### 理念

**Dante Cloud** 一直秉承着“简洁、高效、包容、务实”的理念，使用微服务领域及周边相关的各类新兴技术或主流技术进行建设，不断地深耕细作、去粗取精、用心打造。目标是构建一款`代码质量高、维护投入低、安全防护强`的，可以帮助用户快速跨越架构技术选型、技术研究探索阶段，降低传统项目中因安全漏洞、技术负债、低质代码等潜在隐患所产生的高维护投入，期望像项目名字寓意一样，在行业变革的时期承上启下，助力企业信息化建设和变革的产品。

## Dante Cloud 响应式版本特性

- `Spring Boot` 已升级至 3.3.1
- `Spring Authorization Server` 已升级至 1.3.1
- 全面采用 Java 21，默认开启虚拟线程，以改善阻塞操作的处理降低系统资源的消耗
- 支持传统的 `阻塞式` 微服务与基于 `Reactor` 和 `WebFlux` 的 `响应式` 微服务同时运行在一套系统之中
- 不强制使用 `响应式` 方式开发，可根据自身项目对资源吞吐量、资源消耗、特殊功能性能保障的需求，灵活的选择是采用 `响应式` 还是 `阻塞式` 来开发对应的服务。
- 在保持 Dante Cloud 原有 `Spring Authorization Server` 深度扩展的各种特性的前提下，实现 `响应式` 服务的动态鉴权与现有体系的完全融合（无需在代码中使用 `@PreAuthorize` 写死权限，全部通过后台动态管理）
- 向“响应式编程”转变，基于 `Reactor` 重构大量核心代码，进一步提升本系统代码质量和运行效能
- 重新架构所有核心组件模块，进一步降低各模块的耦合性，减少第三方组件依赖深度，简化各模块使用的复杂度，使用更贴近 Spring Boot 生态官方写法，提升模块组件的可插拔性以及 `响应式` 和 `阻塞式` 不同环境下自动配置的适配能力
- 实现 `响应式` 和 `阻塞式` 不同类型服务，Session 共享体系以及自定义 Session 体系的完美融合（谁说微服务就一定用不到 Session ：））。
- 新增 `GRPC` 服务间调用和通信方式，系统核心服务间调用支持 `OpenFeign` 和 `GRPC` 两种方式，可通过修改配置实现两种方式的切换。
- 基于 `RSocket` 全面重写 `WebSocket` 消息系统，实现 `WebSocket` 的 `响应式` 改造以及 `RSocket` 与 Spring Security 体系的全面集成。支持多实例、跨服务的私信和广播
- 新增 OAuth2 独立客户端，可用于客户端动态注册以及授权码模式
- 新增基于 `Loki + Grafana` 生态的轻量级日志中心和链路追踪解决方案，使用 OSS 作为数据存储，极大地降低资源需求，可作为原有 Skywalking 和 ELK 重量级体系的备选方案，根据实际需要切换。
- 开放纯手写动态表单功能。可实现BPMN、动态表单、Camunda 流程引擎的串联，实现工作流程运转（目前仅支持简单工作流）
- 开放包含自定义属性面板的 BPMN 在线设计器功能。
- 开放物联网设备认证和管理模块，支持基于 Emqx 的物联网设备通信和管理。
- 开放阿里云内容审核、百度 OCR、环信、Emqx、天眼查、Nacos、PolarisMash等第三方 OpenApi 封装模块
- 前端工程支持 Docker 运行，相关参数可通过配置环境变量修改。已上传至 Docker Hub，可以直接下载运行。

## Dante Cloud 3.X 特性

### 1. 核心基础依赖便捷切换

- 新增 `Spring Cloud Tencent` 和 `Spring Cloud` 原生微服务全家桶等两种基础设施支持。
- 新增 `Spring Cloud Alibaba`、`Spring Cloud Tencent` 和 `Spring Cloud` 原生微服务全家桶三种基础设值切换能力，可以以相对便捷的方式切换使用 Alibaba、Tencent、Spring 等基础设施环境。可根据自身实际需求选择，不再局限于只能在某一种基础设施环境中运行。

### 2. `Spring Authorization Server` 全特性支持及扩展

- 基于 `Spring Authorization Server` 和 `Spring Data JPA` 实现多租户系统架构， 支持 Database 和 Schema 两种模式。
- 基于 `Spring Data JPA`，重新构建 `Spring Authorization Server` 基础数据存储代码，替代原有 JDBC 数据访问方式，破除 `Spring Authorization Server` 原有数据存储局限，扩展为更符合实际应用的方式和设计。
- 基于 `Spring Authorization Server`，在 OAuth 2.1 规范基础之上，增加自定义 `Resource Ownership Password` (密码) 认证模式，以兼容现有基于 OAuth 2 规范的、前后端分离的应用，支持 `Refresh Token` 的使用。
- 基于 `Spring Authorization Server`，在 OAuth 2.1 规范基础之上，增加自定义 `Social Credentials` (社会化登录) 认证模式，支持手机短信验证码、微信小程序、基于 `JustAuth` 的第三方应用登录， 支持 `Refresh Token` 的使用。
- 扩展 `Spring Authorization Server` 默认的 `Client Credentials` 模式，实现真正的使用 Scope 权限对接口进行验证。 增加客户端 Scope 的权限配置功能，并与已有的用户权限体系解耦
- 支持 `Spring Authorization Server` `Authorization Code PKCE` 认证模式
- 在 `Spring Authorization Server` 的标准的 `JWT Token` 加密校验方式外，支持基于自定义证书的 `JWT Token` 加密校验方式，可通过配置动态修改。
- 支持 `Opaque Token` (不透明令牌) 格式及校验方式，降低 `JWT Token` 被捕获解析的风险。可通过修改配置参数，设置默认 Token 格式是采用 `Opaque Token` 格式还是 `JWT Token` 格式。
- 全面支持 `OpenID Connect` (OIDC) 协议，系统使用时可根据使用需求，通过前端开关配置，快速切换 OIDC 模式和传统 OAuth2 模式
- 深度扩展 `Authorization Code`、`Resource Ownership Password`、`Social Credentials` 几种模式，全面融合 `IdToken`、`Opaque Token`、`JWT Token` 与现有权限体系，同时提供 `IdToken` 和 自定义 Token 扩展两种无须二次请求的用户信息传递方式，减少用户信息的频繁请求。
- 自定义 `Spring Authorization Server` 授权码模式登录认证页面和授权确认页面，授权码模式登录采用数据加密传输。支持多种验证码类型，暂不支持行为验证码。
- 新增基于 `Spring Authorization Server` 的、支持智能电视、IoT等物联网设备认证模式
- 无须在代码中配置 `Spring Security` 权限注解以及权限方法，即可实现接口鉴权以及权限的动态修改。采用分布式鉴权方案，规避 Gateway 统一鉴权的压力以及重复鉴权问题
- OAuth2 UserDetails 核心数据支持直连数据库获取和 Feign 远程调用两种模式。OAuth2 直连数据库模式性能更优，Feign 访问远程调用可扩展性更强。可通过配置动态修改采用策略方式。

### 3. 全体系化应用和开发特性集成

- 微服务架构全体系 Session 共享，实现 Spring Authorization Server、多实例服务、WebSocket、自定义 Session 以及大前端 Session 的统一。`微服务架构下的 Session 可以选择不用，但是不能没有`。
- 混合国密 `SM2` (非对称) 和 `SM4` (对称加密) 算法，实现基于数字信封技术的秘钥动态生成加密传输。利用“一人一码机制”，实现前后端数据进行动态加密传输与。Spring Authorization Server OAuth 2.1 授权模式深度融合，构建统一体系的数据传输加密。
- 全面整合 `@PreAuthorize` 注解权限与 `URL` 权限，通过后端动态配置，无须在代码中配置 `Spring Security` 权限注解以及权限方法，可实现接口鉴权以及权限的统一管理和动态修改 
- 融合 Spring Cloud Stream 和 WebSocket，以优雅的方式实现 WebSocket 服务多实例环境下，点对点、广播消息跨实例推送，在线用户实时统计，完美支持 WebSocket 集群化应用。 
- 借鉴 JPA 标准化设计思想，提取和抽象 OSS 标准化操作，形成统一的 Java OSS API 规范。封装可操作任意厂商的、统一的 REST API，构建定义统一、动态实现的应用模式（类似于 Hibernate 是 JPA 的一种实现，Hibernate 以 Dialect 方式支持不同的数据库一样），在不修改代码的情况下通过修改配置实现 OSS 的无缝切换和迁移 
- 自研基于 `JetCache` 分布式两级缓存，完美实现 JPA Hibernate 二级缓存，支持各类查询数据缓存以及 JPA `@ManyToMany`， `@ManyToOne`等关联查询。完美解决 Spring Cache 仅使用本地缓存、创建 Key 繁琐和分页数据无法更新的问题。支持多实例服务本地缓存和远程缓存数据同步，同时支持 Mybatis Plus 二级缓存
- 平台统一错误处理，支持自定义错误码体系，有效集成 `OAuth2`、`Spring Validation` 等多方错误体系并有机整合 HTTP 状态码。采用 Customizer 模式，采用错误码自动计算和创建模式，支持代码模块级错误码灵活定义扩展。响应结果更加多样灵活，反馈结果也更加人性化，便于理解和定位问题。 
- 全体系 OkHttp 、HttpClient 统一化集成，实现 OkHttp 、HttpClient 与 RestTemplate 、Openfeign 一体化融合。统一使用 Feign 配置参数，对 OkHttp 、HttpClient 进行参数设定，可策略化选择设置使用 OkHttp 或 HttpClient 作为 RestTemplate 、Openfeign 统一的基础 HttpClient

### 4. 采用 `pnpm monorepo` 重构前端

- 未使用任何流行开源模版，使用全新技术栈，完全纯"手写"全新前端工程。 
- 借鉴参考流行开源版本的使用和设计，新版前端界面风格和操作习惯尽量与当前流行方式统一。 
- 充份使用 Typescript 语言特性，解决大量类型校验问题，尽可能规避 "any" 式的 Typescript 编程语言使用方式。 
- 充份使用 Composition Api 和 Hooks 等 Vue3 框架新版特性进行代码编写。 
- 充份利用 Component、Hooks 以及 Typescript 面向对象等特性，抽取通用组件和代码，尽可能降低工程重复代码。 
- 对较多 Quasar 基础组件和应用功能组件进行封装，以方便代码的统一修改维护和开发使用。 
- 对生产模式下，对基于 Vite3 的工程打包进行深度性能优化。 
- 提供以 docker-compose 方式，对工程生产代码进行容器化打包和部署。 
- 该版本基于 pnpm，采用 monorepo 模式对前端工程进行重构。构建 monorepo 版本前端，是为扩展更多功能、增加应用级功能做铺垫 
- 抽取 utils、components、apis、bpmn-designer 等相关代码，形成共享模块。 
- 共享模块已进行优化配置，可编译成独立的组件，单独以组件形式进行发布。 
- 代码以共享模块的方式进行单独维护开发，降低现有工程代码复杂度，便于后续功能的扩展和代码的复用。

## [1]、开源协议

![开源协议](./readme/copyright/agplv3-155x51.png)

## [2]、总体架构

![输入图片说明](./readme/architecture.jpg)

> 部分功能演示，正在逐步添加

### （1） 方法级动态权限

![输入图片说明](./readme/preview/oauth2expression.gif)

### （2） Minio 控制台使用 Dante Cloud 登录认证

![输入图片说明](./readme/preview/minio-login.gif)

### （3） 服务调用链监控

![输入图片说明](./readme/preview/skywalking.gif)

## [3]、功能介绍

[【详情见在线文档】](https://www.herodotus.vip/support/comparison.html)

## [4]、技术栈和版本说明

### （1）Spring 全家桶及核心技术版本

| 组件                          | 版本              |
|-----------------------------|-----------------|
| Spring Boot                 | 3.3.1           |
| Spring Cloud                | 2023.0.2        |
| Spring Cloud Alibaba        | 2023.0.1.0      |
| Spring Cloud Tencent        | 1.14.0-2023.0.0 |
| Spring Authorization Server | 1.3.1           |
| Spring Boot Admin           | 3.2.2           |
| Nacos                       | 2.3.2           |
| Sentinel                    | 1.8.7           |
| Seata                       | 1.7.0           |

> Spring 全家桶版本对应关系，详见：[版本说明](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E)

### （2）所涉及的相关的技术：

- 持久层框架： Spring Data Jpa & Mybatis Plus
- API 网关：Spring Cloud Gateway
- 服务注册&发现和配置中心: Alibaba Nacos、Tencent Polaris
- 服务消费：Spring Cloud OpenFeign & RestTemplate & OkHttps
- 负载均衡：Spring Cloud Loadbalancer
- 服务熔断&降级&限流：Alibaba Sentinel、Tencent Polaris
- 服务监控：Spring Boot Admin
- 消息队列：使用 Spring Cloud 消息总线 Spring Cloud Bus 默认 Kafka 适配 RabbitMQ
- 链路跟踪：Skywalking
- 分布式事务：Seata
- 数据缓存：JetCache (Redis + Caffeine) 多级缓存
- 数据库： Postgresql，MySQL，Oracle ...
- JSON 序列化：Jackson & FastJson
- 文件服务：阿里云 OSS/Minio
- 数据调试：p6spy
- 日志中心：ELK
- 日志收集：Logstash Logback Encoder

### (3) 前端工程技术栈

- Vue 3
- Vite 5
- Pinia
- Typescript 5
- Quasar 2
- Vue-Router 4
- Vueliate

## [5]、 版本和分支

### 一、版本号说明

本系统版本号，分为四段。

- 第一段和第二段，与 Spring Boot 版本对应，根据采用的 Spring Boot 版本变更。例如，当前采用 Spring Boot 2.4.6 版本，那么就以
  2.4.X.X 开头
- 第三段，表示系统功能的变化
- 第四段，表示系统功能维护及优化情况

### 二、分支说明

| 分支名称                   | 对应 Spring 生态版本                          | 对应 JDK 版本 | 用途                 | 现状                                                          |
|------------------------|-----------------------------------------|-----------|--------------------|-------------------------------------------------------------|
| master                 | Spring Boot 3.3 和 Spring Cloud 2023.0.2 | JDK 17    | 主要发布分支             | 推荐使用代码分支                                                    |
| develop                | Spring Boot 3.3 和 Spring Cloud 2023.0.2 | JDK 17    | Development 分支     | 新功能、ISSUE 均以此分支作为开发，发布后会 PR 至 master 分支。开发分支不保证可用           |
| reactive-master        | Spring Boot 3.3 和 Spring Cloud 2023.0.2 | JDK 21    | 响应式版本主要发布分支        | 推荐使用代码分支                                                    |
| reactive-develop       | Spring Boot 3.3 和 Spring Cloud 2023.0.2 | JDK 21    | 响应式 Development 分支 | 下一代响应式微服务版本开发分支。开发分支不保证可用                                   |
| 3.1.X                  | Spring Boot 3.1 和 Spring Cloud 2022.0.X | JDK 17    | 历史代码，不再维护          | 基于 Spring Boot 3.1 时代开发的代码分支，稳定可用，不再维护                      |
| 2.7.X                  | Spring Boot 2.7 和 Spring Cloud 2021.0.X | JDK 8     | 历史代码，不再维护          | 基于 Spring Boot 2.7 时代开发的代码分支，稳定可用，不再维护                      |
| spring-security-oauth2 | Spring Boot 2.6 和 Spring Cloud 2021.0.X | JDK 8     | 历史代码，不再维护          | 基于原 Spring Security OAuth2 实现的微服务，稳定可用，因相关组件均不在维护，所以该版本不再维护 |

## [6]、工程结构

```
dante-cloud
├── configurations -- 配置文件脚本和统一Docker build上下文目录
├── dependencies -- 工程Maven顶级依赖，统一控制版本和依赖
├── module -- 依赖组件半成品拼装工程
├    ├── dante-module-common -- Module 相关模块公共辅助代码模块
├    ├── dante-module-metadata -- 权限元数据同步模块
├    ├── dante-module-social -- 社交登录模块
├    └── dante-module-strategy -- UAA 核心数据访问策略模块
├── packages -- 基础核心Starter
├    ├── authorization-spring-boot-starter -- OAuth2 认证基础Starter，主要用于 UAA 认证服务器以及单体版 Dante Cloud
├    ├── facility-spring-boot-starter -- 基础设施切换依赖starter
├    └── service-spring-boot-starter -- 平台接入应用服务通用 Starter
├── platform -- 平台核心服务
├    ├── dante-cloud-gateway -- 服务网关
├    ├── dante-cloud-message -- 消息服务
├    ├── dante-cloud-monitor -- Spring Boot Admin 监控服务
├    ├── dante-cloud-upms -- 统一权限管理系统服务
├    └── dante-cloud-uaa -- 账户管理和统一认证模块
├── services -- 平台业务服务
├    ├── dante-cloud-bpmn-ability -- 工作流服务
├    ├── dante-cloud-bpmn-logic -- 工作流基础代码包
└──  └── dante-cloud-oss-ability -- 对象存储服务
```

## [7]、项目地址

- 后端主工程地址：[https://gitee.com/dromara/dante-cloud](https://gitee.com/dromara/dante-cloud)
- 后端单体版示例工程地址：[https://gitee.com/herodotus/dante-cloud-athena](https://gitee.com/herodotus/dante-cloud-athena)
- 前端工程地址：[https://gitee.com/herodotus/dante-cloud-ui](https://gitee.com/herodotus/dante-cloud-ui)

## [8]、安全测试

Dante Cloud 已通过由第三方进行的软件出厂安全测试以及等保测试。详情参见：[安全测试说明](https://www.herodotus.vip/support/comparison.html#%E4%BA%8C-%E5%AE%89%E5%85%A8%E6%B5%8B%E8%AF%95)

## [9]、参与贡献

1. 在 Gitee fork 项目到自己的 repo
2. 把 fork 过去的项目也就是你的项目 clone 到你的本地
3. 修改代码（记得一定要修改 develop 分支）
4. commit 代码，push 到自己的库（develop 分支）
5. 登录 Gitee 在你首页可以看到一个 pull request 按钮，点击它，填写一些说明信息，然后提交即可。
6. 等待维护者合并

## [10]、如何升级

尽量不修改 Dante Cloud 以外的项目源码，如 Dante Engine、Dante OSS。如果修改了，请 Pull Requests 上来，否则代码与官方不同步，可能会将对你的日后升级增加难度。

每个版本升级，我们都会附带详细更新日志：https://www.herodotus.cn/others/log/changelog.html。 在这里，你可以看到 Dante Cloud 新增哪些新功能和改进。
针对有较大变化、差异的版本，我们都会负载详细的升级指南：https://www.herodotus.cn/guide/get-start/notices.html。 在这里，你可以看到 Dante Cloud 不同版本对应升级方法。

## [11]、交流反馈

- 详见[【在线文档】](https://www.herodotus.cn) 交流反馈章节。

## [12]、界面预览

<table>
    <tr>
        <td><img src="./readme/ui1.png" alt="前端界面1"/></td>
        <td><img src="./readme/ui2.png" alt="前端界面2"/></td>
        <td><img src="./readme/ui3.png" alt="前端界面1"/></td>
    </tr>
    <tr>
        <td><img src="./readme/ui6.png" alt="前端界面6"/></td>
        <td><img src="./readme/ui7.png" alt="前端界面7"/></td>
        <td><img src="./readme/ui8.png" alt="前端界面8"/></td>
    </tr>
    <tr>
        <td><img src="./readme/ui4.jpg" alt="前端界面2"/></td>
        <td><img src="./readme/ui5.jpg" alt="前端界面3"/></td>
        <td><img src="./readme/oauth2-login1.png" alt="OAuth2 效果示例"/></td>
    </tr>
    <tr>
        <td><img src="./readme/oauth2-login2.png" alt="前端界面3"/></td>
        <td><img src="./readme/oauth2-login3.png" alt="OAuth2 效果示例"/></td>
        <td><img src="./readme/nacos.png" alt="Nacos示例界面"/></td>
    </tr>
    <tr>
        <td><img src="./readme/elk.png" alt="日志中心示例界面"/></td>
        <td><img src="./readme/sentinel.png" alt="Sentinel 效果示例"/></td>
        <td><img src="./readme/spring-boot-admin-1.png" alt="Spring Boot Admin 效果示例1"/></td>
    </tr>
    <tr>
        <td><img src="./readme/spring-boot-admin-2.png" alt="Spring Boot Admin 效果示例2"/></td>
        <td><img src="./readme/skywalking.png" alt="Skywalking 效果示例1"/></td>
        <td><img src="./readme/skywalking2.png" alt="Skywalking 效果示例2"/></td>
    </tr>
</table>

## [13]、谁在使用 Dante Cloud

### 单位

| 序号 | 公司                            |         合规         | 序号 | 公司                                    |         合规         |
|:--:|-------------------------------|:------------------:|:--:|---------------------------------------|:------------------:|
| 1  | [轻喜到家](https://qxdaojia.com/) | :white_check_mark: | 2  | [杭州三之一智联科技有限公司](http://www.3into1.cn) | :white_check_mark: |

### 个人

| 序号 |                    昵称                    |         合规         | 序号 |                     昵称                     |         合规         | 序号 |                    昵称                    |         合规         | 序号 |                        昵称                        |         合规         |
|:--:|:----------------------------------------:|:------------------:|:--:|:------------------------------------------:|:------------------:|:--:|:----------------------------------------:|:------------------:|:--:|:------------------------------------------------:|:------------------:|
| 1  | [Kaiser_Li](https://gitee.com/Kaiser_Li) | :white_check_mark: | 2  | [宁哥](https://gitee.com/seabuckthorn-syrup) | :white_check_mark: | 3  | [Nicolas](https://gitee.com/ailifeshow)  | :white_check_mark: | 4  |      [龍飝龘龘](https://gitee.com/autumnchendq)      | :white_check_mark: |
| 5  |  [RSJB](https://gitee.com/jinjiaxing1)   | :white_check_mark: | 6  |        [ipi](https://gitee.com/ipi)        | :white_check_mark: | 7  | [zhouhailong](https://gitee.com/l-cloud) | :white_check_mark: | 8  |          [Ge](https://gitee.com/gtkwww)          | :white_check_mark: |
| 9  |  [KohRong](https://gitee.com/loong024)   | :white_check_mark: | 10 |       [梦行](https://gitee.com/mx2913)       | :white_check_mark: | 11 |     [骆铘](https://gitee.com/clxhhsy)      | :white_check_mark: | 12 | [OnPeaceOfMind](https://gitee.com/onpeaceofmind) | :white_check_mark: |

## [14]、鸣谢

### 赞助人列表

| 序号 |   赞助人    |    赞助时间    | 序号 |     赞助人     |    赞助时间    | 序号 |    赞助人    |    赞助时间    |
|:--:|:--------:|:----------:|:--:|:-----------:|:----------:|:--:|:---------:|:----------:|
| 1  |  ご沉默菋噵   | 2021-10-25 | 2  |    偷土豆的人    | 2021-11-24 | 3  |  lorron   | 2022-04-04 |
| 4  |   在云端    | 2022-12-26 | 5  |     西晽      | 2022-12-27 | 6  | p911gt3rs | 2023-01-03 |
| 7  |  jacsty  | 2023-01-31 | 8  | hubert_rust | 2023-03-16 | 9  |  Zkey Z   | 2023-03-18 |
| 10 |   志国欧巴   | 2023-03-27 | 11 |   michael   | 2023-04-07 | 12 |   大叔丨小巷   | 2023-04-11 |
| 13 | sun_left | 2023-04-19 | 14 | time 丶 sand | 2023-07-06 | 15 |  印第安老斑鸠   | 2023-09-09 |
| 16 |   一阵风    | 2023-12-10 | 17 |    Jack     | 2024-03-01 | 18 | onehelper | 2024-05-24 |
| 19 |    宁哥    | 2024-05-29 | 20 |             |            | 21 |           |            |

### 开源项目

- [Soybean Admin](https://gitee.com/honghuangdc/soybean-admin)
- [Vue Next Admin](https://gitee.com/lyt-top/vue-next-admin)
- [Vue VBen Admin](https://gitee.com/annsion/vue-vben-admin)
- [Quasar Admin Template](https://gitee.com/jinjinge/quasar-admin-template)

### 感谢 JetBrains 提供的免费开源 License

![https://jb.gg/OpenSourceSupport](./readme/jb_beam.svg)
