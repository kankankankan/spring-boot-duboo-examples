package com.oyqh.service.imple;

import com.alibaba.dubbo.config.annotation.Service;
import com.oyqh.service.IHelloService;


/**
 * Created by oyqh on 2017-2-4.
 */
@Service(version="1.0.0")
public class HelloServiceImple implements IHelloService {
    @Override
    public String getHello(String name) {
        return null;
    }

    @Override
    public void setHello() {

    }
}
