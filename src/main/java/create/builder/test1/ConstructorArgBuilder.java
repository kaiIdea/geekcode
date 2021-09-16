package main.java.create.builder.test1;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/25 15:36
 * @Description:
 */
public class ConstructorArgBuilder {

    //当 isRef 为 true 的时候，arg 表示 String 类型的 refBeanId，type 不需要设置；
    //当 isRef 为 false 的时候，arg、type 都需要设置。
    private boolean isRef;

    private Class type;

    private Object arg;


    public ConstructorArgBuilder(Boolean isRef, Object arg) throws Exception {
        if(null == isRef){
            throw new Exception("the isRef not be null");
        }
        this.isRef = isRef;
        if(isRef == true && !(arg instanceof String)){
            throw new Exception("arg class is String");
        }
        this.arg = arg;
        if(!isRef){
            this.type = this.arg.getClass();
        }
    }

    public boolean isRef() {
        return isRef;
    }

    public Class getType() {
        return type;
    }

    public Object getArg() {
        return arg;
    }
}
