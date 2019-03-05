package com.yqx.dao.impl;

import org.springframework.stereotype.Repository;

import com.yqx.dao.UserDao;
import com.yqx.entity.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

}
