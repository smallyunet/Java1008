<html>
    <head>
        <title>培训</title>
    </head>
    <body>
        <%
            String str = request.getParameter("info");  // 接受表单输入的内容
            out.println("<h1>" + str + "</h1>");        // 输出信息
        %>
    </body>
</html>