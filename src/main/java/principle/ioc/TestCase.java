package main.java.principle.ioc;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/12 10:24
 * @Description:
 */
public abstract class TestCase {


    public void run(){
        if(doTest()){
            System.out.println("Test success!");
        }else {
            System.out.println("Test fail!");
        }
    }
    public abstract boolean doTest();
}
