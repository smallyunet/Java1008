<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
院校：<select name="" id="college">
		<option value="">--请选择--</option>
		<option value="lixuexi">理学</option>
		<option value="dianzi">电子</option>
		<option value="ruangong">软工</option>
	</select>
班级：<select name="" id="class">
		<option value="">--请选择--</option>
	</select>
	
	<script>
		var college = document.getElementById("college")
		var classInfo = document.getElementById("class")
		var parser = new DOMParser()

		var req = new XMLHttpRequest()
		req.onreadystatechange = function() {
			if (4 == req.readyState && 200 == req.status) {
				var children = classInfo.getElementsByTagName('option')
				//console.log(children)
				for(var i = 1; i < children.length; i++) {
					//console.log(children[i])
					classInfo.removeChild(children[i])
				}
				var result = req.responseXML
				var classArray = result.getElementsByTagName("class")
				for (var i = 0; i < classArray.length; i++) {
					className = classArray[i].getElementsByTagName('name')[0].innerHTML
					var option = document.createElement('option')
					option.innerHTML = className
					classInfo.append(option)
				}
			}
		}
		
		college.onchange = function() {
			if ("" == this.value) {
				return
			}
			req.open('POST', 'ClassInfoServlet', true)
			req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
			req.send('college=' + this.value)
		}
	</script>
</body>
</html>