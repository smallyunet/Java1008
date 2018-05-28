### 第10天内容

#### 循环

结束循环的方式:

- break;

- return;

- System.exit(0);

嵌套循环，内外层循环切换效率较低，所以外层循环次数尽可能（比内层循环）少。

#### 数组

- 数组创建的时候单元是有初始值的，int = 0, double = 0.0, boolean = false, char = 0；复合类型为null

- 数组(class, interface, array)属于复合类型，以对象形式存在；所以创建用new

- 数组声明时不能指定大小（长度）；数组的长度在创建时候指定

- 数组是一种线性结构，只能存放单一数据类型，不存在数据类型的隐式转换

length和length()的区别：length是数组的一个属性，length()是字符串类的一个方法。

数组的初始化方式：

``` java
// 静态初始化
int[] array = {1, 2, 3}; 
// 动态初始化
int[] array = new int[3];
int[0] = 1;
int[1] = 2;
int[2] = 3;
```

数组的排序：java.util.Arrays.sort(array);

#### 数组在内存中

```
int[] a = {1, 2};
int[] b = a;
b[0] = 3;
sysout(a[0]);
```

结果a[0]的值会受影响。

基本类型或者复合类型在这种情况都会发生改变。

#### 多维数组

int[][] x = new int[3][4];

int[][] x = new int[3][];

第二种写法是允许的，第一维的大小必须指定，其他维则不需要。

#### OOP

封装：保护数据（属性私有，提供公共方法对属性进行访问）

继承：类的重用（复用）

Java只支持单继承，一个类只能有一个直接父类；间接父类也叫父类，允许多个

Object类是所有类的顶级父类