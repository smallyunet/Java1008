<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	int sex = 1;
	pageContext.setAttribute("sex", sex);
	
	String hobby = "sing,dance";
	pageContext.setAttribute("hobby", hobby);
%>
<body>
	性别：
		<input type="radio" <c:if test="${sex == 0}">checked</c:if> />男
		<input type="radio" <c:if test="${sex == 1}">checked</c:if> />女 <br />
	班级：
		<select name="" id="">
			<option value="">7</option>
			<c:choose>
				<c:when test=""></c:when>
			</c:choose>
			<option value="">8</option>
			<option value="">9</option>
			<option value="">10</option>
		</select>
	<hr />	
	爱好：
		<c:forTokens items="${hobby}" delims="," var="h">
			<input type="checkbox" name="hobby" value="sing" <c:if test="${h==sing}">checked</c:if> />唱歌
			<input type="checkbox" name="hobby" value="dance" <c:if test="${h==dance}">checked</c:if> />跳舞
			<input type="checkbox" name="hobby" value="play" />打游戏
			<input type="checkbox" name="hobby" value="learn" />学习
		</c:forTokens>
</body>
</html>