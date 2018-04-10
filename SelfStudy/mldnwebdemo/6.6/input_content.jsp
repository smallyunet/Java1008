<%@ page contentType="text/html" pageEncoding="UTF8" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<html>
<head>
<title>java web</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF8");
    String name = request.getParameter("filename");
    String content = request.getParameter("filecontent");
    String fileName = this.getServletContext().getRealPath("/")
        + "6.6/note" + File.separator + name;
    File file = new File(fileName);
    if(!file.getParentFile().exists()) {    // 判断父文件夹是否存在
        file.getParentFile().mkdir();   // 创建文件夹
    }
    PrintStream ps = null;
    ps = new PrintStream(new FileOutputStream(file));
    ps.println(content);
    ps.close();
%>
<%
    Scanner scan = new Scanner(new FileInputStream(file));
    scan.useDelimiter("\n");    // 设置读取分隔符
    StringBuffer buf = new StringBuffer();
    while(scan.hasNext()) {
        buf.append(scan.next()).append("<br>");
    }
    scan.close(); 
%>
<%=buf%>
</body>
</html>
