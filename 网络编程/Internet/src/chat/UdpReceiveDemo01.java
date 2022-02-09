package chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveDemo01 {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket=new DatagramSocket(6666);

        //准备接收包裹
        while(true){

            byte[] container=new byte[1024];

            DatagramPacket packet=new DatagramPacket(container,0,container.length);
            //断开连接 bye
            byte[] data=packet.getData();
            String receiveData=new String(data,0,data.length);
            System.out.println(receiveData);
            if(receiveData.equals("bye")){
                break;
            }

             }
        socket.close();
    }

}
