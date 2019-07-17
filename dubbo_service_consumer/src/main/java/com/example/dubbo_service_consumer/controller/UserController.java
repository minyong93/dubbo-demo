package com.example.dubbo_service_consumer.controller;

import com.example.dubbo_service_consumer.service.TestConsumerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("dubbo 测试demo")
@RestController
public class UserController {

    @Autowired
    private TestConsumerService userService;


    @ApiOperation("测试方法1")
    @GetMapping("/test/{userid}")
    public String tt(@PathVariable("userid") String userid) {
        System.out.println(userid);
        return userService.testConsumer(userid);
    }

    @ApiOperation("测试方法2")
    @PostMapping("/test1")
    public String testt(String userid) {
        System.out.println(userid);
        return userService.testConsumer(userid);
    }
}
