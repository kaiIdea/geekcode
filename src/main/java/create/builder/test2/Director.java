package main.java.create.builder.test2;

/**
 * @Auther: GEEX1428
 * @Date: 2021/9/16 16:09
 * @Description:
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("建造");
        builder.makeItems(new String[]{"11","22","33"});
        builder.makeString("结束");
        builder.close();
    }
}
