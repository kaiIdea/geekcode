package main.java.behavior.Observer.case2;

import main.java.behavior.Observer.case1.PromotionService;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/6 17:58
 * @Description:
 */
public class ObserverRegistry {

    private ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> registry = new ConcurrentHashMap<>();

    public void registry(Object observer){
        Map<Class<?>, Collection<ObserverAction>> observerActions = findAllObserverActions(observer);
        for(Map.Entry<Class<?>, Collection<ObserverAction>> entry: observerActions.entrySet()){
            Class<?> eventType = entry.getKey();
            Collection<ObserverAction> eventActions = entry.getValue();
            CopyOnWriteArraySet<ObserverAction> registryEventActions = registry.get(eventType);
            if(null == registryEventActions){
                registry.putIfAbsent(eventType,new CopyOnWriteArraySet<>());
                registryEventActions = registry.get(eventType);
            }
            registryEventActions.addAll(eventActions);
        }
    }

    public List<ObserverAction> getMatchedObserverActions(Object event){
        List<ObserverAction> matchedObservers = new ArrayList<>();
        Class<?> postedEventType = event.getClass();
        for(Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : registry.entrySet()){
            Class<?> eventType = entry.getKey();
            Collection<ObserverAction> eventActions = entry.getValue();
            if(postedEventType.isAssignableFrom(eventType)){
                matchedObservers.addAll(eventActions);
            }
        }
        return matchedObservers;
    }

    private Map<Class<?>, Collection<ObserverAction>> findAllObserverActions(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> observerActions = new HashMap<>();
        Class<?> clazz = observer.getClass();
        for(Method method : getAnnotatedMethods(clazz)){
            Class<?>[] paramterTypes = method.getParameterTypes();
            Class<?> eventType = paramterTypes[0];
            if(!observerActions.containsKey(eventType)){
                observerActions.put(eventType,new ArrayList<>());
            }
            observerActions.get(eventType).add(new ObserverAction(observer,method));
        }
        return observerActions;
    }

    private List<Method> getAnnotatedMethods(Class<?> clazz) {
        List<Method> annotatedMethods = new ArrayList<>();
        for(Method method : clazz.getDeclaredMethods()){
            if(method.isAnnotationPresent(Subscribe.class)){
                Class<?>[] parameterTypes = method.getParameterTypes();
                annotatedMethods.add(method);
            }
        }
        return annotatedMethods;
    }

    public static void main(String[] args) {
        ObserverRegistry observerRegistry = new ObserverRegistry();
        PromotionService promotionService = new PromotionService();
        observerRegistry.registry(promotionService);

        observerRegistry.getMatchedObserverActions(promotionService);
    }
}
