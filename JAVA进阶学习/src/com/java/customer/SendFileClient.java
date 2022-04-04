//@Time : 2022-03-16 20:52
//@Author : Levitan
//@File : DaytimeClien.java
//@SoftWare : IntelliJ IDEA

package com.java.customer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SendFileClient {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        try{
            System.out.println("输入服务器ip：");
            String hostName = br.readLine();
            System.out.println("输入端口号：");
            String portNum = br.readLine();
            SendFileClientHelper.getFile(hostName, portNum);
            System.out.println("文件接收成功");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
