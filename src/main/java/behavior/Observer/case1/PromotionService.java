package main.java.behavior.Observer.case1;

import main.java.behavior.Observer.case2.Subscribe;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/2 17:18
 * @Description:
 */
public class PromotionService {

    @Subscribe
    void issueNewUserExperienceCash(Long userId){
        System.out.println("send cash...");
    }
}
