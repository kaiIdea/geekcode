package main.java.principle.lsp;

import sun.misc.Request;
import sun.net.www.http.HttpClient;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/9 10:27
 * @Description:
 */
public class SecurityTransporter extends Transporter{

    private String appId;
    private String appToken;


    public SecurityTransporter(HttpClient httpClient, String appId, String appToken) {
        super(httpClient);
        this.appId = appId;
        this.appToken = appToken;
    }

    @Override
    public void sendRequest(Request request) {
        if(null != appId && null != appToken){

        }
        super.sendRequest(request);
    }
}
