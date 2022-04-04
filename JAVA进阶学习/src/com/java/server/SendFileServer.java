//@Time : 2022-03-16 21:11
//@Author : Levitan
//@File : DaytimeServer.java
//@SoftWare : IntelliJ IDEA

package com.java.server;

import com.java.ServerStreamSocket;

import java.io.*;
import java.net.ServerSocket;

public class SendFileServer {
    public static void main(String[] args) {
        int serverPort = 32114;
        try{
            ServerSocket myConnectionSocket = new ServerSocket(serverPort);
            while (true){
                System.out.println("等待连接");
                ServerStreamSocket myDataSocket = new ServerStreamSocket(myConnectionSocket.accept());
                System.out.println("与客户端建立一个连接");
                sendFile(myDataSocket.getOutput());
                System.out.println("文件发送完毕");
                System.out.println("=============================");
                myDataSocket.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void sendFile(BufferedOutputStream out) throws IOException {
        String filePath = "D:\\JAVA实验\\JAVA进阶学习\\src\\ATM\\ATMSystem.java";
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(filePath));
        byte[] buff = new byte[1024];
        int len = 0;
        while((len=in.read(buff))!=-1){
            out.write(buff, 0, len);
            out.flush();
        }
    }
}
