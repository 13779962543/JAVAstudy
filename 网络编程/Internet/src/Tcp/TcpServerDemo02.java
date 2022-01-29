package Tcp;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class TcpServerDemo02 {
    public static void main(String[] args) throws Exception {
        //1.创建服务器
        ServerSocket serverSocket=new ServerSocket(9000);
        //2.监听客户端的连接
        Socket socket=serverSocket.accept();
        //3.获取输入流
        InputStream is=socket.getInputStream();
        //4.文件输出
        FileOutputStream fos= new FileOutputStream("receive.jpg");
        byte[] buffer= new byte[1024];
        int len;
        while((len=is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }

        //通知客户端我接受完毕了
        OutputStream os=socket.getOutputStream();
        os.write("It is ok".getBytes());
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
