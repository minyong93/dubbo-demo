package com.example.dubbo_service_provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo_api.service.UserService;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String getUserAddressList(String userid) {
        System.out.println("userId:"+userid);
        return userid;
    }
}
