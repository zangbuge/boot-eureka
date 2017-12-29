package com.bootribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")  //注解添加熔断点
    public String hiservice (String name){

        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
