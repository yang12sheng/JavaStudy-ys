<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/12/4
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
</head>
<body>
<!--get 请求 ：地址栏里面直接输入的地址是  个get请求 超链接也是get 请求-->
<form action="/webday01/login" method="post">
<%--    接受错误信息--%>
    <div>${msg}</div>
    用户名：<input type="text" name="username"><br/>
    密码：<input type="text" name="password"><br/>
    <input type="submit" value="登录"><br/>
</form>
</body>
</html>