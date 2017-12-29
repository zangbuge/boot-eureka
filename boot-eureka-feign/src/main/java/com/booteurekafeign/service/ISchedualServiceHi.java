package com.booteurekafeign.service;

import com.booteurekafeign.service.impl.SchedualServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//通过feignClient 注解来绑定使用那个远程服务
@FeignClient(value = "service-hi"  ,fallback = SchedualServiceImpl.class)
public interface ISchedualServiceHi {

    @RequestMapping(value = "/hi" ,method = RequestMethod.GET)
    String sayHiclientOne(@RequestParam("name") String name);
}
