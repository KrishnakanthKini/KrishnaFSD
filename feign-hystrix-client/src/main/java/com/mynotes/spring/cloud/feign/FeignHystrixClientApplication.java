package com.mynotes.spring.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@org.springframework.cloud.openfeign.EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class FeignHystrixClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignHystrixClientApplication.class, args);
	}

}
