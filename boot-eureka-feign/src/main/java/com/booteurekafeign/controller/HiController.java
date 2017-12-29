package com.booteurekafeign.controller;

import com.booteurekafeign.service.ISchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    ISchedualServiceHi iSchedualServiceHi;

    @RequestMapping(value = "hi" ,method = RequestMethod.GET)
    public String sayHi (@RequestParam("name") String name){

        return iSchedualServiceHi.sayHiclientOne(name);
    }


}
