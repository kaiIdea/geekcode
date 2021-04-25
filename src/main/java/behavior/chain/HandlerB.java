package main.java.behavior.chain;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/18 11:39
 * @Description:
 */
public class HandlerB extends Handler{

    @Override
    public boolean doHandle() {
        boolean handled = false;
        System.out.println(this.getClass().getName()+"执行完成...");
        return handled;
    }
}
