package com.ysf.bootdemo.entity;

/**
 * @author YiShunFeng
 * @version 1.0
 * @description com.ysf.bootdemo.entity
 * @data 2020/4/25
 */
public class User {
    private int id;
    private String name;
    private String password;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
