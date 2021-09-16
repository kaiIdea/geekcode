package main.java.create.singleton;

/**
 * @Auther: GEEX1428
 * @Date: 2021/9/15 17:33
 * @Description:
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    public int value = 22;

    public Singleton() {
        System.out.println("生成了一个实例...");
    }


    public static Singleton getInstance(){
        return singleton;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "value=" + value +
                '}';
    }
}
