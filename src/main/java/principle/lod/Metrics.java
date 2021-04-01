package main.java.principle.lod;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/16 16:50
 * @Description:
 */
public class Metrics {

    //接口响应时间 集合
    private static Map<String,Double> responseTimes = new HashMap<>();

    public void recordResponseTime(String api,Double responseTime){
        responseTimes.putIfAbsent(api,responseTime);
    }


    public static void main(String[] args) {

        responseTimes.putIfAbsent("111",2D);

        responseTimes.putIfAbsent("222",2D);
        System.out.println();

    }

}
