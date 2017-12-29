package com.booteurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class BootEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootEurekaClientApplication.class, args);
	}
	//修改本服务端口后启动两次,相当于启动两个服务,即简单的集群
	@Value("${server.port}")  //注解获取该服务的端口;
	String point;

	@RequestMapping("/hi")
	public String seyHello (@RequestParam("name") String name){

		return "hello " + name + "来自服务 端口:" + point ;
	}

}
