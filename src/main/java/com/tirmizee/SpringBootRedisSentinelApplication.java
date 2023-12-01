package com.tirmizee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringBootRedisSentinelApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(SpringBootRedisSentinelApplication.class, args);
	}

}
