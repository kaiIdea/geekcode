package main.java.behavior.Observer.case1;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/2 13:34
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers(new Message());
    }
}
