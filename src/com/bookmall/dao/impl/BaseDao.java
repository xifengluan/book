package com.bookmall.dao.impl;

import com.bookmall.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author: Administrator
 * @description:使用DbUtils操作数据库的抽象类
 * @cteate 2021-04-20-22:09
 */
public abstract class BaseDao {
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * 用来执行增删改操作
     * @return
     */
    public int update(String sql,Object ... args){
        Connection connection = JdbcUtils.getConnection();

        try {
            return queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection);
        }
        return -1;
    }

    /**
     * 查询返回一个javabean的sql语句
     * @param type 查询的对象类型
     * @param sql sql语句
     * @param args sql对应参数
     * @param <T> 返回类型的泛型
     * @return
     */
    public <T> T queryForOne(Class<T> type ,String sql,Object ... args){
        Connection connection = JdbcUtils.getConnection();

        try {
            return queryRunner.query(connection,sql,new BeanHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection);
        }
        return null;
    }

    /**
     * 查询返回多个javaBeanList的sql语句
     * @param type 查询的对象类型
     * @param sql sql语句
     * @param args sql对应参数
     * @param <T> 返回类型的泛型
     * @return
     */
    public <T> List<T> queryForList(Class<T> type , String sql, Object ... args){
        Connection connection = JdbcUtils.getConnection();

        try {
            return queryRunner.query(connection,sql,new BeanListHandler<>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection);
        }
        return null;
    }

    /**
     * 返回单个查询数据的sql语句
     * @param sql sql语句
     * @param args sql参数值
     * @return
     */
    public Object queryForSingleValue(String sql,Object ... args){
        Connection connection = JdbcUtils.getConnection();
        try {
            queryRunner.query(connection,sql,new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection);
        }
        return null;
    }

}
