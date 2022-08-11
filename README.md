websocket ![alt tag](https://api.travis-ci.org/phishman3579/java-algorithms-implementation.svg?branch=master)
==============================

`websocket` 与 web 实时通信。

## Environment
+ `JDK:` 1.8+
+ `Maven:` 3.0+
+ `Spring Boot:` 2.7.2
+ `Spring Web:` 5.3.22
+ `Thymeleaf:` 3.0.15

## Project
```
com.muxi.websocket
├── config
│       └── WebSocketConfig        // 配置类
├── service
│       └── WebSocketServer        // web连接
├── web
│       └── WebSocketController    // 控制器
```

## Access
`http://localhost:8081/socket/index` > 访问index页面
`http://localhost:8081/socket/notice` > 异常实时告警