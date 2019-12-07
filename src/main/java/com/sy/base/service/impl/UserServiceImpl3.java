package com.sy.base.service.impl;

import com.sy.base.dao.UserDao3;
import com.sy.base.pojo.User;
import com.sy.base.service.UserService3;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

/**
 * @author ssssyy
 * 2019/12/5 11:56
 */
public class UserServiceImpl3 implements UserService3 {

    @Autowired
    private UserDao3 userDao3;

    @Override
    public void add(User user) {
        userDao3.add(user);
    }

    @Override
    public void delete(BigInteger id) {
        userDao3.delete(id);
    }
}
