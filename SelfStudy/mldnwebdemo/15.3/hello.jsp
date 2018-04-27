<%@ page language="java" pageEncoding="UTF8"%>
<%@ taglib uri="http://www.mldn.cn/struts/bean" prefix="bean" %>
<%@ taglib uri="http://www.mldn.cn/struts/html" prefix="html" %>
<%@ taglib uri="http://www.mldn.cn/struts/logic" prefix="logic" %>
<html:html lang="true">
<head><title>java web</title></head>
<body>
    <html:errors/>
    <login:present name="msg" scope="request">
        <h2>${msg}</h2>
    </login:present>
    <html:form action="/15.3/hello.do" method="post">
        请输入信息：<html:text property="info"></html:text>
        <html:submit value="显示"></html:submit>
    </html:form>
</body>
</html>
