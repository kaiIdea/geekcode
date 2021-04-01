package main.java.principle.ocp;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/8 11:17
 * @Description:
 */
public class TpsAlertHandler extends AlertHandler{


    public TpsAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount()/ apiStatInfo.getDurationOfSeconds();
        if(tps > alertRule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()){
            notification.notify(NotificationEmergencyLevel.URGENCY,"...");
        }
    }
}
