package net.smallyu.java.designpattern.proxy.cases4;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy {
   public static <T> T newProxyInstance(Subject subject) {
       // 取得ClassLoader
       ClassLoader loader = subject.getClass().getClassLoader();
       // 获得接口数组
       Class<?>[] classes = subject.getClass().getInterfaces();
       // 获得handler
       InvocationHandler handler = new MyInvocationHandler(subject);
       return newProxyInstance(loader, classes, handler);
   }
}
