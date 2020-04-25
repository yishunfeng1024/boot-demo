package com.ysf.bootdemo.dao;

import com.ysf.bootdemo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author YiShunFeng
 * @version 1.0
 * @description com.ysf.bootdemo.dao
 * @data 2020/4/25
 */
@Repository
public interface UserDao {
    int addOne(User user);
}
