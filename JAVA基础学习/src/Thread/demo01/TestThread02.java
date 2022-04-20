package Thread.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//练习Thread，文件多线程同步下载
public class TestThread02 extends Thread{

    private String url;
    private String name;

    public TestThread02(String url,String name){
        this.url=url;
        this.name=name;
    }
    public void run(){
        WebDownloader webDownloader=new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载文件为:"+name);
    }
    public static void main(String[] args){
        TestThread02 t1=new TestThread02("http://kr.shanghai-jiuxin.com/file/mm/20211129/1nwpzivfgmc.jpg","1.jpg");
        TestThread02 t2=new TestThread02("http://kr.shanghai-jiuxin.com/file/mm/20211129/1nwpzivfgmc.jpg","2.jpg");
        TestThread02 t3=new TestThread02("http://kr.shanghai-jiuxin.com/file/mm/20211129/1nwpzivfgmc.jpg","3.jpg");

        t1.start();
        t2.start();
        t3.start();
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
