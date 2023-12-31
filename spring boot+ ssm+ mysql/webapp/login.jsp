<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-登录</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Access-Control-Allow-Origin" content="*">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="lib/layui-v2.5.5/css/layui.css" media="all">
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        html, body {width: 100%;height: 100%;overflow: hidden}
        body {background: #1E9FFF;}
        body:after {content:'';background-repeat:no-repeat;background-size:cover;-webkit-filter:blur(3px);-moz-filter:blur(3px);-o-filter:blur(3px);-ms-filter:blur(3px);filter:blur(3px);position:absolute;top:0;left:0;right:0;bottom:0;z-index:-1;}
        .layui-container {width: 100%;height: 100%;overflow: hidden}
        .admin-login-background {width:360px;height:300px;position:absolute;left:50%;top:40%;margin-left:-180px;margin-top:-100px;}
        .logo-title {text-align:center;letter-spacing:2px;padding:14px 0;}
        .logo-title h1 {color:#1E9FFF;font-size:25px;font-weight:bold;}
        .login-form {background-color:#fff;border:1px solid #fff;border-radius:3px;padding:14px 20px;box-shadow:0 0 8px #eeeeee;}
        .login-form .layui-form-item {position:relative;}
        .login-form .layui-form-item label {position:absolute;left:1px;top:1px;width:38px;line-height:36px;text-align:center;color:#d2d2d2;}
        .login-form .layui-form-item input {padding-left:36px;}
        .captcha {width:60%;display:inline-block;}
        .captcha-img {display:inline-block;width:34%;float:right;}
        .captcha-img img {height:34px;border:1px solid #e6e6e6;height:36px;width:100%;}
    </style>
</head>
<body>
<div class="layui-container">
    <div class="admin-login-background">
        <div class="layui-form login-form">
            <form class="layui-form" action="">
                <input type="hidden" name="method" value="login">
                <div class="layui-form-item logo-title">
                    <h1>UOLab联合开放实验室</h1>
                    <h1>管理平台</h1>
                </div>
                <div class="layui-form-item">
                    <label class="layui-icon layui-icon-username" for="username"></label>
                    <input id="username" type="text" name="username" lay-verify="required|account" placeholder="用户名或者邮箱" autocomplete="off" class="layui-input" value="admin">
                </div>
                <div class="layui-form-item">
                    <label class="layui-icon layui-icon-password" for="password"></label>
                    <input id="password" type="password" name="password" lay-verify="required|password" placeholder="密码" autocomplete="off" class="layui-input" value="123456">
                </div>
                <div class="layui-form-item">
                    <label class="layui-icon layui-icon-vercode" for="captcha"></label>
                    <input id="captcha" type="text" name="captcha" lay-verify="required|captcha" placeholder="图形验证码" autocomplete="off" class="layui-input verification captcha" value="xszg">
                    <div class="captcha-img">
                        <img id="captchaPic" src="images/captcha.jpg">
                    </div>
                </div>
                <div class="layui-form-item">
                    <input type="checkbox" name="rememberMe" value="true" lay-skin="primary" title="记住密码">
                </div>
                <div class="layui-form-item">
                    <button class="layui-btn layui-btn layui-btn-normal layui-btn-fluid" lay-submit="" lay-filter="login">登 录</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="lib/jquery-3.4.1/jquery-3.4.1.min.js" charset="utf-8"></script>
<script src="lib/layui-v2.5.5/layui.js" charset="utf-8"></script>
<script src="lib/jq-module/jquery.particleground.min.js" charset="utf-8"></script>
<script>
    layui.use(['form'], function () {
        var form = layui.form,
            layer = layui.layer;
        $ = layui.$;
        // 1. 验证用户名，失去焦点时触发
        $("#username").blur(function(){
            var username = $("#username").val();
            var reg = /^[a-zA-Z0-9_-]{5,16}$/;//正则表达式
            if(username.length == 0|| username==null || username == '') {
                layer.msg('用户名不能为空', {icon: 5});
            }else{
                if(!reg.test(username)) {
                    layer.msg('格式不对，用户名至少要5个字符', {icon: 5});
                }
            }
        });

        // 2. 验证密码，失去焦点时触发
        $("#password").blur(function(){
            var password = $("#password").val();
            var reg = /^[a-zA-Z0-9_-]{6,20}$/;//正则表达式
            if(password.length == 0|| password==null || password == '') {
                layer.msg('密码不能为空', {icon: 5});
            }else{
                if(!reg.test(password)) {
                    layer.msg('密码格式不对', {icon: 5});
                }
            }
        });

        // 3.验证验证码，失去焦点时触发
        $("#captcha").blur(function(){
            var captcha = $("#captcha").val();
            if(captcha.length == 0|| captcha==null || captcha == '') {
                layer.msg('验证码不能为空', {icon: 5});
            }
        });


        // 登录过期的时候，跳出ifram框架
        if (top.location != self.location) top.location = self.location;

        // 粒子线条背景
        $(document).ready(function(){
            $('.layui-container').particleground({
                dotColor:'#7ec7fd',
                lineColor:'#7ec7fd'
            });
        });

        // 进行登录操作
        form.on('submit(login)', function (data) {
            data = data.field;
            if (data.username == '') {
                layer.msg('用户名不能为空');
                return false;
            }
            if (data.password == '') {
                layer.msg('密码不能为空');
                return false;
            }
            if (data.captcha == '') {
                layer.msg('验证码不能为空');
                return false;
            }
            console.log(data);
            //用异步发出登录的请求
            $.post(
              "${pageContext.request.contextPath}/login",
              data,
              function(res){
                console.log(res);
                if(res=="y"){
                    layer.msg('登录成功', function () {
                        window.location = 'index.jsp';
                    });
                }else{
                    layer.msg('用户名或密码有误');
                }
              }
            );
            /*layer.msg('登录成功', function () {
                window.location = 'index.html';
            });*/
            return false;
        });
    });
</script>
</body>
</html>
