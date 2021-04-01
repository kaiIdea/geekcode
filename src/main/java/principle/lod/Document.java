package main.java.principle.lod;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/15 13:28
 * @Description: 网页文档，后续的网页内容，分词，索引都是以此为处理对象
 */
public class Document {

    private Html html;

    private String url;


    public Document(String url) {
        this.url = url;
        HtmlDownloader htmlDownloader = new HtmlDownloader();
        this.html = htmlDownloader.downloadHtml(url);
    }
}
