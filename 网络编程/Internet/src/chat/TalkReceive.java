package chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceive implements Runnable{
    DatagramSocket socket=null;
    private int port;
    private String msgFrom;

    public TalkReceive(int port,String msgFrom) {
        this.port = port;
        this.msgFrom=msgFrom;
        try {
            socket=new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run(){

                //准备接收包裹
                while(true){

                    try {
                        byte[] container=new byte[1024];

                        DatagramPacket packet=new DatagramPacket(container,0,container.length);
                        socket.receive(packet);
                        //断开连接 bye
                        byte[] data=packet.getData();
                        String receiveData=new String(data,0,packet.getLength());
                        System.out.println(msgFrom+":"+receiveData);
                        if(receiveData.equals("bye")){
                            break;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                socket.close();
            }
}
