package net.smallyu.java.designpattern.proxy.cases4;

import java.lang.reflect.InvocationHandler;

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
        // 寻找JoinPoint连接点，AOP框架使用元数据定义
        if(true){
            // 执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        // 执行目标
//        return (T) Proxy.newProxyInstance(loader, interfaces, h);
        return null;
    }
}
