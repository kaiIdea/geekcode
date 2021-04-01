package main.java.principle.ioc;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/12 10:57
 * @Description:
 */
public class SmsSender implements MessageSender{

    @Override
    public void send() {
        System.out.println("sms message send...");
    }
}
