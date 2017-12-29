package com.bootribbon.controller;

import com.bootribbon.service.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloServiceImpl helloService;

    @RequestMapping("/hi")
    public String hi (@RequestParam("name") String name){

        return helloService.hiservice(name);
    }
}
