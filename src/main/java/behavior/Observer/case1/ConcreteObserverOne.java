package main.java.behavior.Observer.case1;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/2 13:31
 * @Description:
 */
public class ConcreteObserverOne implements Observer{


    @Override
    public void update(Message message) {
        System.out.println(this.getClass().getName()+"....");
    }
}
