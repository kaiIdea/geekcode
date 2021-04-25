package main.java.behavior.template.case1;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/7 14:53
 * @Description:
 */
public class ConcreteClass1 extends AbstractClass{

    @Override
    protected void method1() {
        System.out.println(String.format("[%s] method1 execute...",this.getClass().getName()));
    }

    @Override
    protected void method2() {
        System.out.println(String.format("[%s] method2 execute...",this.getClass().getName()));
    }

    @Override
    public void templateMethod() {
        System.out.println("overRide after....");
        super.templateMethod();

    }
}
