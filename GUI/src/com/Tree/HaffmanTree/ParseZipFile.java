//@Time : 2022-01-25 13:46
//@Author : Levitan
//@File : unZipFile.java
//@SoftWare : IntelliJ IDEA

package com.Tree.HaffmanTree;

import java.io.*;
import java.util.Map;

public class ParseZipFile {

    /*
    * @param zipFile 准备解压的文件
    * @param dstFile 文件解压到的路径
    * */
    public static void unZipFile(String zipFile, String dstFile){
        InputStream in = null;
        ObjectInputStream objectIn = null;
        OutputStream out = null;
        try{
            in = new FileInputStream(zipFile);
            objectIn = new ObjectInputStream(in);
            byte[] huffmanBytes = (byte[]) objectIn.readObject();
            Map<Byte, String> huffmanCodes = (Map<Byte, String>) objectIn.readObject();

            byte[] bytes = ParseHaffmanCode.decode(huffmanCodes, huffmanBytes);
            out = new FileOutputStream(dstFile);
            out.write(bytes);
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try{
                assert in != null;
                in.close();
                assert objectIn != null;
                objectIn.close();
                assert out != null;
                out.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        String zipFile = "D:\\实验专用文件夹\\压缩文件1.zip";   // 需要解压的文件路径
        String dstFile = "D:\\实验专用文件夹\\5-尚硅谷_宋红康_JDBC学习路线.xmind";   // 解压后的文件路径
        unZipFile(zipFile, dstFile);
        System.out.println("解压完成");
    }
}
