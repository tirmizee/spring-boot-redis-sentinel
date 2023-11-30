# spring-boot-redis-sentinel


### application for jedis

```yaml

spring:
  redis:
    sentinel:
      master: mymaster
      nodes:
        - 0.0.0.0:26379
        - 0.0.0.0:26380
        - 0.0.0.0:26381
    jedis:
      pool:
        max-active: 10
        max-idle: 5
        min-idle: 2

logging:
  level:
    redis.clients: DEBUG

```


### application for lettuce


```yaml

spring:
  redis:
    sentinel:
      master: mymaster
      nodes:
        - 0.0.0.0:26379
        - 0.0.0.0:26380
        - 0.0.0.0:26381
    lettuce:
      pool:
        max-active: 10
        max-idle: 5
        min-idle: 1

logging:
  level:
    io.lettuce.core: DEBUG

```