package main.java.principle.lod;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/15 13:29
 * @Description: 通过url 获取网页数据
 */
public class HtmlDownloader {

    private NetworkTransporter transporter;

    public Html downloadHtml(String url){
        Byte[] rawHtml = transporter.send(new HtmlRequest(url));
        return new Html(rawHtml);
    }
}
