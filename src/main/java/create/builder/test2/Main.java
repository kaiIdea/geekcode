package main.java.create.builder.test2;

/**
 * @Auther: GEEX1428
 * @Date: 2021/9/16 16:17
 * @Description:
 */
public class Main {

    public static void main(String[] args) {

        Builder builder = new TextBuilder();
        Director director = new Director(builder);
        director.construct();
    }
}
