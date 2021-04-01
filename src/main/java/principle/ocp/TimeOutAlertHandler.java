package main.java.principle.ocp;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/8 14:37
 * @Description:
 */
public class TimeOutAlertHandler extends AlertHandler{
    public TimeOutAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if(apiStatInfo.getTimeOut() > alertRule.getTimeOut()){
            notification.notify(NotificationEmergencyLevel.SEVERE,"....");
        }
    }
}
