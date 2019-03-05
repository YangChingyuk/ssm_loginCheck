package com.yqx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yqx.entity.User;
import com.yqx.service.UserService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)ac.getBean("userService");
		
		System.out.println(userService.queryById(User.class, 1));
	}
}
