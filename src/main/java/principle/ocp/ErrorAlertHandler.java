package main.java.principle.ocp;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/8 11:25
 * @Description:
 */
public class ErrorAlertHandler extends AlertHandler{
    public ErrorAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if(apiStatInfo.getErrorCount() > alertRule.getMaxErrorCount()){
            notification.notify(NotificationEmergencyLevel.SEVERE,"...");
        }
    }
}
