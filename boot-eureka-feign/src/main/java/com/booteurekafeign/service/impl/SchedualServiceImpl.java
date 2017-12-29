package com.booteurekafeign.service.impl;

import com.booteurekafeign.service.ISchedualServiceHi;
import org.springframework.stereotype.Component;
//实现断点器须要再为接口写个实现类,以便注入ioc
@Component
public class SchedualServiceImpl implements ISchedualServiceHi{

    @Override
    public String sayHiclientOne( String name){

        return "hello " + name;
    }


}
