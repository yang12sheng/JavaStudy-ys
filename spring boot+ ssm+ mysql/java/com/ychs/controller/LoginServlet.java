package com.ychs.controller;

import com.ychs.bean.User;
import com.ychs.service.UserService;
import com.ychs.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        if("login".equals(method)){
            login(request,response);
        }else if("logout".equals(method)){
            logout(request,response);
        }
    }

    private void logout(HttpServletRequest request, HttpServletResponse response) {
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserService userService = new UserServiceImpl();
        User user = userService.login(username,password);
        if(user!=null){
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            response.getWriter().write("y");
        }else{
            response.getWriter().write("n");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
