package main.java.behavior.Observer.case1;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/2 13:28
 * @Description:
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);
}
