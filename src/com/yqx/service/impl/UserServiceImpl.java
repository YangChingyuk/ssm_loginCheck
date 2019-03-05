package com.yqx.service.impl;

import org.springframework.stereotype.Service;

import com.yqx.entity.User;
import com.yqx.service.UserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

}
