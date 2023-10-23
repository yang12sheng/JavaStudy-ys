package com.ychs.controller;
import com.ychs.bean.User;
import com.ychs.service.UserService;
import com.ychs.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login" )
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request 里面封装了请求的信息/
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserService userService = new UserServiceImpl();
        User user = userService.login(username,password);
        if(user!=null)
        {//进入首页
            //重定向 到首页
            //重定向 告诉浏览器 发出第二次请求，重定向到某个位置
            //项目路径  webday02
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }else{
            //进入登录页面  提示错误
            request.setAttribute("msg","用户名或密码有误");
            //转发不能使用重定向
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }


        if("admin".equals(username)&&"123456".equals(password)){
            response.getWriter().write("success");
        }else{
            response.getWriter().write("fail");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
