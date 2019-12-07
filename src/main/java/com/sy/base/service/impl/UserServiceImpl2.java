package com.sy.base.service.impl;

import com.sy.base.dao.UserDao2;
import com.sy.base.pojo.User;
import com.sy.base.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

/**
 * @author ssssyy
 * 2019/12/5 11:56
 */
public class UserServiceImpl2 implements UserService2 {

    @Autowired
    private UserDao2 userDao2;

    @Override
    public void add(User user) {
        userDao2.add(user);
    }

    @Override
    public void delete(BigInteger id) {
        userDao2.delete(id);
    }
}
