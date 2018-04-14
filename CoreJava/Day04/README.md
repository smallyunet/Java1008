### 第4天内容

---

数据类型只能由低级到高级自动转换，左侧低级类型可赋值到右侧高级类型；boolean类型不能参与类型的自动转换。

byte/char - short - int - long - float - double

强制类型转换在变量前使用括号标示要转换到的类型。

float类型的数据要使用f标明，像9.2f或9.2F。小数默认为double型；整数默认是int型。

特殊情况，在程序中，char、byte、short一律以int类型处理。

---

内存的逻辑划分一般四个区：栈、堆、全局数据区、代码段

- 栈：先进后出；放局部变量（方法形参，方法内部定义的）；用于频繁的数据交换；由OS管理

- 堆：放创建的对象，new的对象全放在堆区

- 全局数据区：static类型数据

- 代码段：放程序代码

内存泄露：无用对象依然占用内存空间

Java垃圾回收（Garbage Collection）机制：自动回收

我们能不能使用System.gc()强制JVM垃圾立即回收？ 不能，gc()只是建议，不能强制

对于简单的定义程序:

``` java
class Memory{
    public static void main(String[] args) {
        int age = 20;
        float height = 1.2;
    }
}
```

在栈内的储存顺序为：

```
         0x100  |     |
(height) 0x101  | 1.2 |
(age)    0x102  | 20  |
(args)   0x103  |     |
```

栈内存中保存的是变量的值，不是变量名；变量名是助记符，内存只关心变量储存的内存地址。

---

简单类型的值传递

复合类型的值传递

---

包的定义

包的使用

包的命名规范：全部小写

Java中不支持包的嵌套导入：

``` java
import java.awt.*;
import java.awt.color.*;
```

java.lang是Java语言的核心包，不需要导入。

常用的Java包：

```
java.lang   核心包
java.util   实用包
java.sql    数据库操作相关
java.io     
java.text
java.lang.reflect
```

包的种类：

- java基础包 以java开头
- java扩展包 以javax开头
- 第三方包 cn,org,com,net,
- 自定义包 cn,org,com,net,

导入包的次序：按照以上分类从上往下依次导入。

---

实现简单的+、-、*、/运算：

./Task/Task.java
