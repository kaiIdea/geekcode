package main.java.principle.ioc;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/12 10:27
 * @Description:
 */
public class JunitApplication {

    private static List<TestCase> testCases = new ArrayList<>();

    public static void register(TestCase testCase){
        testCases.add(testCase);
    }

    public static void main(String[] args) {
        JunitApplication.register(new UserServiceTest());
        for(TestCase testCase : testCases){
            testCase.run();
        }
    }
}
