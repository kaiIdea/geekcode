package main.java.principle.ocp;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/8 10:25
 * @Description:
 */
public class Alert {

   private List<AlertHandler> list = new ArrayList<>();

   public void addAlertHandler(AlertHandler handler){
       this.list.add(handler);
   }

   public void check(ApiStatInfo apiStatInfo){
       for(AlertHandler handler : list){
           handler.check(apiStatInfo);
       }
   }
}
