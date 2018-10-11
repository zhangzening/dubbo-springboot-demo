package com.example.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.api.service.TestService;
import org.springframework.stereotype.Component;


/**
 * @author zaney
 * @describe
 * @since 2018/10/8
 **/
// 注册为 Dubbo 服务
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
@Component("testService")
public class TestServiceImpl implements TestService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}
