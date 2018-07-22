## Day03

### DML数据操纵语言

#### 插入数据

一、默认输入一条完整记录，并且输入值的顺序和表的字段顺序一致，使用格式1

    格式1：INSERT INTO 表名 VALUES（值1，值2，值3，值4……）；

注意：字符串和日期类型需要用单引号

```sql
INSERT INTO t_class VALUES('101','计科一班');
INSERT INTO t_student VALUES(
'yc001','TOM','男'，'13567890989','67897657@qq.com', '101');
COMMIT;
```

二、输入一条不完整的记录，就需要用到格式2，明确的指定出字段名和值，并且前后顺序一致

    格式2：INSERT INTO 表名 （字段名1，字段名2，字段名3，字段名4） VALUES（值1，值2，值3，值4）；

```sql
INSERT INTO t_student (sid,sname)                 
VALUES('yc002','张华');                              
COMMIT;
```

三、在插入中使用默认值DEFAULT

如果有默认值，就会使用默认值；如果没有默认值就使用NULL

```sql
CREATE TABLE t_test(
    id NUMBER(8) default 1
);
INSERT INTO t_test values(DEFAULT); 
```

#### 数据更新

格式1—更新单列：（更新了所有行的某一列）

    UPDATE 表名 SET 字段名 = 新值; 

格式2—更新多列：

    UPDATE  表名 SET 字段名1 = 新值1，字段名2 = 新值2，字段名3 = 新值3;

格式3—更新指定记录：

    UPDATE 表名 SET 字段名 = 新值 WHERE  条件;

注意：

1. 数字不用单引号，日期和字符必须使用单引号
2. 更新数据时，数据必须与列的数据类型匹配
3. 更新数据时，数据必须要满足约束规则

#### 删除记录

格式1—删除所有记录： 

    DELETE  FROM  表名;

格式2—删除指定记录：

    DELETE FROM 表名 WHERE 条件;

补充：当对表的所有行全部删除时，除了 DELETE 操作之外，还可以使用 TRUNCATE TABLE
  
  格式：TRUNCATE TABLE 表名

两者区别：TRUNCATE 速度快。

当使用DELETE 删除表中的数据行时，Oracle会使用撤销表空间（UNDO TABLESPACE）来存放恢复的信息。在这期间，如果用户没有发出COMMIT语句，而是发出ROLLBACK语句，Oracle 系统会将数据恢复到删除 之前的状态。当用户使用TRUNCATE 语句对表的数据进行删除时，系统不会将被删除的数据写到回滚段（或撤销表空间）中，所以速度快得多。

DELETE操作与TRUNCATE TABLE 操作具有不同的应用场合，当删除部分数据时，应该使用DELETE语句，并添加WHERE条件；删除全部数据时，应该使用TRUNCATE TABLE 语句。同时，TRUNCATE TABLE 删除全表数据时，效率也要高于DELETE语句。

    TRUNCATE  TABLE t_test;

注意：一个表里的主键在其他表里做外键，如果找到子记录，父记录无法删除。违反完整约束条件。如果一定要删除父记录，就要先删除子记录。

#### DELETE与TRUNCATE的区别

一、相同点：

    DELETE FROM 表名 与 TRUNCATE TABLE 表名都可以删除表里数据,删除数据后表结构还在

二、不同点：

1. TRUNCATE TABLE属于DDL语言，自动提交 ；
    而DELETE FROM 属于DML语言，需要COMMIT提交
2. DELETE 可以带WHERE条件删除指定记录，但是TRUNCATE不可以删除指定记录，而是全部删除
3. DELETE删除数据后不释放表空间，但是TRUNCATE删除数据后会释放数据所在的表空间，
    但索引等所占用的表空间不会释放，需要通过命令去释放
4. 删除数据表所有数据时，TRUNCATE 的操作并不记录到日志，TRUNCATE TABLE 的速度比DELETE 快
5. DELETE 删除数据后只要没有COMMIT,就可以回滚ROLLBACK,但是
    TRUNCATE 删除数据后不可以回滚ROLLBACK
6. TRUNCATE可以删除视图，但是DELETE不可以删除视图

### 序列

序列(SEQUENCE)是可以为表中的行自动生成序列号，产生一组等间隔的数值(类型为数字)。

#### 序列的作用

    很多应用要求使用唯一的数值作为主键值。可以在应用程序编写代码来解决这个要求，也可以使用序列(Sequence)自动产生唯一数值

#### 创建序列语法：

```sql
CREATE SEQUENCE <sequencen_name> 
	INCREMENT BY n
	START WITH n
	[MAXVALUE n][MINVALUE n]
	[CYCLE|NOCYCLE]
	[CACHE n|NOCACHE];
```

- INCREMENT BY n --表示序列每次增长的幅度;默认值为1.
- START WITH n --表示序列开始时的序列号。默认值为1.
- MAXVALUE n --表示序列可以生成的最大值(升序).
- MINVALUE n --表示序列可以生成的最小值(降序).
- CYCLE --表示序列到达最大值后，在重新开始生成序列.默认值为 NOCYCLE。
- CACHE n --允许更快的生成序列.-其中n代表一个整数，默认值为20，制定存入缓存（也就是内存）序列值的个数 
- NOCACHE 

注：通常序列名命名以“seq”作为前缀

#### 序列的使用：

	序列名 . currval        获取当前序列号

注意在刚建立序列后,序列的CURRVAL值为NULL，所以不能直接使用，需要先初始化序列:

	方法:SELECT  <sequence_name>.nextval FROM  dual;
	示例:SELECT  t_seq.nextval FROM dual;

之后就可以使用CURRVAL属性了

	序列名 . nextval			获取下一个序列值 

#### 删除序列

	DROP SEQUENCE 序列名称;

### TCL事务控制语言

TCL（Transaction Control Language）事务控制语言用于维护数据的一致性，包括COMMIT、ROLLBACK和SAVEPOINT 语句。

其中，COMMIT语句用于提交对数据库的更改，ROLLBACK语句用于取消对数据库的更改，而SAVEPOINT语句则用于设置保存点。

事务可用于操作数据库的任何场合，包括应用程序、存储过程、触发器等。

1. 什么是事务

	事务是对数据库操作的逻辑单位，在一个事务中可以包含一条或多条DML （数据操纵语言）这些语句组成一个逻辑整体。

    在关系数据库中，一个事务可以是一条SQL语句，一组SQL语句或整个程序。

	事务是恢复和并发控制的基本单位。

	为什么要使用事务？到银行存钱，于是有这么几个步骤：

	1. 把钱交给工作人员；
    2. 工作人员填单；
    3. 将单子给我签字；
    4. 工作人员确认并输入电脑。

	要是我把钱交给工作人员之后，进行到了我签字了。那哥们突然心脏病发作，over掉了，那，我的钱还没有输入电脑，但我却交了钱又签字确认了，而并没有其他任何记录。我岂不是要亏死了？？？我的血汗钱啊！赶紧退给我！！

2）事务的操作

	TCL（Transaction Control Language）事务控制语言用于维护数据的一致性，包括COMMIT、ROLLBACK和SAVEPOINT 语句。

	其中，COMMIT语句用于提交对数据库的更改，ROLLBACK语句用于取消对数据库的更改，而SAVEPOINT语句则用于设置保存点。

	事务可用于操作数据库的任何场合，包括应用程序、存储过程、触发器等。

3）事务的特性ACID：

1. 原子性（Atomicity):事务必须是原子工作单元，对于其数据修改，要么全部执行，要么全都不执行。
2. 一致性（Consistency):事务在完成时，必须使所有的数据都保持一致状态。
3. 隔离性(Isolation):由并发事务所作的修改必须与任何其它并发事务所作的修改隔离。
4. 持久性（Durability):事务完成之后，它对应系统的影响是永久性的。

在企业应用中，多个事务并发所可能存在的问题如下：

1. 脏读：一个事务读到另一个事务未提交的更新数据。
2. 不可重复读：一个事务两次读同一行数据，可是这两次读到的数据不一样。
3. 幻读：一个事务执行两次查询，但第二次查询比第一次查询多出了一些数据行。
4. 丢失更新：撤销一个事务时，把其他事务已提交的更新的数据覆盖了。

---

### 数据查询语言

#### 查询所有/指定字段

1、查询所有字段语句语法：
		
    SELECT  *  FROM  table_name;

2、 查询指定字段语句语法：

    SELECT  字段1 ，字段2，字段3... FROM table_name;

- SELECT 语句中可以用“*”来列出某个表的所有列名，但是这样的写法对Oracle系统来说会存在解析的动态问题。
- Oracle系统会通过查询数据字典来将“*”转换成表中的所有列名，这自然会消耗系统时间，降低查询效率。
- 所以建议用户在写SELECT 语句时，尽量使用列名,可以优化SQL语句。

#### 查询列表中使用算术表达式

算术运算符

1. SELECT 语句中算术运算符+、-、*、/四个算术运算符
2. 对于 Date 型数据可以使用+、-运算符

空值NULL的使用要注意:

1. NULL是未知的、不存在、不确定、不可用、未分配的值。
2. 空值不等于零或空格，NULL与空字符串不同，因为空值是不存在的值，而空字符串是长度为0的字符串。'  '  || NULL
3. 任意类型都可以支持空值
4. 因为空值代表未知的值，所以并不是所有的空值都相等。所以不可以用“=”运算符来检查空值。

注意：数据库中，任何值和NULL做算术运算结果都为 NULL  ，但是NULL与字符串使用“||”连接结果还是字符串。

#### 定义别名

一、定义列的别名:

    SELECT 某字段 AS 别名 
    FROM 表名；

或者

    SELECT 某字段 别名 
    FROM 表名；

二、定义表的别名

    SELECT 字段列表 
    FROM 表名  表别名；
    
(定义表别名不能用AS)

注意：别名中有特殊字符（如：空格，大小写）时必须加双引号，例如“Salary”,"  年    薪  "

#### 去掉重复行

DISTINCT 的作用是去重。 它可用来限制在查询结果显示不重复的记录，重复的记录就去掉了。

DISTINCT的作用范围是后面所有字段的组合。

#### 使用连接符||

可以连接数字、字符串、日期

    'Hello' || 'World'

注意：NULL 和任何字符串拼接都是字符串本身

注意：SQL中字符串和日期使用单引号。

#### 指定过滤条件 WHERE子句

##### 使用算术比较运算符比较筛选

比较运算符:

    =、>、<、
    >=、<=、
    <> (或!=)  不等于

两个特殊的“比较筛选”操作：

    A {operator} ANY(B):  

A与B中的任何一个元素进行operator运算符的比较，只要有一个比较值为true,就返回数据行。

如： sal=ANY(1500,3000) ，ANY表示其中之一,类似OR，也可以解释为任意一个，只要满足一个就可以了。

    A {operator} ALL(B):  

表示A与B中的所有元素进行operator运算符的比较，只有与所有元素比较值都为true，才返回数据行。

如： sal<>ALL(3000,950,800) 工资同时不等于3000,、950和800

##### 使用逻辑运算符筛选


运算符 | 含义
--- | --- 
AND	| 如果组合的条件都是TRUE,返回TRUE	
OR	| 如果组合的条件之一是TRUE,返回TRUE	
NOT	| 如果下面的条件是FALSE,返回TRUE	

优先级 | 运算符
--- | ---	  
1 | 比较运算符   
2 | NOT   
3 | AND   
4 | OR 

注意：WHERE条件中同时有OR和AND时，要注意条件组合的问题，如果OR 先执行需要加()括号，因为AND优先级比OR的优先级高。