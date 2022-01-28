package Tcp;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo02 {
    public static void main(String[] args) throws Exception {
        //1.����һ��socket����
         Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),9000);
         //2.����һ�������
        OutputStream os=socket.getOutputStream();
        //3.��ȡ�ļ�
        FileInputStream fis= new FileInputStream("D:\\JAVAʵ��\\������\\Internet\\src\\Tcp\\123.jpg");
        //4.д���ļ�
        byte[] buffer=new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        //֪ͨ�������Ѿ�����
        socket.shutdownOutput();//���Ѿ���������

        //ȷ��������������ϣ����ܶϿ�����
        InputStream inputStream=socket.getInputStream();
        //String byte[]
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        byte[] buffer2=new byte[1024];
        int len2;
        while((len2=inputStream.read(buffer2))!=-1){
            baos.write(buffer2,0,len2);
        }

        System.out.println(baos.toString());

        //2.�ر���Դ
        baos.close();
        inputStream.close();
        fis.close();
        os.close();
        socket.close();
    }
}
