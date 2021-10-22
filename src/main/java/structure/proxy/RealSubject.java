package main.java.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/22 18:14
 * @Description:
 */
public class RealSubject implements Subject{

    @Override
    public void doSomething(String str) {
        System.out.println("真实主题...");
    }


    public static void main(String[] args) throws Throwable {
        Subject subject = new RealSubject();
        InvocationHandler handler = new ProxySubject(subject);
        Subject proxySubject = SubjectDynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(),handler);
        proxySubject.doSomething("1111");
    }
}
