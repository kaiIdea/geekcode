package main.java.Test;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/6 16:06
 * @Description:
 */
public class Request {

    private Boolean inAcctFund  = true; //资金方是否入账,默认入账
    private Boolean inAcctUser = true; //用户是否入账,默认入账

    public Request(Boolean inAcctFund, Boolean inAcctUser) {
        this.inAcctFund = inAcctFund;
        this.inAcctUser = inAcctUser;
    }

    public Boolean getInAcctFund() {
        return inAcctFund;
    }

    public void setInAcctFund(Boolean inAcctFund) {
        this.inAcctFund = inAcctFund;
    }

    public Boolean getInAcctUser() {
        return inAcctUser;
    }

    public void setInAcctUser(Boolean inAcctUser) {
        this.inAcctUser = inAcctUser;
    }
}
