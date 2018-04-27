<%@ page contentType="text/html" pageEncoding="utf8" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<%@ page import="java.util.*"%>
<html>
<head><title>java web</title></head>
<body>
   <%
       List all = new ArrayList();
       all.add("mldn");
       all.add("lihuaxing");
       all.add("www.mldn.cn");
       pageContext.setAttribute("ref",all);
   %>
   <h3>输出全部：
   <c:forEach items="${ref}" var="mem">
        ${mem}、
   </c:forEach></h3>
</body>
</html>