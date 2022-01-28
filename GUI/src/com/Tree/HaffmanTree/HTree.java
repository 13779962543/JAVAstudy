//@Time : 2022-01-23 20:58
//@Author : Levitan
//@File : HTree.java
//@SoftWare : IntelliJ IDEA

package com.Tree.HaffmanTree;

import java.util.*;

class TreeNode implements Comparable<TreeNode>{
    Byte data;
    int weight;
    TreeNode left;
    TreeNode right;

    TreeNode(Byte data, int weight){
        this.data = data;
        this.weight = weight;
    }

    @Override
    public int compareTo(TreeNode o){
        return this.weight - o.weight;
    }

    @Override
    public String toString(){
        return "TreeNode[data="+data+",weight="+weight+"]";
    }

    public void preOrder(){
        System.out.println(this);
        if(this.left != null){
            this.left.preOrder();
        }
        if(this.right != null){
            this.right.preOrder();
        }
    }
}

public class HTree {
    private TreeNode root;      // 哈夫曼树的根节点
    private byte[] bytes;       // 储存原数据的byte编码
    private final Map<Byte, String> huffmanCodes = new HashMap<>();     // 储存哈夫曼编码

    HTree(){}
    HTree(byte[] bytes){
        this.bytes = bytes;
        List<TreeNode> dataList = HTree.getNodes(this.bytes);
        this.createHaffmanTree(dataList);   // 生成哈夫曼树
        this.createCodes();                 // 生成哈夫曼编码

    }

    private static List<TreeNode> getNodes(byte[] bytes){
        List<TreeNode> nodesList = new ArrayList<>();
        Map<Byte, Integer> map = new HashMap<>();
        for(byte b : bytes){
            map.merge(b, 1, Integer::sum);
        }

        for(Map.Entry<Byte, Integer> temp : map.entrySet()){
            nodesList.add(new TreeNode(temp.getKey(), temp.getValue()));
        }
        return nodesList;
    }

    private void createHaffmanTree(List<TreeNode> nodeDataList){
        while(nodeDataList.size() > 1){
            Collections.sort(nodeDataList);
            /*
            * 1、取出权值最小的节点二叉树
            * 2、根据两个权值最小的二叉树构建一个新的二叉树
            * 3、删除原来两个权值虽小的二叉树
            * 4、将新的二叉树放入队列，并构建新的队列
            * 5、新的队列进行从小到大排序
            * */
            TreeNode leftNode = nodeDataList.get(0);
            TreeNode rightNode = nodeDataList.get(1);
            TreeNode parentNode = new TreeNode(null, leftNode.weight+rightNode.weight);
            parentNode.left = leftNode;
            parentNode.right = rightNode;
            nodeDataList.remove(leftNode);
            nodeDataList.remove(rightNode);
            nodeDataList.add(parentNode);
        }
        this.root = nodeDataList.get(0);
    }

    // 生成哈夫曼编码
    private void createCodes(){
        if(this.root == null){
            return;
        }
        StringBuilder str = new StringBuilder();
        this._getCodes(this.root, "", str);
    }

    // 被getCodes调用
    private void _getCodes(TreeNode node, String code, StringBuilder stringBuilder){
        StringBuilder str = new StringBuilder(stringBuilder);
        str.append(code);
        if(node != null){
            if(node.data == null){
                _getCodes(node.left, "0", str);
                _getCodes(node.right, "1", str);
            }else{
                this.huffmanCodes.put(node.data, str.toString());
            }
        }
    }

    public Map<Byte, String> getCodes(){return this.huffmanCodes;}

    // 递归显示哈夫曼树
    public void preOrder(){
        if(this.root != null){
            root.preOrder();
        }else {
            System.out.println("哈夫曼树为空");
        }
    }

    public byte[] zip(){
        // 储存二进制的哈夫曼编码
        StringBuilder stringBuilder = new StringBuilder();
        for(byte b: this.bytes){
            stringBuilder.append(huffmanCodes.get(b));
        }

        int len;
        if(stringBuilder.length() % 8 == 0){
            len = stringBuilder.length() / 8;
        }else{
            len = stringBuilder.length() /8+1;
        }
        // System.out.println("压缩后的二进制："+stringBuilder);
        // 创建储存压缩后的byte数组
        byte[] huffmanCodeBytes = new byte[len];
        int index = 0;          // 记录是第几个byte
        for(int i = 0; i<stringBuilder.length(); i += 8){   // 因为每8位对应一个byte，所以步长是8
            String strByte;
            if(i+8 > stringBuilder.length()){   // 不够8位
                strByte = stringBuilder.substring(i);       // i处开始截取
            }else{
                strByte = stringBuilder.substring(i, i+8);
            }
            // 将strByte转换成一个byte，放到huffmanCodebytes中
            huffmanCodeBytes[index] = (byte)Integer.parseInt(strByte, 2);
            index++;
        }
        return huffmanCodeBytes;
    }
}
