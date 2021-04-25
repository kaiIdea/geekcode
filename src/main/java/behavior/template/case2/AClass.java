package main.java.behavior.template.case2;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/7 15:33
 * @Description:
 */
public class AClass {

    public static void main(String[] args) {
        BClass bClass = new BClass();
        bClass.process(new ICallback() {
            @Override
            public void methodToCallback() {
                System.out.println("Call back me...");
            }
        });
    }
}
