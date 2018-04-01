### Java简介

#### 查看Java官网

http://www.oracle.com/technetwork/java/javase/downloads/index.html

#### 查看Java官方教程

https://docs.oracle.com/javase/tutorial/

#### 查找Java发展历史

http://oracle.com.edgesuite.net/timeline/java/

#### Java平台分为几种？

三种：SE、EE、ME

1. Java SE：标准版，用于支撑基本的Java开发

2. Java EE：企业版，用于企业级开发

3. Java ME：微型版，用于支持微型设备上开发，比如手机游戏

#### Java语言有哪些特点？最大的特点是什么？

最大的特点是跨平台。Write once, Run anywhere.

- Simple 简单

- Object oriented 面向对象

- Distributed 分布式

- Mulitithreaded 多线程

- Dynamic 动态

- Architecture neutral 结构中立（跨平台）

- Portable 便携

- High performance 高性能

- Robust 健壮

- Secure 安全

#### 术语解释：OOP

Object Oriented Programming，面向对象编程

#### 请说明面向对象的三大特性？

继承、封装、多态

继承：使用继承是为了代码的复用

封装：使用封装是为了保护数据

多态：使用多态为了降低代码的耦合度，便于维护

#### 请对比一下C、C++、Java？

C语言是一种面向过程的语言，主要用于系统级编程、嵌入式编程、算法编程，C语言的编程单位是函数。

C++是一种面向过程和面向对象的组合，人们一般会将C++归结为面向对象的编程语言，主要用于图形图象处理、开发带有图形界面的软件，如QQ，或者工业控制软件。

Java是一中面向对象的编程语言，主要用于大型的管理系统开发，如果教务系统、淘宝、天猫，或者手机游戏开发、大数据开发、安卓APP等。Java是跨平台的。

理论上C和C++的性能高于Java，但Java的性能并不低。

## 如何使用Java

#### 下载安装JDK

http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

#### 术语解释JDK、JRE、JVM、API

JDK：Java Development Kit，工具包

JRE：Java Runtime Environment，运行环境

JVM：Java Virtual Machine，虚拟机

API：Application Programming Interface，应用编程接口

#### 配置环境变量

Linux参考：http://www.powerxing.com/linux-environment-variable/

#### 查看环境变量

Linux执行`$echo PATH`

#### 验证环境变量是否成功

执行`java -version`

#### 编写变量执行HelloWorld

./Lesson/HelloWorld.java

#### Java程序的执行过程是什么？

源文件编译产生字节码文件，然后经过虚拟机的解释，把字节码文件编程特定平台的机器指令。

#### .class文件是什么？平台相关吗？包含什么内容？如何查看其中内容？

字节码文件；平台无关；包含字节码；使用文本编辑器打开可以看到十六进制文件。

#### Java程序与C、C++程序执行过程有何不同？

C、C++经过编译链接后直接执行；Java被编译为.class后要再经过虚拟机的解释编程特定平台的机器指令才执行。

Java的执行过程有编译有解释，所以Java语言是编译型语言和解释型语言的结合体。

#### HelloWorld面试题

在语句`public static void main (String [] args) {}`中，依次删除掉"public"、"static"、"void"、"[]"、"String [] args"，以及更换"args"为"op"等任意字符，测试编译和执行结果：

删除"public"：编译成功，执行失败，"找不到 main 方法"

删除"static"：编译成功，执行失败，"main 方法不是类 HelloWorld 中的static"

删除"void"：编译失败，"方法声明无效; 需要返回类型"

删除"[]"：编译成功，执行失败，"找不到 main 方法"

删除"String [] args"：编译成功，执行失败，"找不到 main 方法"

将参数"args"替换为"op"：编译成功，执行成功

把关键字"static"放到"public"的前面：编译成功，执行成功

再把关键字"void"放到"static"的前面：编译失败，三个错误

#### 文件名和类名有什么关系？

如果一个类被关键字"public"修饰，则要求文件名和类名完全一致，包括大小写。

如果不使用"public"，文件名可以随意更改。

Java文件经过编译后的.class文件，一定是一个类对应一个文件，文件名和类名相同。

javac编译的时候，后面的文件名大小写不区分（Windows）；java执行的时候，文件大小写区分。

（编译的时候后面的参数是路径名，Windows平台不区分大小写；解释的时候后面的参数是类名）

#### 课后任务：安装其他Java开发IDE

#### 课后任务：编程实战

./Task/Task.java 
