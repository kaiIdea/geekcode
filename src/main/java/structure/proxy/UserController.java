package main.java.structure.proxy;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/26 11:16
 * @Description:
 */
public class UserController implements IUserController{

    @Override
    public UserVo login(String telPhone, String passWord) throws Exception {
        if(!UserVo.isVerificationUser(telPhone, passWord)){
            throw new Exception("信息验证失败！");
        }
        return new UserVo(telPhone, passWord);
    }

    @Override
    public UserVo register(String telPhone, String passWord) {
        return new UserVo(telPhone, passWord);
    }
}
