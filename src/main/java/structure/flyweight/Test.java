package main.java.structure.flyweight;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/2 10:33
 * @Description:
 */
public class Test {

    static Integer cache[];



//    public static void main(String[] args) {
//        Integer i1 = 56;
//        Integer i2 = 56;
//        Integer i3 = 129;
//        Integer i4 = 129;
//
//        System.out.println(i1==i2);
//        System.out.println(i3==i4);
//    }

    public static void main(String[] args) {
        int high = 127;
        int low = -128;
        cache = new Integer[(high - low) + 1];
        int j = low;
        for(int k = 0; k < cache.length; k++)
            cache[k] = new Integer(j++);

        System.out.println(cache.length);
    }
}
