## Day05

### 多表查询

#### 什么是多表查询

多表查询：在查询时，需要涉及到两个以上表的查询。

#### 为什么要使用多表查询

业务需求：前面几节课所有操作的数据来源都是一张表，但在实际业务中由于数据库的设计规范，需要查询的信息往往来源与多个表。

例如：查询“所有员工信息，以及他们所在部门的基本信息”，设计到的是两个数据源，一个是员工表，另一个是部门表。

解决方案：

```sql
SELECT * 
FROM emp,dept;
```

查询结果：查询出的结果是一个“笛卡尔积”：第一个表中的所有记录和第二张表中的所有记录逐个配对，但结果大部分数据并不是我们想要的，想要获取到符合条件的数据，就需要用到“连接查询”

注意：使用多表查询时必须弄清楚表之间的关联，这是多表查询的基础。需要通过建立两个表之间的关系，使用连接条件筛选后查询出想要的结果。

#### 如何建立多表连接

1. 如何建立多表连接
    1. 通过主键-外键连接。
    2. 通过相同（相关）字段连接。
2. 问题
    1. 主键与外键名称必须相同吗？不是必须相同，习惯相同
    2. 外键取值能为空吗？(可以）

#### 等值连接

多张表的连接值相等。

WHERE子句中写的多表连接的条件，用等号连接相同的两个字段。

表1.字段 = 表2.字段

连接条件的个数有N-1个（N表示数据表的数目）
	
#### 不等值连接

多张表的连接值不相等。

WHERE子句中写的多表连接的条件，使用除了等号以外的运算符连接多张表的连接值。

在连接条件中可以使用的运算符有:>,<,<=,>= ,<>,BETWEEN...AND

#### 内连接

内连接是一种多表关联查询方式，一般使用关键字INNER JOIN来实现。其中，INNER关键字可以省略，当只使用JOIN关键字时，语句只表示内连接操作。在使用内连接查询多个表时，必须在FROM子句之后定义一个ON子句，该子句用来指定两个表实现内连接的“连接条件”。需要注意的是，在内连接的检索结果中，所有记录行都是满足连接条件的。内连接的语法格式如下：

```sql
SELECT column_list
FROM table_name1  [INNER]  JOIN  table_name2
ON join_condition;
```

- column_list: 字段列表
- table_name1  和table_name2：两个要实现内连接的表。
- join_condition:实现内连接的条件表达式
        	
#### 自连接
   
把一张表当成两张表用，自己和自己连接。给两张表取别名。

```sql
SELECT  select_list
FROM  table_name  t1，table_name  t2
WHERE  search_condition;
```

#### 外连接

内连接INNER JOIN...ON：返回完全满足条件的记录
	
外连接：返回所有的匹配行和一些或全部不匹配的行，也就是会返回不满足条件的记录，这取决于所建立的外连接的类型。

SQL支持三种

1. 左外连接
    LEFT OUTER JOIN...ON

2. 右外连接
    RIGHT OUTER JOIN...ON

3. 完全连接
    FULL OUTER JOIN ...ON

注：OUTER可以省略 。

##### 左外连接

```sql
SELECT  字段列表
FROM
表1  t1 LEFT OUTER JOIN  表2  t2  ON
t1.字段 = t2.字段;
```

等价于

```sql
SELECT  字段列表
FROM  
表1  t1  ， 表2  t2 
t1.字段 = t2.字段(+);
```

注意： 
在左外连接查询中，左表是主表，右表是从表。左外连接返回关键字LEFT JOIN左边的表中的所有行，但是这些行必须符合查询条件。如果左表中某数据行没有在右表中找到相应的匹配的数据行，则结果集中右表对应位置使用空值。
			   
    t1.字段 = t2.字段(+)

用（+）来实现， 这个+号可以这样来理解： + 表示补充，即哪个表有加号，这个表就是匹配表。如果加号写在右表，左表就是全部显示，所以是左连接。

##### 右外连接
			
##### 完全外连接

```sql
SELECT  字段列表
FROM
表1  t1 RIGHT OUTER JOIN  表2  t2  ON
t1.字段 = t2.字段;
```

等价于

```sql
SELECT  字段列表
FROM  
表1  t1  ， 表2  t2 
t1.字段 (+)= t2.字段;
```

注意： 
在右外连接查询中，右表是主表，左表是从表。右外连接返回关键字RIGHT JOIN右边的表中的所有行，但是这些行必须符合查询条件。如果右表中某数据行没有在左表中找到相应的匹配的数据行，则结果集中左表对应位置使用空值。 

    t1.字段 (+)= t2.字段

用（+）来实现， 这个+号可以这样来理解： + 表示补充，即哪个表有加号，这个表就是匹配表。如果加号写在左表，右表就是全部显示，所以是右连接。

使用（+）注意事项
    1. 有（+）表示这是联接条件。无（+）表示这是过滤条件。
    2. 联接条件决定哪些行可以被联接到一起，过滤条件决定哪些行可以被返回。
			
### 视图

#### 什么是视图

视图是由一个或者多个表组成的虚拟表。实际就是SELECT 语句。

#### 视图的作用
		
##### 视图作用：

1. 简单性。看到的就是需要的。视图不仅可以简化用户对数据的理解，也可以简化他们的操作。那些被经常使用的查询可以被定义为视图，从而使得用户不必为以后的操作每次指定全部的条件。
2. 安全性。通过视图用户只能查询和修改他们所能见到的数据。
3. 逻辑数据独立性。视图可帮助用户屏蔽真实表结构变化带来的影响。

通过创建视图可以提取出数据逻辑上的集合或组合。

视图是基于一个或多个表或视图的逻辑表，视图本身并不包含数据，但是却像一个窗口，通过它可以查询或修改表中的数据。

视图所基于的表称为基表，视图是存储在数据字典中的一条SELECT语句。

##### 使用视图的优点：

1. 为用户集中数据，简化用户的数据查询和处理。
2. 屏蔽数据库的复杂性，用户不必了解数据库的复杂性。
3. 简化用户权限的管理，只授予用户使用视图的权限。
4. 便于数据共享，多个用户不必都定义所需的数据。
5. 可以重新组织数据，以便关联到其他应用中。

#### 视图的创建

```sql
CREATE VIEW 视图名
AS SELECT 语句
[WITH READ ONLY]
[WITH CHECK OPTION];
```

注：
- WITH READ ONLY子句用于定义只读视图。
- 定义视图使用WITH CHECK OPTION，则插入数据应符合相应条件。
- 创建视图原则
- 定义视图的查询可以采用复杂的SELECT语法，可以包含连接、分组、子查询。
- 定义视图的查询中不能使用ORDER BY子句，因为ORDER BY 子句可以在从视图中查询数据时使用

#### 视图分类

##### 简单视图

简单视图：它是指基于单个表所建立的，不包含任何函数，表达式以及分组数据的视图。在该视图上可以执行DML语句（即可执行增、删、改操作）。

##### 复杂视图
    
复杂视图：它指包含函数、表达式或者分组函数的视图，使用复杂视图的主要目的是为了简化查询操作。

在该视图上执行DML语句时必须要符合特定条件。
复杂视图有部分可以DML操作，若复杂视图中有分组函数、GROUPBY子句、DISTINCT、伪列等则不可以做DML操作。

注：在定义复杂视图时必须为函数或表达式定义别名。

##### 连接视图

连接视图：它是指基于多个表所建立的视图，使用连接视图的主要目的是为了简化连接查询。

一般来说不会在该视图上执行INSERT、UPDATE、DELETE操作。

##### 只读视图
    
只读视图：它是指只允许SELECT操作，而禁止使用任何DML操作的视图。在该视图定义时指定WITH READ ONLY选项。

只读视图创建的语法：

```sql
CREATE VIEW 视图名称 AS SELECT语法
WITH READ ONLY
```
##### CHECK约束视图

WITH CHECK OPTION用于在视图上定义CHECK约束,即在该视图上执行INSERT或UPDATE操作时,数据必须符合查询结果.

CHECK约束视图创建的语法：

```sql
CREATE VIEW 视图名称 AS SELECT语法
WITH CHECK OPTION
```

#### 使用视图

使用方法:像使用表一样使用就可以

##### 可以查看视图

    SELECT * FROM view_name;

##### 可以使用视图操作表数据

1. 通过视图添加表数据
    使用INSERT语句实现。　
    注意：视图是虚拟表，其本身不存储数据（来自其引用表),添加的数据是存储于视图参照的数据表中。
2. 通过视图更新表数据
    使用UPDATE语句实现 
3. 通过视图删除表数据
    使用DELETE 语句实现。

##### 修改视图

    CREATE OR REPLACE VIEW view_name AS  SELECT 语句;

##### 删除视图

    DROP VIEW  视图名;

		
		
		
