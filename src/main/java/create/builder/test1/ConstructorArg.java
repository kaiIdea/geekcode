package main.java.create.builder.test1;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/25 15:34
 * @Description:
 */
public class ConstructorArg {
    //当 isRef 为 true 的时候，arg 表示 String 类型的 refBeanId，type 不需要设置；
    //当 isRef 为 false 的时候，arg、type 都需要设置。
    private boolean isRef;

    private Class type;

    private Object arg;

    public ConstructorArg(ConstructorArgBuilder builder) {
        this.arg = builder.getArg();
        this.isRef = builder.isRef();
        this.type = builder.getType();
    }

    @Override
    public String toString() {
        return "ConstructorArg{" +
                "isRef=" + isRef +
                ", type=" + type +
                ", arg=" + arg +
                '}';
    }

    public static void main(String[] args) throws Exception {
        ConstructorArgBuilder builder = new ConstructorArgBuilder(false,new Integer(222));
        System.out.println(new ConstructorArg(builder));
    }
}
