## Day08

### 游标

#### 什么是游标？

游标是从数据表中提取出来的数据，以临时表的形式存放在内存中，在游标中有一个数据指针，在初始状态下指向的是首记录，利用 FETCH 语句可以移动该指针，从而可以对游标的数据进行各种操作。

当SELECT 语句返回的是一个结果集，而如果需要对结果集中单独的行进行操作，则需要使用游标。

#### 游标的分类

- 显示游标
    显式游标：由开发人员通过程序显示控制，
    用于从表中取出多行数据，并将多行数据一行一行单独进行处理。

- 隐式游标
    被用于描述执行的 SQL 命令，PL/SQL中出现的SQL语句，ORACLE都会自动为其分配一
    段私有的内存空间，也就是私有游标区域
    比如：执行UPDATE语句时。

#### 显示游标和隐式游标的应用场景

### 使用显示游标的基本步骤

#### 显示游标的使用

基本步骤（4步）

1. 声明游标
2. 打开游标
3. 向游标中读取数据
4. 关闭游标

一、声明游标

格式：CURSOR 游标名 IS SELECT 语句
注：
1. CURSOR 是定义游标的关键字
2. SELECT 是建立游标的数据表查询命令

二、打开游标

格式：OPEN  游标名;
注：打开游标的过程有两个步骤：
1. 将符合条件的记录送入内存
2. 将指针指向第一个记录

三、提取数据（检索游标）

格式：FETCH 游标名 INTO 记录型变量名;

四、关闭游标
    
格式：CLOSE 游标名;

#### 游标的属性
- %ISOPEN 属性
属性功能：测试游标是否打开，如果没有打开就是用 FETCH 语句会提示错误
- %FOUND属性
属性功能：测试前一个 FETCH语句是否有值，有则返回 TRUE，否则返回 FALSE
- %NOTFOUND属性
该属性是%FOUND的反逻辑
- %ROWCOUNT属性
属性功能：用于返回游标的数据行数

#### LOOP语句循环游标
#### WHILE语句循环游标
#### FOR语句循环游标（隐式游标）
#### 带参数的游标

### 异常处理

#### 什么是异常
在操作PL/SQL时，可能会遇到一些程序出现的错误信息，这种情况被称为异常。
（也被称为例外）
#### 异常处理的语句
语法：
```sql
DECLARE
BEGIN
    PL/SQL代码块；
EXCEPTION
    WHEN exception1 THEN
        statements1;
    WHEN exception2 THEN
        statements2;
    WHEN exception3 THEN
        statements3;
        [  ......  ]
    WHEN OTHERS THEN
        statementsN;
END;
```
#### 异常的分类
- 系统异常（预定义异常）
    系统异常是指Oracle系统为一些经常出现的错误定义好的异常（预定义的异常），
    如被零除或内存溢出等。
    系统异常无须声明，当系统预定义异常发生时,Oracle系统会自动触发，
    只需添加相应的异常处理即可。
- 非系统异常（非预定义异常）
    在PL/SQL中还有一类会经常遇到的错误。每个错误都会有相应的错误代码和错误原因，
    但是由于Oracle没有为这样的错误定义一个名称，因而不能直接进行异常处理。
    只能在PL/SQL块执行出错时查看其出错信息。比如：违反数据完整性约束等。

    对于这种非预定义的异常，用户需要先在声明部分申明定义一个异常名称，
    然后将异常名称与错误代码进行关联，再进行异常处理。
语法：
```sql
exception_name  EXCEPTION;
PRAGMA EXCEPTION_INIT(exception_name,exception_no);
```

#### 自定义异常

系统异常和非系统异常主要是因程序本身的在逻辑错误引起的异常，而在实际应用中，程序员还可以根据需求，为实现具体的业务逻辑自定义相关的异常。

因为这些业务逻辑是Oracle系统无法判断的。例如不允许删除管理员表中的最高管理员等。

创建自定义异常需要使用语法：

    RAISE_APPLICATION_ERROR(error_number,error_massage,[keep_errors]);

语法说明：

- error_number:表示错误号。可以使用-20000到-20999之间的整数。
- error_message: 表示相应的提示信息（<2048字节）。
- keep_errors:可选，如果为TRUE,则新错误被添加到已经引发的错误列表中。

如果为FALSE,则新错误将替换当前的错误列表。

    RAISE  异常名称      ；   --抛出异常

### 触发器

#### 什么是触发器

触发器是指被隐含执行的存储过程。在建立了触发器之后，如果发生了相应的DML操作，
那么会自动执行触发的相应代码。

触发器主要包括：语句触发器和行触发器两种类型。
触发器中包含DML语句触发器 ,DDL语句触发器等

#### 语句触发器

语句触发器是指当执行DML语句时被隐含执行的触发器。如果在表上针对某种DML操作建立了
语句触发器，那么当执行DML操作时会自动执行触发器的相应代码。
语句触发器针对某一条语句触发一次。

注意:当使用语句触发器时，不能记录列数据的变化。

语法：
```sql
CREATE OR REPLACE TRIGGER trigger_name
timing event1[OR event2 OR event3]
ON table_name
PL/SQL block
```
注意：

- trigger_name 用于指定触发器的名字
- timing 用于指定触发时机（BEFORE或AFTER）
- event 用于指定触发事件（INSERT、UPDATE和DELETE）;
- table_name 用于指定DML操作所对应的表名

#### 行触发器
行触发器是指当执行DML操作时，每作用一行会触发一次触发器。

行触发器的语法：
```sql
CREATE [OR REPLACE] TIRGGER trigger_name 
timing event1 [OR event2 OR event3]
OF fields
ON table_name
FOR EACH ROW
PL/SQL block;
```
注：
- trigger_name 用于指定触发器的名字;
- timing 用于指定触发时机（BEFOR或AFTER）;
- event 用于指定触发事件（INSERT、UPDATE和DELETE）;
- of fields 适用字段
- table_name 用于指定DML操作所对应的表名;
- FOR EACH ROW 表示建立行触发器;



引用变量
- :old   修饰符引用旧数据 
- :new    修饰符引用新数据

总结：

- :new在BEFORE触发器中赋值，取值；在AFTER触发器中取值。
- :new是新插入的数据，:old是原来的数据
- INSERT只会有:new，代表着要插入的新记录
- DELETE只会有:old，代表着要删除的记录

注意：当编写DML触发器时，触发的代码不能从触发器所对应的基表中读取数据。

例如，如果要基于EMPLOYEES表建立触发器，该触发器的执行代码不能包含对EMPLOYEES表的查询操作.尽管在建立触发器时不会出现任何错误，但在执行相应触发操作时会显示
错误信息。

#### 编译触发器
当修改表结构时，会导致触发器变为无效状态，必须要重新编译触发器。

语法如下：

    ALTER TRIGGER trigger_name COMPILE;

#### 删除触发器
当触发器不再需要时，可以把触发器删除

    DROP TRIGGER trigger_name;
#### 显示触发器
查询触发器可用表：USER_TRIGGERS

    SELECT trigger_body FROM USER_TRIGGERS
    WHERE trigger_name = 'DEAL_EMP_TRIGGER ';
