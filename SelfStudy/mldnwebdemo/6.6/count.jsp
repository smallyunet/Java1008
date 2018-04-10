<%@ page contentType="text/html" pageEncoding="UTF8" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.math.*" %>
<html>
<head>
<title>java web</title>
</head>
<body>
<%!
    BigInteger count = null;    // 定义变量
%>
<%!
    public BigInteger load(File file){
        BigInteger count = null;    // 读取计数文件
        try {
            if(file.exists()){  // 如果文件存在
                Scanner scan = null;
                scan = new Scanner(new FileInputStream(file));
                if(scan.hasNext()){
                    count = new BigInteger(scan.next());
                }
                scan.close();
            } else {    // 如果文件不存在
                count = new BigInteger("0");
                save(file,count);   // 保存文件
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    public void save(File file, BigInteger count){
        try{
            PrintStream ps = null;
            ps = new PrintStream(new FileOutputStream(file));
            ps.println(count);
            ps.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
%>
<%
    String fileName = this.getServletContext().getRealPath("/")+"6.6/count.txt";
    File file = new File(fileName);
    if(session.isNew()){
        synchronized(this){  // 必须进行同步操作
            count = load(file);
            count = count.add(new BigInteger("1"));
            save(file, count);
        }
    }
%>
<h2>您是第<%=count==null?0:count%>位访客！</h2>
</body>
</html>
