package cn.znvis.hello.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:spring-*.xml");
        ctx.start();
        System.out.println(">>> Dubbo Service Started.");
        System.in.read();
    }
}
