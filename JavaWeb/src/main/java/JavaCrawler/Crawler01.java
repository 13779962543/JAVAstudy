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
        //��������,����һ��httpclient����
        CloseableHttpClient httpClient= HttpClients.createDefault();
        //������ַ,����get����,����HttpGet����
        HttpGet httpGet=new HttpGet("http://www.itcast.cn");
        //���س�����������,ʹ��HttpClient����������
        CloseableHttpResponse response = httpClient.execute(httpGet);
        //������Ӧ����ȡ����
        //�ж�״̬���Ƿ�Ϊ200
        if(response.getStatusLine().getStatusCode()==200){
            HttpEntity httpEntity = response.getEntity();
            String content=EntityUtils.toString(httpEntity,"utf-8");
            System.out.println(content);
        }
    }
}
