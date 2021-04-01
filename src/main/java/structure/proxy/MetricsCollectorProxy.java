package main.java.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/30 17:19
 * @Description:
 */
public class MetricsCollectorProxy {


    private MetricsCollector metricsCollector;

    public MetricsCollectorProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    public Object createProxy(Object proxiedObject){
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(),interfaces,dynamicProxyHandler);
    }

    public class DynamicProxyHandler implements InvocationHandler {

        private Object proxiedObject;
        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTime = System.currentTimeMillis();
            Object result = method.invoke(proxiedObject,args);
            String apiName = proxiedObject.getClass().getName()+"-"+method.getName();
            //获取请求处理结束时间
            long responseTime = System.currentTimeMillis();
            RequestInfo requestInfo = new RequestInfo(apiName,startTime,responseTime);
            metricsCollector.recordRequest(requestInfo);
            return result;
        }
    }

    public static void main(String[] args) {

    }
}
