package InternetStudy;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class internet02 {
    public static void main(String[] args){
        InetAddress inetAddress= null;
        try {
            inetAddress = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress);
            //查询本机地址
            InetAddress inetAddress3 = InetAddress.getByName("localhost");
            System.out.println(inetAddress3);
            //查询网站ip地址
            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);
            //常用方法
            System.out.println(inetAddress2.getCanonicalHostName());//规范的名字
            System.out.println(inetAddress2.getAddress());//ip
            System.out.println(inetAddress2.getHostAddress());
            System.out.println(inetAddress2.getHostName());//域名，或者自己电脑的名字

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
