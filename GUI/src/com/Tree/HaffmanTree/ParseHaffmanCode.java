//@Time : 2022-01-24 15:28
//@Author : Levitan
//@File : ParseHaffmanCode.java
//@SoftWare : IntelliJ IDEA

package com.Tree.HaffmanTree;

import java.util.*;

public class ParseHaffmanCode {
    /*
    * 将一个byte转成一个二进制的字符串
    * @param flag 标志是否需要补高位，如果是最后一个字节则无需补高位
    * @param b 传入的byte
    * @return 返回b对应的二进制串（按补码返回）
    * */
    private static String byteToBitString(boolean flag, byte b){
        int temp = b;
        if(flag){
            temp |= 256;
        }
        String str = Integer.toBinaryString(temp);
        if(flag){
            return str.substring(str.length() - 8); // 从str.length()-8开始截取，即截取后8位
        }else{
            return str;
        }
    }

    /*
    * @param huffmanCodes 哈夫曼编码表map
    * @param huffmanBytes 哈夫曼得到的字节数组
    * @return 原字符串对应的数组
    * */
    public static byte[] decode(Map<Byte, String> huffmanCodes, byte[] huffmanBytes){
        // 1、使用StringBuilder记录新字符串的补码
        StringBuilder stringBuilder = new StringBuilder();
        // 循环记录
        for(int i=0; i<huffmanBytes.length; i++){
            byte b = huffmanBytes[i];
            // 最后一个字符无需补位
            boolean flag = (i == huffmanBytes.length - 1);
            stringBuilder.append(ParseHaffmanCode.byteToBitString(!flag, b));
        }

//        System.out.println("压缩后的补码："+stringBuilder);

        // 找到记录原字符byte转为自定义哈夫曼编码Map， 根据自定义哈夫曼编码Map反获取原字符
        // 将huffmanCodes中的key和value交换并存到map中
        Map<String, Byte> map = new HashMap<>();
        for(Map.Entry<Byte, String> item: huffmanCodes.entrySet()){
            map.put(item.getValue(), item.getKey());
        }

        // 根据StringBuilder匹配新map获取对应字符
        List<Byte> list = new ArrayList<>();
        for(int j=0; j<stringBuilder.length();){
            int count = 1;
            boolean flag = true;
            Byte b = null;
            while(flag){
                String key = stringBuilder.substring(j, j+count);       // 切片寻找
                b = map.get(key);
                if(b == null){
                    count++;
                }else{
                    flag = false;
                }
            }
            list.add(b);
            j += count;
        }
        // 当for循环结束后，list就存放了字符串“i like like like java do you like a java"的所有字符
        // 把集合里的数据放入byte[]中返回byte[] b = new byte[list.size()]；
        byte[] b = new byte[list.size()];
        for(int k=0; k<b.length; k++){
            b[k] = list.get(k);
        }
        return b;
    }
}
