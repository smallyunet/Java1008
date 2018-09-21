<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<script src="jquery.js"></script>
</head>

<%
	//pageContext.getELContext().getImportHandler().importPackage("com.ychs168.java.util"); 
%>

      
<body>
|${el[IContents.CLASS_LIST]} |
<hr />
班级：<select name="" id="classinfo">
		<option value="">--请选择--</option>
		<c:forEach items="${classList}" var="classinfo">
			<option value="${classinfo}">${classinfo}</option>
		</c:forEach>
	</select>
	<table class="layui-hide" id="test"></table>
	
	<script>
		
		$(function() {
			var d
			
			var table = $('table')[0]
			var tr = table.insertRow()
			tr.insertCell(0).innerHTML = '班级'
			tr.insertCell(1).innerHTML = '学生'
			
			$('#classinfo').change(function() {
				trs = table.getElementsByTagName("tr")
				for(var i = trs.length - 1; i > 0; i--) {
					trs[i].remove()
				}
				
				var value = this.value
				$.ajax({
					type: "POST",
					url: "StudentManagerServlet",
					data: "method=queryStudents&classinfo=" + value,
					success: function(res) {
						parseJson(value, res)
						d = JSON.parse(res)
					}
				})
			})
			
			function parseJson(value, json) {
				json = JSON.parse(json)
				$.each(json, function(d1, d2) {
					var tr = table.insertRow()
					tr.insertCell(0).innerHTML = d1
					tr.insertCell(1).innerHTML = d2
				})
			}
		})
		
	</script>
</body>
</html>