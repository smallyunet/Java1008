<%@ page contentType="text/html; chatset=GB2312"%>
<%@ page import="java.util.* "  %>
<%@    taglib prefix="mytag" uri="mldn"%>
<html>
<head>
<title>java web</title>
</head>
<body>
<%
    List<String> all = new ArrayList<String>();
    all.add("123");
    all.add("456");
    all.add("789");
    all.add("666");
    request.setAttribute("all",all);
%>
<mytag:present name="all" scope="request">
    <mytag:iterate id="url" name="all" scope="request">
        <h3>content:${url}</h3>
    </mytag:iterate>
</mytag:present>
</body>
</html>