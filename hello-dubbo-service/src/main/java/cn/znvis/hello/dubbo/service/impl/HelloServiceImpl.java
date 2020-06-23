package cn.znvis.hello.dubbo.service.impl;

import cn.znvis.hello.dubbo.api.HelloService;

/**
 * DESC
 *
 * @author cc
 * @date 2020-06-23
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        return ">>> Hello dubbo.";
    }
}
