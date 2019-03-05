package com.yqx.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yqx.entity.User;
import com.yqx.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public List<User> queryAll() {
		List<User> list = userService.queryAll(User.class);
		return list;
	}
	
}
