<%@ page contentType="text/html" pageEncoding="utf8" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<%@ page import="java.util.*"%>
<html>
<head><title>java web</title></head>
<body>
   <%
       String info = "www.mldn.cn";
       pageContext.setAttribute("ref",info);
   %>
   拆分结果：
   <c:forTokens items="${ref}" delims="." var="con">
        ${con}、
   </c:forTokens>

    拆分结果：
   <c:forTokens items="s:v:d" delims=":" var="con">
        ${con}、
   </c:forTokens>
   <%-- 报错了 --%>
</body>
</html>