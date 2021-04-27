package com.bookmall.dao.impl;

import com.bookmall.dao.UserDao;
import com.bookmall.pojo.User;

/**
 * @author: Administrator
 * @description:
 * @cteate 2021-04-20-22:47
 */
public class UserDaoImpl extends BaseDao implements UserDao{

    @Override
    public User queryUserByUsername(String Username) {
        String sql = "SELECT `id`,`username`,`password`,`email` FROM `t_user` WHERE username = ?";
        return queryForOne(User.class,sql,Username);
    }

    @Override
    public int saveUser(User user) {
        String sql = "INSERT INTO t_user(`username`,`password`,`email`) VALUES(?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public User queryUserByUsernameAndPassword(String Username, String password) {
        String sql = "SELECT `id`,`username`,`password`,`email` FROM `t_user` WHERE username = ? and password = ?";
        return queryForOne(User.class,sql,Username,password);
    }
}
