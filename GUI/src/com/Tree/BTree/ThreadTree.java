//@Time : 2022-01-22 19:00
//@Author : Levitan
//@File : ThreadTree.java
//@SoftWare : IntelliJ IDEA

package com.Tree.BTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class ThreadTreeNode{
    public int data;
    public boolean leftTag;     // false表示左节点为指针，true表示左节点为线索
    public boolean rightTag;
    public ThreadTreeNode left;
    public ThreadTreeNode right;

    ThreadTreeNode(){}
    ThreadTreeNode(int data){this.data = data;}
}

public class ThreadTree {
     private ThreadTreeNode b;
     private ThreadTreeNode root;
     private ThreadTreeNode parent;

    public void randomBuildTree(int nodeCount) {
        Random r = new Random(123);
        ThreadTreeNode root;
        if(this.b == null) {
            root = new ThreadTreeNode(r.nextInt(101));
        }else{
            root = this.b;
        }
        Queue<ThreadTreeNode> queue = new LinkedList<>();
        for(int i=0; i<nodeCount; i++) {
            ThreadTreeNode newNode = new ThreadTreeNode(r.nextInt(101));
            queue.add(root);
            while(!queue.isEmpty()) {
                ThreadTreeNode node = queue.poll();
                if(r.nextBoolean()) {
                    if(node.left == null) {
                        node.left = newNode;
                    }else {
                        queue.add(node.left);
                    }
                }else {
                    if(node.right == null) {
                        node.right = newNode;
                    }else {
                        queue.add(node.right);
                    }
                }
            }
        }
        if(this.b == null) {this.b = root;}
    }

    public void creatThread(){
        this.root = new ThreadTreeNode();
        this.root.rightTag = true;
        this.root.right = this.b;
        if(this.b == null){
            this.root.left = this.root;
        }else{
            this.root.left = this.b;
            this.parent = this.root;
            this.thread(this.b);
            this.parent.right = this.root;
            this.root.right = this.parent;
        }
    }

     private void thread(ThreadTreeNode p){
         if(p != null){
             this.thread(p.left);
             if(p.left == null){
                 p.left = this.parent;
                 p.leftTag = true;
             }
             if(this.parent.right == null){
                 this.parent.right = p;
                 this.parent.rightTag = true;
             }
             this.parent = p;
             this.thread(p.right);
         }
     }

     public void creatThread2(){

     }

     public void inOrder(){
         ThreadTreeNode p = this.root.left;
         while(p != this.root){
             while(!p.leftTag){
                 p = p.left;
             }
             System.out.print(p.data+" ");
             while(p.rightTag && p.right != this.root){
                 p = p.right;
                 System.out.print(p.data+" ");
             }
             p = p.right;
         }
     }


    public static void main(String[] args) {
        ThreadTree a = new ThreadTree();

        a.randomBuildTree(10000000);

        long starTime = System.currentTimeMillis();
        a.creatThread();
        long endTime = System.currentTimeMillis();
        long createThreadTime = endTime-starTime;
        System.out.println("线索化用时："+createThreadTime);

//        a.inOrder();
    }
}
