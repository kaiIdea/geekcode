package main.java.behavior.Observer;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/2 13:32
 * @Description:
 */
public class ConcreteObserverTwo implements Observer{


    @Override
    public void update(Message message) {
        System.out.println(this.getClass().getName()+"...");
    }
}
