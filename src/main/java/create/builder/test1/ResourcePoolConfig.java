package main.java.create.builder.test1;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/25 11:11
 * @Description:
 */
public class ResourcePoolConfig {

    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;
    private ResourcePoolConfigBuilder builder;


    public ResourcePoolConfig(String name, int maxTotal, int maxIdle, int minIdle) throws Exception {
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

    public ResourcePoolConfig(ResourcePoolConfigBuilder builder) {
        this.builder = builder;
        this.name = builder.getName();
        this.maxTotal = builder.getMaxTotal();
        this.maxIdle = builder.getMaxIdle();
        this.minIdle = builder.getMinIdle();
    }

    public static void main(String[] args) throws Exception {
        //ResourcePoolConfig config = new ResourcePoolConfig("test",0,0,0);
        
    }
}
