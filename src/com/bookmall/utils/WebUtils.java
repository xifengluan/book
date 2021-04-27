package com.bookmall.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

/**
 * @author: Administrator
 * @description:
 * @cteate 2021-04-23-23:04
 */
public class WebUtils {
    /**
     * 把前端提交参数用BeanUtils工具类封装成javabean
     * @param map HttpServletRequest获取的参数map
     * @param bean 传入的被封装类实例
     */
    public static <T> T copyParamToBean(Map map, T bean) {
        try {
            BeanUtils.populate(bean, map);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
}
