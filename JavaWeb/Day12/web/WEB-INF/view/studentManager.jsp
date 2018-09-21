<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/19 0019
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../static/layui/css/layui.css">
    <script src="../../static/layui/layui.js"></script>
</head>
<body>
    studentManager.jsp
    <hr>

    <button class="layui-btn" id="btnAdd">增加</button>

    <form class="layui-form" action="">
        <div class="layui-form-item">
            <fieldset class="layui-elem-field" id="fsAdd" style="display: none">
                <legend>增加学生信息</legend>

                <div class="layui-form-item">
                    <label class="layui-form-label">编号</label>
                    <div class="layui-input-block">
                        <input type="text" id="id" name="title" required lay-verify="required" placeholder="编号" autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">姓名</label>
                    <div class="layui-input-block">
                        <input type="text" id="name" name="title" required lay-verify="required" placeholder="姓名" autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">性别</label>
                    <div class="layui-input-block">
                        <input type="radio" name="sex" value="男" title="男">
                        <input type="radio" name="sex" value="女" title="女" checked>
                    </div>
                </div>

                <button class="layui-btn" type="button" id="btnAddSub">提交</button>
            </fieldset>
        </div>
    </form>

    <script>
        layui.use(['layer', 'form'], function(){
            var $ = layui.jquery, layer = layui.layer

            $('#btnAdd').click(function() {
                $('#fsAdd')[0].style.display = 'block'
            })
        });
    </script>
</body>
</html>
