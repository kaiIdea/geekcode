package main.java.structure.flyweight;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/2 11:19
 * @Description:
 */
public class Test1 {

//    public static void main(String[] args) {
//        String str1 = "what";
//        String str2 = "what";
//        String str3 = new String("what");
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//    }

    public static void main(String[] args) {
        String str1 = "what";
        String str2 = str1;
        str2 = "why";
        System.out.println(str1 == str2);
    }

}
