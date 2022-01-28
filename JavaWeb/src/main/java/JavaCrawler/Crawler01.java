package JavaCrawler;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Crawler01 {
    public static void main(String[] args) throws Exception {
        //打开游览器,创建一个httpclient对象
        CloseableHttpClient httpClient= HttpClients.createDefault();
        //输入网址,发起get请求,创建HttpGet对象
        HttpGet httpGet=new HttpGet("http://www.itcast.cn");
        //按回车，发起请求,使用HttpClient对象发起请求
        CloseableHttpResponse response = httpClient.execute(httpGet);
        //解析响应，获取数据
        //判断状态码是否为200
        if(response.getStatusLine().getStatusCode()==200){
            HttpEntity httpEntity = response.getEntity();
            String content=EntityUtils.toString(httpEntity,"utf-8");
            System.out.println(content);
        }
    }
}
