package main.java.behavior.chain;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/18 11:36
 * @Description:
 */
public abstract class Handler {


    protected Handler successor = null;


    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle(){
        boolean flag = doHandle();
        if(successor != null && !flag){
            successor.handle();
        }
    }

    public abstract boolean doHandle();
}
