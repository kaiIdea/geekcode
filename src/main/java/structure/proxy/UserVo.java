package main.java.structure.proxy;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/26 11:15
 * @Description:
 */
public class UserVo {


    private String telPhone;

    private String passWord;

    public UserVo(String telPhone, String passWord) {
        this.telPhone = telPhone;
        this.passWord = passWord;
    }


    public static boolean isVerificationUser(String telPhone, String passWord){
        return true;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "telPhone='" + telPhone + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
