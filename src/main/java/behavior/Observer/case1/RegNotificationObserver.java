package main.java.behavior.Observer.case1;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/2 17:31
 * @Description:
 */
public class RegNotificationObserver implements RegObserver{

    private NotificationServer notificationServer = new NotificationServer();

    @Override
    public void handRegSuccess(Long userId) {
        notificationServer.toMessage(userId);
    }
}
