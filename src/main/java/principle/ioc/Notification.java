package main.java.principle.ioc;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/12 10:50
 * @Description:
 */
public class Notification {

    private MessageSender messageSender;

    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void send(){
        this.messageSender.send();
    }

    public static void main(String[] args) {
        MessageSender messageSender = new SmsSender();
        Notification notification = new Notification(messageSender);
        notification.send();
    }
}
