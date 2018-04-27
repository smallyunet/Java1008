<%@ page contentType="text/html" pageEncoding="utf8" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<%@ page import="java.util.*"%>
<html>
<head><title>java web</title></head>
<body>
   <%
       Map map = new HashMap();
       map.put("mldn","www.mldn.cn");
       map.put("lxh","lixinghua");
       pageContext.setAttribute("ref",map);
   %>
   输出全部：
   <c:forEach items="${ref}" var="mem">
        <h3>${mem.key} --> ${mem.value}</h3>
   </c:forEach>
</body>
</html>