package com.ysf.bootdemo.service;

import com.ysf.bootdemo.dao.UserDao;
import com.ysf.bootdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author YiShunFeng
 * @version 1.0
 * @description com.ysf.bootdemo.service
 * @data 2020/4/25
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public int addOneUser(User user) {

        int result = dao.addOne(user);
        return  result;
    }
}
