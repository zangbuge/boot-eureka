package com.bootzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  //开启zuul路由功能
@EnableEurekaClient
public class BootZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootZuulApplication.class, args);
	}
}
