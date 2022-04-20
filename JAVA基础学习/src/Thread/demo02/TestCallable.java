package Thread.demo02;

import Thread.demo01.TestThread02;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//线程创建方式三，实现callable接口
public class TestCallable implements Callable {

    private String url;
    private String name;

    public TestCallable(String url,String name){
        this.url=url;
        this.name=name;
    }
    public Boolean call(){
        WebDownloader webDownloader= new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载文件为:"+name);
        return true;
    }
    public static void main(String[] args) throws Exception,InterruptedException{
        TestCallable t1=new TestCallable("https://doge.zzzmh.cn/wallpaper/origin/ac20ee62882611ebb6edd017c2d2eca2.jpg/thumbs?auth_key=1652544000-487f7b22f68312d2c1bbc93b1aea445b-0-bce26b1506f0e9194a5b851e92ddfbe7","1.jpg");
        TestCallable t2=new TestCallable("https://doge.zzzmh.cn/wallpaper/origin/ac20ee62882611ebb6edd017c2d2eca2.jpg/thumbs?auth_key=1652544000-487f7b22f68312d2c1bbc93b1aea445b-0-bce26b1506f0e9194a5b851e92ddfbe7","2.jpg");
        TestCallable t3=new TestCallable("https://doge.zzzmh.cn/wallpaper/origin/ac20ee62882611ebb6edd017c2d2eca2.jpg/thumbs?auth_key=1652544000-487f7b22f68312d2c1bbc93b1aea445b-0-bce26b1506f0e9194a5b851e92ddfbe7","3.jpg");

        //创建执行服务
        ExecutorService ser= Executors.newFixedThreadPool(3);
        //提交执行
        Future<Boolean> result1=ser.submit(t1);
        Future<Boolean> result2=ser.submit(t2);
        Future<Boolean> result3=ser.submit(t3);
        //获取结果
        boolean rs1=result1.get();
        boolean rs2=result2.get();
        boolean rs3=result3.get();
        //关闭服务
        ser.shutdown();
    }

}
//下载器
class WebDownloader{
    //下载方法
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常,down方法出现问题");
        }
    }
}