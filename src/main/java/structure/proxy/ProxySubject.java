package main.java.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/22 18:15
 * @Description:
 */
public class ProxySubject implements InvocationHandler {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(subject,args);
    }
}
