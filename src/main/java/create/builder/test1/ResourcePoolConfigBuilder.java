package main.java.create.builder.test1;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/25 11:30
 * @Description:
 */
public class ResourcePoolConfigBuilder {

    //maxTotal、maxIdle、minIdle 不是必填变量,name为必填项
    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;

    private String name;
    private int maxTotal = DEFAULT_MAX_TOTAL;
    private int maxIdle = DEFAULT_MAX_IDLE;
    private int minIdle = DEFAULT_MIN_IDLE;


    public ResourcePoolConfigBuilder(String name, int maxTotal, int maxIdle, int minIdle) throws Exception {
        if(null == name){
            throw new Exception("the name is not be null");
        }
        this.name = name;
        if(maxTotal > 0){
            this.maxTotal = maxTotal;
        }
        if(maxTotal > 0){
            this.maxTotal = maxTotal;
        }
        if(maxIdle > 0){
            this.maxIdle = maxIdle;
        }
        if(minIdle > 0){
            this.minIdle = minIdle;
        }
    }

    public String getName() {
        return name;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public int getMinIdle() {
        return minIdle;
    }
}
