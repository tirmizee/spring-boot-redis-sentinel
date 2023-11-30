package com.tirmizee;

import com.tirmizee.services.RedisService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRedisSentinelApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(SpringBootRedisSentinelApplication.class, args);
		var service = app.getBean(RedisService.class);
		System.out.println(service.getValue("h"));
	}

}
