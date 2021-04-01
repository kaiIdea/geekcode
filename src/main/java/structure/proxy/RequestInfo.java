package main.java.structure.proxy;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/26 11:24
 * @Description:
 */
public class RequestInfo {


    private String methodName;

    private long startTime;

    private long responseTime;

    public RequestInfo(String methodName, long startTime, long responseTime) {
        this.methodName = methodName;
        this.startTime = startTime;
        this.responseTime = responseTime;
    }

    @Override
    public String toString() {
        return "RequestInfo{" +
                "methodName='" + methodName + '\'' +
                ", startTime=" + startTime +
                ", responseTime=" + responseTime +
                '}';
    }
}
