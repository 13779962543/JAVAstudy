//@Time : 2022-01-23 11:23
//@Author : Levitan
//@File : ThreadTree.java
//@SoftWare : IntelliJ IDEA

package com.Tree.ThreadTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

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

    // 随机生成nodeCount个节点的二叉树
    public void randomBuildTree(int nodeCount) {
        Random r = new Random();
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

    // 二叉树线索化
    public void createThread(){
        this.root = new ThreadTreeNode();
        this.root.rightTag = true;
        this.root.right = this.b;

        if(this.b == null){
            this.root.left = this.root;
            return;
        }

        ThreadTreeNode parent;
        this.root.left = this.b;
        parent = this.root;

        class StackNode{
            final ThreadTreeNode data;
            int mark;
            StackNode(ThreadTreeNode data){this.data = data;}
        }

        Stack<StackNode> stack = new Stack<>();
        stack.push(new StackNode(this.b));
        while(!stack.isEmpty()){
            if(stack.peek().mark == -1){    // mark = 1 表明当前节点的左右孩子都被访问
                stack.pop();
                continue;
            }
            ThreadTreeNode topNode = stack.peek().data;
            if(topNode.left != null && stack.peek().mark == 0){     // 左子树不为空且没被访问，将左子树进栈
                stack.peek().mark = 1;
                stack.push(new StackNode(topNode.left));
                continue;
            }else if(stack.peek().mark == 0){       // 左子树为空且没被访问，进行线索化
                stack.peek().mark = 1;
                topNode.left = parent;
                topNode.leftTag = true;
            }else if(topNode.right != null && stack.peek().mark == 1){          // 右子树不为空且没被访问，将右子树进栈
                stack.peek().mark = -1;
                stack.push(new StackNode(topNode.right));
            }else{
                stack.peek().mark = -1;
                continue;
            }
            if(parent.right == null){
                parent.right = topNode;
                parent.rightTag = true;
            }
            parent = topNode;
        }
        parent.right = this.root;
        parent.rightTag = true;
        this.root.right = parent;
    }

    // 线索二叉树中序遍历
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
        a.createThread();
        long endTime = System.currentTimeMillis();
        long createThreadTime = endTime-starTime;

//        starTime = System.currentTimeMillis();
//        a.inOrder();
//        endTime = System.currentTimeMillis();
//
//        long inOrderTime = endTime-starTime;
        System.out.println("线索化用时："+createThreadTime);
//        System.out.println("中序访问用时："+inOrderTime);
    }
}
