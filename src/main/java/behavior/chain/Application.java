package main.java.behavior.chain;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/18 11:43
 * @Description:
 */
public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
