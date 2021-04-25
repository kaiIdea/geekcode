package main.java.behavior.template.case1;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/7 14:51
 * @Description:
 */
public abstract class AbstractClass {

    public void templateMethod(){
        this.method1();
        this.method2();
    }
    protected abstract void method1();
    protected abstract void method2();

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass1();
        abstractClass.templateMethod();
    }
}
