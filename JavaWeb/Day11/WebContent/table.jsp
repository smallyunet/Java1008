<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="layui/css/layui.css"  media="all">
	<script src="layui/layui.js" charset="utf-8"></script>
</head>
<body>
	<table class="layui-hide" id="test"></table>
	
	<script>
	layui.use('table', function(){
		  var table = layui.table;
		  
		  table.render({
		    elem: '#test'
		    ,url:'/Day11/TableServlet'
		    ,cellMinWidth: 80
		    ,cols: [[
		      {field:'id', title: 'ID', sort: true, align: 'center'}
		      ,{field:'username', title: '用户名', align: 'center'}
		    ]]
		  });
		});
	</script>
</body>
</html>