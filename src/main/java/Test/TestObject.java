package main.java.Test;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/20 19:42
 * @Description:
 */
public class TestObject {


    public static int numberOfLeadingZeros(int i) {
        // HD, Figure 5-6
        if (i == 0)
            return 32;
        int n = 1;
        if (i >>> 16 == 0) { n += 16; i <<= 16; }
        if (i >>> 24 == 0) { n +=  8; i <<=  8; }
        if (i >>> 28 == 0) { n +=  4; i <<=  4; }
        if (i >>> 30 == 0) { n +=  2; i <<=  2; }
        n -= i >>> 31;
        return n;
    }


    public static void main(String[] args) {
        int i = 2;

        //;
        System.out.println(numberOfLeadingZeros(i));

        //System.out.println(i <<= 16);
    }
}