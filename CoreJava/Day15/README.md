### 第15天内容

#### 复习

内存泄漏；有可能，比较少

#### 异常

抛出异常；捕获异常

捕获异常后一定要执行错误处理语句；

开发环境用控制台打印，生产环境用日志记录异常；

finally无论有无异常一定会执行；一般执行释放资源的代码；

final finally finalize() 区别

finalize()可以在垃圾回收之前执行一些操作，与垃圾回收有关；

#### 下午

Exception和Error的区别：

Error是错误，一旦发生，通过异常处理的机制无法解决，通过写代码的方式无法解决，如内存溢出，一般是系统级别的，程序员无能为力

Exception是异常，编程导致的潜在问题，可以通过编程方式解决

一个try可以有多个catch；catch的异常范围依次增大，不能减小

#### 异常的分类

Checked Exception;  已检查异常；程序编译的时候就能发现

UnChecked Exception; 未检查异常；程序执行的时候才能发现

列举熟悉的已检查异常和未检查异常：

ArithmeticException；算数异常；加减乘除求余；未检查

ArrayIndexOutOfBoundsException；数组越界；已检查

ClassCastException；类类型转换异常；已检查

ClassNotFoundException；已检查

IllegalAccessException；未检查

NoSuchFieldException；没有属性；未检查

NoSuchMethodException；没有方法；未检查

**NullPointerException；空指针异常；空对象调方法会产生；未检查**

NmberFormatException；未检查

RuntimeException；运行时异常；未检查

SQLException；未检查

FileNotFoundException；已检查

IOException；已检查

#### throw

throw 异常类的对象

throws 异常类对象；throws抛出未检查异常没有意义

throw和throws区别：

throw用在代码内部；throws用在方法的声明上，用于抛出异常给调用者处理

#### 异常继承

允许子类抛出比父类更多的异常，但是抛出的异常类型必须与父类异常相同或继承于父类异常；

允许子类抛出比父类更少的异常，允许0个

#### 输出3

``` java
public int get() {
    try {
	  return 1;
	}catch(Exception e) {
	    return 2;
	 } finally {
	    return 3;
	 }
}
```

#### 自定义异常

继承Exception类
