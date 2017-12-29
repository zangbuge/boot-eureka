package com.bootribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix  //开启断路器注解,使用时在服务方法上添加注解 @HystrixCommand  并指定熔断点
public class BootRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRibbonApplication.class, args);
	}

	// 通过ioc注入restTemplate 并通过loadBalanced注解启用负载均衡
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}


}
