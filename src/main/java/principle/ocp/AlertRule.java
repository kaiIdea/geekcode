package main.java.principle.ocp;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/8 10:24
 * @Description: 存储警告规则
 */
public class AlertRule {


    private Integer maxTps;

    private Integer maxErrorCount;

    private Integer timeOut;

    public AlertRule getMatchedRule(String api){
        return new AlertRule();
    }

    public Integer getMaxTps() {
        return maxTps;
    }

    public void setMaxTps(Integer maxTps) {
        this.maxTps = maxTps;
    }

    public Integer getMaxErrorCount() {
        return maxErrorCount;
    }

    public void setMaxErrorCount(Integer maxErrorCount) {
        this.maxErrorCount = maxErrorCount;
    }

    public Integer getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }
}
