package com.Tree.BTree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

// 二叉树的节点
class TreeNode {
	public Object data;
	public TreeNode left;
	public TreeNode right;

	TreeNode(){}
	TreeNode(int data){
		this.data = data;
	}
}

public class BTree {
	// 二叉树的根节点
	private TreeNode root;
	
	BTree(){}

	// 获取根节点
	public TreeNode getRoot() {return this.root;}

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
		System.out.println(str+node.data);
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

	// 获取二叉树高度
	public int getDepth(TreeNode node){
		if(node != null){
			int leftDepth = this.getDepth(node.left);
			int rightDepth = this.getDepth(node.right);
			int max = Math.max(leftDepth, rightDepth);
			return max + 1;
		}else {return 0;}
	}

	// 非递归方式获取二叉树高度
	public int getDepth(){
		if(this.root == null){return 0;}
		class StackData{
			public final TreeNode Data;
			public int mark;
			public final int depth;

			StackData(TreeNode data, int mark, int depth){
				this.Data = data;
				this.mark = mark;
				this.depth = depth;
			}
		}
		int max = 0;
		Stack<StackData> stack = new Stack<>();
		stack.push(new StackData(this.root, 0, 1));
		while(!stack.isEmpty()){
			TreeNode topNode = stack.peek().Data;
			StackData stackNode = stack.peek();
			boolean key = false;
			if(topNode.left != null && stackNode.mark == 0){
				stack.peek().mark = 1;
				key = true;
			}else if(stackNode.mark != -1){
				stack.peek().mark = 1;
			}
			if(topNode.right != null && stackNode.mark == 1){
				stack.peek().mark = -1;
				stack.push(new StackData(topNode.right, 0, stackNode.depth+1));
			}else if(stack.peek().mark != -1){
				stack.peek().mark = -1;
			}
			if(key){
				stack.push(new StackData(topNode.left, 0, stackNode.depth+1));
			}

			if(stack.peek().mark == -1 || topNode.left == null && topNode.right == null){
				max = Math.max(max, stack.pop().depth);
			}
		}
		return max;
	}

	// 二叉树层序遍历
	public void levelOrder(){
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(this.root);
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			System.out.print(node.data+",");
			if(node.left != null){
				queue.add(node.left);
			}
			if(node.right != null){
				queue.add(node.right);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BTree a = new BTree();
		a.randomBuildTree(10);
		a.display();
		a.levelOrder();

		// 创建二叉树
//		long starTime = System.currentTimeMillis();
//		a.randomBuildTree(5000000);			// 控制生成二叉树的节点个数
//		long endTime = System.currentTimeMillis();
//		long creatTime = endTime - starTime;
//
//		// 递归方式输出
//		starTime = System.currentTimeMillis();
//		a.display(a.root, 0);
//		endTime = System.currentTimeMillis();
//		long display1Time = endTime - starTime;
//
//		System.out.println("===========================");
//
//		// 非递归方式输出
//		starTime = System.currentTimeMillis();
//		a.display();
//		endTime = System.currentTimeMillis();
//		long display2Time = endTime - starTime;
//
//		System.out.println("创建二叉树用时："+creatTime+"="+creatTime/1000+"s");
//		System.out.println("递归访问用时："+display1Time+"="+display1Time/1000+"s");
//		System.out.println("非递归用时："+display2Time+"="+display2Time/1000+"s");
	}
}
