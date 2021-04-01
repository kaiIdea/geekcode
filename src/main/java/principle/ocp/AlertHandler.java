package main.java.principle.ocp;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/8 11:15
 * @Description:
 */
public abstract class AlertHandler {

    protected AlertRule alertRule;

    protected Notification notification;

    public AlertHandler(AlertRule alertRule, Notification notification) {
        this.alertRule = alertRule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
