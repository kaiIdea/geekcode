package main.java.Test;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/6 16:07
 * @Description:
 */
public abstract class InAcctService {

    public abstract void replaceAssign(Request request);

    public void fundReplace(){
        System.out.println("资方入账");
    }
    public void userReplace(){
        System.out.println("用户入账");
    }

    public static void main(String[] args) {
        InAcctService service = new InAcctServiceHEJ();
        service.replaceAssign(new Request(true,false));
    }
}
