package com.bookmall.test;

import com.bookmall.dao.impl.UserDaoImpl;
import com.bookmall.pojo.User;
import org.junit.Test;

/**
 * @author: Administrator
 * @description:
 * @cteate 2021-04-20-22:56
 */
public class UserDaoTest {

    @Test
    public void queryUserByUsername() {
        UserDaoImpl userDao = new UserDaoImpl();
        System.out.println(userDao.queryUserByUsername("admin"));
    }

    @Test
    public void saveUser() {
        UserDaoImpl userDao = new UserDaoImpl();
        User zss = new User("zss", "123456", "zhang@qq.com");
        userDao.saveUser(zss);
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        UserDaoImpl userDao = new UserDaoImpl();
        System.out.println(userDao.queryUserByUsernameAndPassword("sass", "123456"));
    }
}