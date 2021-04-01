package main.java.principle.lsp;

import sun.misc.Request;
import sun.net.www.http.HttpClient;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/9 10:25
 * @Description:
 */
public class Transporter {

    private HttpClient httpClient;

    public Transporter(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void sendRequest(Request request){
        System.out.println("........");
    }
}
