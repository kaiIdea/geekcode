package main.java.behavior.Observer.case1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/2 17:16
 * @Description:
 */
public class UserController {

    private UserService userService = new UserService();

    private List<RegObserver> list = new ArrayList<>();

    public void setObserver(RegObserver regObserver){
        this.list.add(regObserver);
    }

    public Long register(String userName,String passWord){
        Long userId = userService.register(userName, passWord);
        for (RegObserver regObserver : list){
            regObserver.handRegSuccess(userId);
        }
        return userId;
    }

//    private PromotionService promotionService = new PromotionService();
//
//    public Long register(String userName,String passWord){
//        Long userId = userService.register(userName, passWord);
//        promotionService.issueNewUserExperienceCash(userId);
//        return userId;
//    }
//
//    public static void main(String[] args) {
//        UserController controller = new UserController();
//        controller.register("polo","pass.");
//    }

    public static void main(String[] args) {
        UserController controller = new UserController();
        controller.setObserver(new RegNotificationObserver());
        controller.setObserver(new RegPromotionObserver());
        controller.register("polo","pass.");
    }

}
