package InternetStudy;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class internet02 {
    public static void main(String[] args){
        InetAddress inetAddress= null;
        try {
            inetAddress = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress);
            //��ѯ������ַ
            InetAddress inetAddress3 = InetAddress.getByName("localhost");
            System.out.println(inetAddress3);
            //��ѯ��վip��ַ
            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);
            //���÷���
            System.out.println(inetAddress2.getCanonicalHostName());//�淶������
            System.out.println(inetAddress2.getAddress());//ip
            System.out.println(inetAddress2.getHostAddress());
            System.out.println(inetAddress2.getHostName());//�����������Լ����Ե�����

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
