package chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.nio.Buffer;

public class UdpSenderDemo01 {
    public static void main(String[] args)throws Exception{
        DatagramSocket socket=new DatagramSocket(12303);
        //准备数据:控制台读取System.in
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String data=reader.readLine();
            byte[] datas=data.getBytes();
            DatagramPacket packet=new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",12333));

            socket.send(packet);
            if(data.equals("bye")){
                break;
            }
        }

        socket.close();
    }
}
