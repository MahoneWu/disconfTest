package com.mouse.moon.controller;

import com.mouse.moon.service.DemoService;
import com.mouse.moon.service.UserPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Mahone Wu on 2016/7/19.
 * dubbo:
 * http://wolfprince.blue/java/%E6%90%AD%E6%A1%86%E6%9E%B6SpringMVC-Mybatis-Dubbo-MySQL/
 * zookeeper:
 * http://coolxing.iteye.com/blog/1871009
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DemoService helloService;

    /**
     * test mvc
     * @return
     */
    @RequestMapping(value = "/index")
    public String toTest(){
        return "test";
    }


    // 测试Dubbo
    @RequestMapping(value="/dubbo",produces="text/html;charset=UTF-8" )
    @ResponseBody
    private String dubbo(){
        return helloService.sayHelloDubbo();
    }

}
