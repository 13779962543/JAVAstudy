package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClientDemo1 {
    public static void main(String[] args) throws Exception{
        //建立sockcet连接
        DatagramSocket socket=new DatagramSocket();
        //建个包
        String msg="你好啊，服务器";
        //发送给谁
        InetAddress localhost=InetAddress.getByName("localhost");
        int port=9090;
        //数据，数据的长度起始，要发给谁
        DatagramPacket packet=new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,localhost,port);
        //发送包
        socket.send(packet);
        //关闭流
        socket.close();

    }
}
