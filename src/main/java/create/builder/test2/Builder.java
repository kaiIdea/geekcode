package main.java.create.builder.test2;

/**
 * @Auther: GEEX1428
 * @Date: 2021/9/16 15:56
 * @Description:
 */
public abstract class Builder {

    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
