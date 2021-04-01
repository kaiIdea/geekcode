package main.java.principle.ocp;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/8 14:24
 * @Description:
 */
public class Demo {


    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        ApplicationContext.getContext().getAlert().check(apiStatInfo);

        apiStatInfo.setTimeOut(254);
        ApplicationContext.getContext().getAlert().check(apiStatInfo);
    }
}
