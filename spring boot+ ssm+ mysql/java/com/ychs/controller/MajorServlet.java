package com.ychs.controller;

import com.ychs.bean.Dept;
import com.ychs.bean.Major;
import com.ychs.bean.ResultBean;
import com.ychs.service.DeptService;
import com.ychs.service.MajorService;
import com.ychs.service.impl.DeptServiceImpl;
import com.ychs.service.impl.MajorServiceImpl;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MajorServlet",urlPatterns = "/major")
public class MajorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        response.setContentType("text/html;charset=UTF-8");
        if("getMajorsByCondition".equals(method)){
            getMajorsByCondition(request,response);
        }else if("toAddMajorPage".equals(method)){
            toAddMajorPage(request,response);
        }else if("addMajor".equals(method)){
            addMajor(request,response);
        }
    }

    /**
     * 添加专业
     * @param request
     * @param response
     */
    private void addMajor(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String deptId = request.getParameter("deptId");
        String majorName = request.getParameter("majorName");
        String remark = request.getParameter("remark");
        Major major = new Major();
        major.setDeptId(Integer.parseInt(deptId));
        major.setMajorName(majorName);
        major.setRemark(remark);

        MajorService majorService = new MajorServiceImpl();
        int res = majorService.addMajor(major);
        response.getWriter().write(res+"");
    }

    /**
     * 跳到添加专业页面
     * @param request
     * @param response
     */
    private void toAddMajorPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、携带院系的信息
        DeptService deptService = new DeptServiceImpl();
        List<Dept> depts = deptService.getDepts();
        //转发的时候通过request对象携带信息
        request.setAttribute("depts",depts);
//        2、跳到添加专业的页面
        request.getRequestDispatcher("page/department/addMajor.jsp").forward(request,response);
    }

    /**
     * 根据条件查询专业的信息
     * @param request
     * @param response
     * @throws IOException
     */
    private void getMajorsByCondition(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String deptId = request.getParameter("deptId");
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");

        Major major = new Major();
        if(deptId!=null&&!"".equals(deptId)){
            major.setDeptId(Integer.parseInt(deptId));
        }
        major.setPage(Integer.parseInt(page));
        major.setLimit(Integer.parseInt(limit));
        MajorService majorService = new MajorServiceImpl();
        ResultBean<Major> rb = majorService.getMajorsByCondition(major);
        //对象或map类型
        JSONObject jo = JSONObject.fromObject(rb);
        response.getWriter().write(jo.toString());
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
