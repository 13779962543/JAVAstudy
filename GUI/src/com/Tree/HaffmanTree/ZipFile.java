//@Time : 2022-01-25 12:19
//@Author : Levitan
//@File : zipFile.java
//@SoftWare : IntelliJ IDEA

package com.Tree.HaffmanTree;

import java.io.*;

public class ZipFile {
    /*
    * @param stcFile 希望压缩文件的路径
    * @param dstFile 压缩后文件的路径
    * */
    public static void zipFile(String srcFile, String dstFile){
        OutputStream out = null;
        ObjectOutputStream objectOut = null;
        FileInputStream in = null;
        try{
            in = new FileInputStream(srcFile);
            byte[] b = new byte[in.available()];
            in.read(b);
            HTree hTree = new HTree(b);
            byte[] zipBytes = hTree.zip();
            out = new FileOutputStream(dstFile);
            objectOut = new ObjectOutputStream(out);
            objectOut.writeObject(zipBytes);
            objectOut.writeObject(hTree.getCodes());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try{
                assert in != null;
                in.close();
                assert out != null;
                out.close();
                assert objectOut != null;
                objectOut.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        String srcFile = "D:\\实验专用文件夹\\5-尚硅谷_宋红康_JDBC学习路线.xmind";   // 需要压缩的文件路径
        String dstFile = "D:\\实验专用文件夹\\压缩文件1.zip";   // 压缩后的文件路径
        zipFile(srcFile, dstFile);
        System.out.println("压缩完成");
    }
}
