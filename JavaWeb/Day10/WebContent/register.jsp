<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	用户名：<input type="text" name="username" id="username" />
	<span></span>

	<script>
		var xmlHttp 
		var username = document.getElementById("username")
		
		username.onblur = function () {
			xmlHttp = getReq()
			xmlHttp.onreadystatechange = hook
			xmlHttp.open("GET", "RegisterServlet", true)
			xmlHttp.send()
		}
		
		function getReq() {
			if (window.XMLHttpRequest) {
				return new XMLHttpRequest;
			} else {
				return new ActiveXObject("Microsoft.XMLHTTP")
			}
		}
		
		function hook() {
			if(4 == xmlHttp.readyState) {
				if (200 == xmlHttp.status) {
					alert(xmlHttp.response)					
				} else if (404 == xmlHttp.status) {
					alert("资源不存在")
				} else if (500 == xmlHttp.status) {
					alert("bad request")
				}
			}
		}
	</script>
</body>
</html>