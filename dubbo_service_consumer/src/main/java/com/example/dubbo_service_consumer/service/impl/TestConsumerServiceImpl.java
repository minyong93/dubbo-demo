package com.example.dubbo_service_consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo_api.service.UserService;
import com.example.dubbo_service_consumer.service.TestConsumerService;
import org.springframework.stereotype.Service;

@Service
public class TestConsumerServiceImpl implements TestConsumerService {

    @Reference
    private UserService userService;
    @Override
    public String testConsumer(String userid) {
        return userService.getUserAddressList(userid);
    }
}
