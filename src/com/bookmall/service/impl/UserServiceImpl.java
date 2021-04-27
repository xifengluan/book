package com.bookmall.service.impl;

import com.bookmall.dao.UserDao;
import com.bookmall.dao.impl.UserDaoImpl;
import com.bookmall.pojo.User;
import com.bookmall.service.UserService;

/**
 * @author: Administrator
 * @description:
 * @cteate 2021-04-20-23:22
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existsUsername(String Username) {
        if (userDao.queryUserByUsername(Username) == null){
            return false;
        }
        return true;
    }
}
