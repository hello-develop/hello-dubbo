package cn.znvis.hello.dubbo.webapp.controller;

import cn.znvis.hello.dubbo.api.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * DESC
 *
 * @author cc
 * @date 2020-06-23
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("/dubbo")
    public String dubbo() {

        String hello = helloService.hello();
        return hello;
    }
}
