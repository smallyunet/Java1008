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
		var span = username.nextElementSibling
		
		username.onblur = function() {
			xmlHttp.open('GET', 'RegisterServlet', true)
			xmlHttp.send()
		}
		
		xmlHttp = getXmlHttp()
		xmlHttp.onreadystatechange = function() {
			if (4 == xmlHttp.readyState && 200 == xmlHttp.status) {
				span.innerHTML = xmlHttp.response
			}
		}
		
		function getXmlHttp() {
			if (window.XMLHttpRequest) {
				return new XMLHttpRequest()
			} else {
				return new ActiveXObject("Microsoft.XMLHTTP")
			}
		}
	</script>
</body>
</html>