package com.bookmall.test;

import com.bookmall.pojo.User;
import com.bookmall.service.impl.UserServiceImpl;
import org.junit.Test;


/**
 * @author: Administrator
 * @description:
 * @cteate 2021-04-20-23:26
 */
public class UserServiceTest {
    UserServiceImpl userService = new UserServiceImpl();
    @Test
    public void registUser() {
        userService.registUser(new User("laji","123456","laji@126.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User("laji", "5613", "laji@126.com")));
    }

    @Test
    public void existsUsername() {
        System.out.println(userService.existsUsername("la"));
    }
}