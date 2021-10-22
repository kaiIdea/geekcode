package main.java.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/22 18:26
 * @Description:
 */
public class SubjectDynamicProxy{

    public static <T>T newProxyInstance(ClassLoader loader,
                                           Class<?>[] interfaces,
                                           InvocationHandler h){
        return (T) Proxy.newProxyInstance(loader,interfaces,h);
    }
}
