package Tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//�ͻ���
public class TcpClientDemo01 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;

        try {
            //1.֪���������ĵ�ַ
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            //2.�˿ں�
            int port = 9999;
            //3.����һ��socket����
            socket = new Socket(serverIP, port);
            //3.������Ϣ IO��
            os = socket.getOutputStream();
            os.write("��ӭʹ�øó���".getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

                if (socket != null) {
                    try {
                    socket.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
            }
        }
    }
}