### 第7天内容 Java中的语句

#### 选择结构

对于以下的代码片段：

```
if (true) 
    int age = 10;

if (true)
    System.out.println("Hello");
```

编译过程中，第一个if语句会报错。if语句之后不允许变量的声明操作，在不加大括号的情况下。如果变量先声明，在if中使用，是允许的。

注意分号会结束语句。

> 职责单一原则（封装）：某个类的功能是单一的，方法的功能是单一的 
> 通用功能独立实现（重用）

关于Switch的用法，可以将default提到case前面，会执行，但是注意break的控制流程；default只有当所有case匹配不到时执行；case后面的条件只能是常量。

Switch后面的括号只能放byte、short、int、char、String类型，其他类型不可以。尤其注意不能放long型数据。

Switch支持多个case共享一段代码。

default、case是java关键字，一般只在Switch这里出现。

### Task

> ./Task/Task*