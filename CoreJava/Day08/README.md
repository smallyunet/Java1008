
循环语句：while、do...while、for

嵌套循环continue/break跳到指定外层循环使用标号：

``` java
w: for (...) {
    for (...) {
        break w;
    }
}
```

==和equals的区别：

Object中的equals方法比较两个对象是否完全相同，String类则重写了equals方法，因此equals经常用于字符串的比较。
