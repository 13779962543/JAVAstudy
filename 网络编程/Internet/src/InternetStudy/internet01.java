package InternetStudy;

import java.net.InetAddress;
public class internet01 {
    public static void main(String[] args)throws Exception{
        //��ȡ��������InetAddress����
        InetAddress localAddress=InetAddress.getLocalHost();
        //��ȡ������Ϊwww.itcast.cn��InetAddress����
        InetAddress remoteAddress=
                InetAddress.getByName("www.itcast.cn");
        System.out.println("���ص�IP��ַ��"+localAddress.getHostAddress());
        System.out.println("itcast��ip��ַ��"+remoteAddress.getHostAddress());
        System.out.println("3�����Ƿ���Է���:"+remoteAddress.isReachable(3000));
        System.out.println("itcast��������Ϊ:"+remoteAddress.getHostName());
    }
}
