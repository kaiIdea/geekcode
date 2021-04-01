package main.java.principle.ocp;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/8 10:28
 * @Description:
 */
public enum NotificationEmergencyLevel {



    SEVERE("SEVERE","严重"),
    URGENCY("URGENCY","紧急"),
    NORMAL("NORMAL","普通"),
    TRIVIAL("TRIVIAL","无关紧要");

    private String code;

    private String desc;

    NotificationEmergencyLevel(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
