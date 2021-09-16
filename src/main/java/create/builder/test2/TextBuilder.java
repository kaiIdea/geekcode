package main.java.create.builder.test2;

/**
 * @Auther: GEEX1428
 * @Date: 2021/9/16 16:14
 * @Description:
 */
public class TextBuilder extends Builder{


    @Override
    public void makeTitle(String title) {
        System.out.println("TextBuilder-makeTitle:"+title);
    }

    @Override
    public void makeString(String str) {
        System.out.println("TextBuilder-makeString:"+str);
    }

    @Override
    public void makeItems(String[] items) {
        System.out.println("TextBuilder-makeItems:"+items);
    }

    @Override
    public void close() {
        System.out.println("TextBuilder-makeTitle:close()");
    }
}
