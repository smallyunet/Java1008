<%!
    public static final String INFO = "www.mldn.com";   // 定义全局常量
%>
<%!
    public int add(int x, int y) {  // 定义方法
        return x + y;
    }
%>
<%!
    class Person {
        private String name;
        private int age;
        public Person(String name, int age) {   // 通过构造方法赋初值
            this.name = name;
            this.age = age;
        }
        public String toString() {  // 覆写toString()方法
            return "name = " + this.name + ";age = " + this.age;
        }
    }
%>
<%  // 编写普通的Scriptlet
    out.println("<h3>INFO = " + INFO + "</h3>");    // 输出全局常量
    out.println("<h3>3 + 5 = " + add(3, 5) + "</h3>");  // 调用方法
    out.println("<h3>" + new Person("smallyu", 30) + "</h3>");  // 生成对象
%>