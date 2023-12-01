package com.tirmizee.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {

//    @Bean
//    public JedisConnectionFactory jedisConnectionFactory(RedisProperties redisProperties) {
//        RedisSentinelConfiguration sentinelConfig = new RedisSentinelConfiguration()
//                .master("mymaster")
//                .sentinel("redis-sentinel1", 26379)
//                .sentinel("redis-sentinel2", 26379)
//                .sentinel("redis-sentinel3", 26379);
//        sentinelConfig.setPassword(RedisPassword.of("redispassword"));
//        return new JedisConnectionFactory(sentinelConfig);
//    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(JedisConnectionFactory jedisConnectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory);
        return template;
    }

}
