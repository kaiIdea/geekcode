package main.java.behavior.chain;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/18 11:40
 * @Description:
 */
public class HandlerChain {

    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler){
        handler.setSuccessor(null);
        if(null == head){
            head = handler;
            tail = handler;
            return;
        }

        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle(){
        if(head != null){
            head.handle();
        }
    }


}
