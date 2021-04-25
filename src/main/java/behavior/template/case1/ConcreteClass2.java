package main.java.behavior.template.case1;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/7 14:55
 * @Description:
 */
public class ConcreteClass2 extends AbstractClass{
    @Override
    protected void method1() {
        System.out.println(String.format("[%s] method1 execute...",this.getClass().getName()));
    }

    @Override
    protected void method2() {
        System.out.println(String.format("[%s] method2 execute...",this.getClass().getName()));
    }
}
