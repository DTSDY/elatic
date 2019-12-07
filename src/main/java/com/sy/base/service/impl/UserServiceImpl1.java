package com.sy.base.service.impl;

import com.sy.base.dao.UserDao1;
import com.sy.base.pojo.User;
import com.sy.base.service.UserService1;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

/**
 * @author ssssyy
 * 2019/12/5 11:56
 */
public class UserServiceImpl1 implements UserService1 {

    @Autowired
    private UserDao1 userDao1;

    @Override
    public void add(User user) {
        userDao1.add(user);
    }

    @Override
    public void delete(BigInteger id) {
        userDao1.delete(id);
    }
}
