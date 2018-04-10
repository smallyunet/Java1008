<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head>
<title>java web</title>
</head>
<body>
<%
    int buffer = out.getBufferSize();   // 得到缓冲区大小
    int available = out.getRemaining(); // 得到未使用缓冲区大小
    int use = buffer - available;
%>
<h3>缓冲区大小：<%=buffer%></h3>
<h3>可用缓冲区大小：<%=available%></h3>
<h3>使用中缓冲区大小：<%=use%></h3>
</body>
</html>
