//@Time : 2022-03-16 20:56
//@Author : Levitan
//@File : DaytimeClientHelper.java
//@SoftWare : IntelliJ IDEA

package com.java.customer;

import com.java.ServerStreamSocket;

import java.io.*;
import java.net.InetAddress;

public class SendFileClientHelper {
    public static void getFile(String hostName, String portNum) throws IOException {
        InetAddress serverHost = InetAddress.getByName(hostName);
        int serverPort = Integer.parseInt(portNum);
        System.out.println("已发出请求");
        ServerStreamSocket mySocket = new ServerStreamSocket(serverHost, serverPort);

        String fileName = "D:\\JAVA实验\\JAVA进阶学习\\src\\ATM\\ATMSystem.java";
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName));
        BufferedInputStream in = mySocket.getInput();
        byte[] buff = new byte[1024];
        int len = 0;
        while((len=in.read(buff))!=-1){
            out.write(buff, 0, len);
            System.out.println("接收文件中...");
        }
        out.close();
    }
}
