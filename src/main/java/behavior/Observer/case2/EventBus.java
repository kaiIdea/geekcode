package main.java.behavior.Observer.case2;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/6 18:27
 * @Description:
 */
public class EventBus {

    private Executor executor;

    private ObserverRegistry registry = new ObserverRegistry();

    public EventBus() {
    }

    public EventBus(Executor executor) {
        this.executor = executor;
    }

    public void registry(Object object){
        registry.registry(object);
    }

    public void post(Object event){
        List<ObserverAction> observerActions = registry.getMatchedObserverActions(event);
        for(ObserverAction observerAction : observerActions){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    observerAction.excute(event);
                }
            });
        }
    }

}
