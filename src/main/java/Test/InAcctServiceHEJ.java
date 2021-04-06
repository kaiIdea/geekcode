package main.java.Test;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/6 16:15
 * @Description:
 */
public class InAcctServiceHEJ extends InAcctService{

    @Override
    public void replaceAssign(Request request) {
        if (request.getInAcctFund() && request.getInAcctUser()) {
            super.fundReplace();
            super.userReplace();
            return;
        }
        if (request.getInAcctFund()) {
            //inAcctFund == true 只资方入账，
            super.fundReplace();
            toFundCore();
            return;
        }
        if (request.getInAcctUser()) {
            //inAcctUser == true 只用户入账，
            super.userReplace();
            return;
        }
    }

    public void toFundCore(){
        System.out.println("通知核心成功...");
    }
}
