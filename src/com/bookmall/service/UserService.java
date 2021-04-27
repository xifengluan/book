package com.bookmall.service;

import com.bookmall.pojo.User;

/**
 * @author: Administrator
 * @description:
 * @cteate 2021-04-20-23:15
 */
public interface UserService {


    /**
     * 注册用户
     * @param user
     */
    public void registUser(User user);


    /**
     * 用户登录
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     * @param Username
     * @return
     */
    public boolean existsUsername(String Username);
}
