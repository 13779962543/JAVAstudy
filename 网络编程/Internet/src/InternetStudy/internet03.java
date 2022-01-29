package InternetStudy;

import java.net.InetSocketAddress;

public class internet03 {
    public static void main(String[] args){
        InetSocketAddress socketAddress=new InetSocketAddress("127.0.01",8080);
        InetSocketAddress socketAddress2=new InetSocketAddress("localhost",8080);
        System.out.println(socketAddress);
        System.out.println(socketAddress2);

        System.out.println(socketAddress2.getAddress());
        System.out.println(socketAddress2.getHostName());//
        System.out.println(socketAddress2.getPort());//

    }
}
