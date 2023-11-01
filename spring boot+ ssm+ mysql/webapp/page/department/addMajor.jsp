<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>添加专业</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui-v2.5.5/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/public.css" media="all">
</head>
<body>
<div class="layuimini-container">
    <div class="layuimini-main">

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>添加专业</legend>
        </fieldset>

        <form class="layui-form" action="">
            <input type="hidden" name="method" value="addMajor">
            <div class="layui-form-item">
                <label class="layui-form-label"><label style="color: red">*</label>选择院系:</label>
                <div class="layui-input-block">
                    <select lay-verify="required" name="deptId">
                        <c:forEach var="dept" items="${depts}">
                            <option value="${dept.id}">${dept.deptName}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label"><label style="color: red">*</label>专业名称:</label>
                <div class="layui-input-block">
                    <label>
                        <input id="majorname" type="text" name="majorName" lay-verify="required" lay-reqtext="专业名称不能为空 (2-15个汉字)" autocomplete="off" placeholder="请输入专业名称" class="layui-input">
                    </label>
                </div>
            </div>

            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">备注</label>
                <div class="layui-input-block">
                    <textarea placeholder="请输入备注内容" class="layui-textarea" name="remark"></textarea>
                </div>
            </div>

            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit="" lay-filter="demo1">添加专业</button>
                </div>
            </div>

        </form>



    </div>
</div>

<script src="${pageContext.request.contextPath}/lib/layui-v2.5.5/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['form', 'layedit', 'laydate'], function () {
        var form = layui.form
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate;
        $ = layui.$;

        // 1. 验证专业名，失去焦点时触发
        $("#majorname").blur(function(){
            var majorname = $("#majorname").val();
            var reg = /^[\u4e00-\u9fa5]{2,15}$/;//正则表达式,2-15个汉字
            if(majorname.length == 0|| majorname==null || majorname == '') {
                layer.msg('专业名称不能为空', {icon: 5});
            }else{
                if(!reg.test(majorname)) {
                    layer.msg('格式不对，专业名称为2-15个汉字', {icon: 5});
                }
            }
        });


        //自定义验证规则
        form.verify({
            title: function (value) {
                if (value.length < 5) {
                    return '标题至少得5个字符啊';
                }
            }
            , pass: [
                /^[\S]{6,12}$/
                , '密码必须6到12位，且不能出现空格'
            ]
            , content: function (value) {
                layedit.sync(editIndex);
            }
        });


        //监听提交
        form.on('submit(demo1)', function (data) {
            console.log(data.field);
            /*layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })*/
            $.ajax({
                url:"${pageContext.request.contextPath}/major",
                type:"post",
                data:data.field,
                success:function(result){
                    if(result=='1'){
                        var index = layer.alert("添加成功", {
                            title: '提示'
                        }, function () {
                            // 关闭弹出层
                            layer.close(index);
                            var iframeIndex = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(iframeIndex);
                        });

                    }else{
                        layer.msg('添加失败', {icon: 5});
                    }
                }
            })

            return false;
        });




    });
</script>

</body>
</html>