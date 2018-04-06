<%
    String username = "nihao";
%>
<jsp:forward page="forward_demo02.jsp">
    <jsp:param name="name" value="<%=username%>"/>
    <jsp:param name="info" value="www.abc,com"/>
</jsp:forward>