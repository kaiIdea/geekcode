package main.java.structure.proxy;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/26 11:14
 * @Description:
 */
public interface IUserController {


    UserVo login(String telPhone,String passWord) throws Exception;

    UserVo register(String telPhone,String passWord);
}
