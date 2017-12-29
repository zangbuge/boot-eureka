package com.booteurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.booteurekafeign.service")  //如果接口和启动类不在同一目录,须指定接口所在包
public class BootEurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootEurekaFeignApplication.class, args);
	}
}
