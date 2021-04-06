package main.java.behavior.Observer.case2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/6 17:48
 * @Description:
 */
public class ObserverAction {

    private Object target;

    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }

    /**
     * 调用观察者类的方法，
     * @param event 方法的参数
     */
    public void excute(Object event){
        try {
            method.invoke(target,event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
