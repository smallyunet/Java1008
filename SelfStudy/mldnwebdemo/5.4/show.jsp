<%@ page language="java" contentType="text/html" pageEncoding="GBK"%>
<%@ page errorPage="error.jsp"%> <%-- 出错将跳转到error.jsp --%>
<%
    int result = 10 / 0;    // 这里发生异常
%>
<h1>欢迎光临本页面</h1>