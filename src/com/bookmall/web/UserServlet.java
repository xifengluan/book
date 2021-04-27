package com.bookmall.web;

import com.bookmall.pojo.User;
import com.bookmall.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



/**
 * @author: Administrator
 * @description:
 * @cteate 2021-04-23-22:19
 */
public class UserServlet extends BaseServlet {

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (userService.login(new User(username, password, null)) == null) {
            req.setAttribute("msg", "用户名或密码错误");
            req.setAttribute("username", username);
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req, resp);
        }
    }

    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //问题在于这一步获取不到表单提交的信息
        //getParameter必须读取name属性的信息,code一开始没有name属性
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");
//
        if ("abcde".equals(code)){
            if (userService.existsUsername(username)){
                req.setAttribute("msg","用户名已存在");
                req.setAttribute("username",username);
                req.setAttribute("email",email);
                req.getRequestDispatcher("/pages/user/regist.jsp").forward(req,resp);

            }else {
                //工具类封装属性到user对象
                userService.registUser(WebUtils.copyParamToBean(req.getParameterMap(),new User()));
                req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req,resp);

            }
        }else{
            req.setAttribute("msg","验证码错误");
            req.setAttribute("username",username);
            req.setAttribute("email",email);
            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req,resp);
        }

    }
}


