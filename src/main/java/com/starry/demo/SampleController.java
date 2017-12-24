package com.starry.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//提供实现了REST API，可以服务JSON,XML或者其他。这里是以String的形式渲染出结果
public class SampleController {
    @RequestMapping("/")
    //@RequestMapping：提供路由信息，"/“路径的HTTP Request都会被映射到sayHello方法进行处理
    public String sayHello(){
        System.out.print("hello world");
        return "Hello world";
    }
}
