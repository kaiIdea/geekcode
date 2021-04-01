package main.java.principle.ioc;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/12 10:23
 * @Description:
 */
public class UserServiceTest extends TestCase {

    @Override
    public boolean doTest() {
        return false;
    }

    public static void main(String[] args) {
        //JunitApplication.register(new UserServiceTest());
        UserServiceTest test = new UserServiceTest();
        System.out.println(test.test());
    }

    public Integer test(){
        Integer count = 1;
        count = test1(count);
        System.out.println(count);
        return count;
    }

    public Integer test1(Integer count){
        count = 99999;
        return count;
    }
}
