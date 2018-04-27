<%@ page contentType="text/html" pageEncoding="utf8" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<html>
<head><title>java web</title></head>
<body>
   <%
        String info[] = {"mldn","lixinghua","www.mldn.cn"};
        pageContext.setAttribute("ref",info);
   %>
   <h3>输出全部：
   <c:forEach items="${ref}" var="mem">
        ${mem}、
   </c:forEach></h3>
   <h3>输出全部（间隔为2）：
   <c:forEach items="${ref}" var="mem" step="2">
        ${mem}、
   </c:forEach></h3>
   <h3>输出前两个：
   <c:forEach items="${ref}" var="mem" begin="0" end="1">
        ${mem}、
   </c:forEach></h3>
</body>
</html>