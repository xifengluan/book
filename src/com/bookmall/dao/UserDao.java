package com.bookmall.dao;

import com.bookmall.pojo.User;

/**
 * @author: Administrator
 * @description:
 * @cteate 2021-04-20-22:33
 */
public interface UserDao {

    /**
     * 根据用户名匹配用户信息
     * @param Username 用户名
     * @return
     */
    public User queryUserByUsername(String Username);

    /**
     * 保存用户信息
     * @param user 用户对象
     * @return
     */
    public int saveUser(User user);

    /**
     * 根据用户名和密码匹配用户信息
     * @param Username
     * @param password
     * @return 返回null说明用户名和密码错误
     */
    public User queryUserByUsernameAndPassword(String Username,String password);

}
