package JavaCrawler;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpGetTest {
    public static void main(String[] args){
        //����httpclient����
        CloseableHttpClient httpClient= HttpClients.createDefault();
        //����httpget����,����url���ʵ�ַ
        HttpGet httpGet=new HttpGet("http://www.itcast.cn");
        CloseableHttpResponse response=null;
        try {
            //ʹ��HttpClient�������󣬻�ȡresponse
             response=httpClient.execute(httpGet);

            //������Ӧ
            if(response.getStatusLine().getStatusCode()==200){
                String content=EntityUtils.toString(response.getEntity(),"utf-8");
                System.out.println(content.length());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally{

            //�ر�response
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
