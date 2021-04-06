package main.java.behavior.Observer.case1;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/2 17:30
 * @Description:
 */
public class RegPromotionObserver implements RegObserver{

    private PromotionService promotionService = new PromotionService();

    @Override
    public void handRegSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
