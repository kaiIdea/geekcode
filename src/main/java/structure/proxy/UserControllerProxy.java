package main.java.structure.proxy;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/26 11:20
 * @Description:
 */
public class UserControllerProxy implements IUserController{

    private UserController userController;
    private MetricsCollector metricsCollector;


    public UserControllerProxy(UserController userController) {
        this.userController = userController;
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public UserVo login(String telPhone, String passWord) throws Exception {
        //获取开始请求时间
        long startTime = System.currentTimeMillis();
        //登陆获取用户信息
        UserVo userVo = userController.login(telPhone,passWord);
        //获取请求处理结束时间
        long responseTime = System.currentTimeMillis();
        //封装请求信息
        RequestInfo requestInfo = new RequestInfo("login",startTime,responseTime);
        //分发请求信息做记录
        metricsCollector.recordRequest(requestInfo);
        return null;
    }

    @Override
    public UserVo register(String telPhone, String passWord) {
        long startTime = System.currentTimeMillis();
        UserVo userVo = userController.register(telPhone,passWord);
        long responseTime = System.currentTimeMillis();
        RequestInfo requestInfo = new RequestInfo("register",startTime,responseTime);
        metricsCollector.recordRequest(requestInfo);
        return userVo;
    }

    public static void main(String[] args) {
        //原始类跟代理类实现相同的接口，是基于接口而非实现 编程
        IUserController controller = new UserControllerProxy(new UserController());
        controller.register("123456","987654");


        //如果原始类没有定义接口，或者原始类是第三方提供的，没有办法加接口。
        //这个时候，可以用继承，然后做代理(静态代理)

        //所谓动态代理，不事先为原始类提供代理类，而是在运行的时候，动态为原始类创建并提供代理，
        //然后在系统中替换掉原始类，这才是动态代理的真实意义。
    }
}
