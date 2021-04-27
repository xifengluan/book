package com.bookmall.test;

import com.bookmall.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author: Administrator
 * @description:
 * @cteate 2021-04-20-22:01
 */
public class JdbcUtilsTest {

    @Test
    public void testJdbcUtils(){
        Connection connection = JdbcUtils.getConnection();
        System.out.println(connection);
        JdbcUtils.close(connection);

    }


}
