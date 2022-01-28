

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

// 二叉树的节点
class TreeNode {
    public Object data;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int data){
        this.data = data;
    }
}

public class BTree {
    // 二叉树的根节点
    private TreeNode root;

    BTree(){}

    // 获取根节点
    public TreeNode getRood() {return this.root;}

    /*
    当根节点为null是随机生成 nodeCount个节点的二叉树
    否则向根节点的二叉树插入 nodeCount个节点
     */
    public void randomBuildTree(int nodeCount) {
        Random r = new Random();
        TreeNode root;
        if(this.root == null) {
            root = new TreeNode(r.nextInt(101));
        }else{
            root = this.root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        for(int i=0; i<nodeCount; i++) {
            TreeNode newNode = new TreeNode(r.nextInt(101));
            queue.add(root);
            while(!queue.isEmpty()) {
                TreeNode node = queue.poll();
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
        if(this.root == null) {this.root = root;}
    }

    // 递归方式输出二叉树
    public void display(TreeNode node, int layer) {
        if(node == null) {return;}
        String str = new String(new char[layer]).replace("\0", "--");
        System.out.print(str);
        System.out.println(node.data);
        this.display(node.left, layer+1);
        this.display(node.right, layer+1);
    }

    // 非递归方式输出二叉树
    public void display(){
        // 用于在在栈中储存数据
        class StackData{
            public final TreeNode Data;
            public int mark;

            StackData(TreeNode data, int mark){
                this.Data = data;
                this.mark = mark;
            }
        }
        Stack<StackData> stack = new Stack<>();
        stack.push(new StackData(this.root, 0));
        int layer = 0;
        while(!stack.isEmpty()){
            TreeNode newNode = stack.peek().Data;
            int mark = stack.peek().mark;
            if(mark == 0){
                String str = new String(new char[layer]).replace("\0", "--");
                System.out.println(str+newNode.data);
            }
            if(mark == -1 || newNode.left == null && newNode.right == null){
                stack.pop();
                layer -= 1;
                continue;
            }
            if(newNode.left != null && mark == 0){
                stack.peek().mark = 1;
                stack.push(new StackData(newNode.left, 0));
                layer += 1;
            }else if(newNode.right != null){
                stack.peek().mark = -1;
                stack.push(new StackData(newNode. right, 0) );
                layer += 1;
            }else if(mark == 1){
                stack.peek().mark = -1;
            }
        }
    }

    public static void main(String[] args) {
        BTree a = new BTree();

        // 创建二叉树
        long starTime = System.currentTimeMillis();
        a.randomBuildTree(1000000);			// 控制生成二叉树的节点个数
        long endTime = System.currentTimeMillis();
        long creatTime = endTime - starTime;

        // 递归方式输出
        starTime = System.currentTimeMillis();
        a.display(a.getRood(), 0);
        endTime = System.currentTimeMillis();
        long display1Time = endTime - starTime;

        System.out.println("===========================");

        // 非递归方式输出
        starTime = System.currentTimeMillis();
        a.display();
        endTime = System.currentTimeMillis();
        long display2Time = endTime - starTime;

        System.out.println("创建二叉树用时："+creatTime/1000+"s");
        System.out.println("递归访问用时："+display1Time/1000+"s");
        System.out.println("非递归用时："+display2Time/1000+"s");
    }
}
