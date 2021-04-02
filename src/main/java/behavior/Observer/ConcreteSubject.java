package main.java.behavior.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/2 13:29
 * @Description:
 */
public class ConcreteSubject implements Subject{

    private List<Observer> list = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for(Observer o : list){
            o.update(message);
        }
    }
}
