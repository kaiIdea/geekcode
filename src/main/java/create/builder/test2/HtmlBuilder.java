package main.java.create.builder.test2;

import java.util.Arrays;

/**
 * @Auther: GEEX1428
 * @Date: 2021/9/16 16:16
 * @Description:
 */
public class HtmlBuilder extends Builder{
    @Override
    public void makeTitle(String title) {
        System.out.println("HtmlBuilder-makeTitle:"+title);
    }

    @Override
    public void makeString(String str) {
        System.out.println("HtmlBuilder-makeString:"+str);
    }

    @Override
    public void makeItems(String[] items) {
        System.out.println("HtmlBuilder-makeItems:"+ Arrays.stream(items));
    }

    @Override
    public void close() {
        System.out.println("HtmlBuilder-makeTitle:close()");
    }
}
