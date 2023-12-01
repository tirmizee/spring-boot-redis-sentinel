package com.tirmizee.configs;

import com.tirmizee.services.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Random;
import java.util.UUID;

@Configuration
@EnableScheduling
public class SpringConfig {

    @Autowired
    private RedisService redisService;

    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        redisService.setValue("h", UUID.randomUUID().toString());
        System.out.println(redisService.getValue("h"));
    }

}
