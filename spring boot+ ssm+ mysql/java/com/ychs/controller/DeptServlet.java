package com.ychs.controller;

import com.ychs.bean.Dept;
import com.ychs.service.DeptService;
import com.ychs.service.impl.DeptServiceImpl;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DeptServlet",urlPatterns = "/dept")
public class DeptServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        response.setContentType("text/html;charset=UTF-8");
        if("getDepts".equals(method)){
            getDepts(request,response);
        }
    }

    private void getDepts(HttpServletRequest request, HttpServletResponse response) throws IOException {
        DeptService deptService = new DeptServiceImpl();
        List<Dept> depts = deptService.getDepts();
        JSONArray ja = JSONArray.fromObject(depts);
        response.getWriter().write(ja.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
