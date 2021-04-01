package main.java.principle.ioc;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/12 10:50
 * @Description:
 */
public class MessageSender1 {
    private String phone,context;

    public MessageSender1(String phone, String context) {
        this.phone = phone;
        this.context = context;
    }

    public void send(){
        System.out.println(this.phone+"message send..."+this.context);
    }
}
