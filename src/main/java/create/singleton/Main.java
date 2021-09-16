package main.java.create.singleton;

/**
 * @Auther: GEEX1428
 * @Date: 2021/9/15 17:36
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.value = 66;
        System.out.println(s1);

        Singleton s2 = Singleton.getInstance();
        s2.value = 88;
        System.out.println(s2);
    }
}
