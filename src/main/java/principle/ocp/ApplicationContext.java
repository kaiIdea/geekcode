package main.java.principle.ocp;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/8 11:31
 * @Description:
 */
public class ApplicationContext {

    private static ApplicationContext context = new ApplicationContext();

    private AlertRule alertRule;

    private Notification notification;

    private Alert alert;

    public ApplicationContext() {
        initialize();
    }

    public static ApplicationContext getContext(){
        return context;
    }

    private void initialize(){
        alertRule = new AlertRule();
        notification = new Notification();
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(alertRule,notification));
        alert.addAlertHandler(new ErrorAlertHandler(alertRule,notification));
        alert.addAlertHandler(new TimeOutAlertHandler(alertRule,notification));
    }

    public Alert getAlert(){
        return alert;
    }





}
