package com.tushar;

import java.util.LinkedList;
import java.util.Queue;

public class Top_View_Tree {

	public static void main(String[] args) {
		TreeDemo t = new TreeDemo();
		t.insert(1);
		t.insert(2);
		t.insert(3);
		t.insert(4);
		t.insert(5);
//		t.insert(6);
//		t.insert(7);
		
		//Inorder Traverse
		t.InOrder(t.getRoot());
		System.out.println();
		// Top View
		t.topView(t.getRoot());
		System.out.println();
		
		//height of tree
		int x=t.height(t.getRoot());
		System.out.println("Height = "+x);
		
		t.forwardLevelOrder(t.getRoot());
		
	}

}
class Node{
	private int data;
	private Node left;
	private Node right;
	public Node() {
		this.data=0;
		this.left=null;
		this.right=null;
	}
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
}

class TreeDemo{
	private Node root;
	
	public TreeDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public Node getRoot() {
		return root;
	}


	public void setRoot(Node root) {
		this.root = root;
	}


	void insert(int data) {
		Node node = new Node(data);
		if(root==null) {
			//System.out.println("root "+data);
			root=node;
		}else {
		Node temp =null;
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			//System.out.println("while " +data);
			temp = q.peek();
			q.remove();
			if(temp.getLeft()==null) {
				temp.setLeft(node);
				break;
			}
			else {
				q.add(temp.getLeft());
			}
			if(temp.getRight()==null) {
				temp.setRight(node);
				break;
			}else {
				q.add(temp.getRight());
			}
		}
		}
	}
	void leftView(Node left) {
		if(left!=null) {
			leftView(left.getLeft());
			System.out.print(left.getData()+" ");
		}
	}
	void rightView(Node right) {
		if(right!=null) {
			System.out.print(right.getData()+" ");
			rightView(right.getRight());
			
		}
	}
	void topView(Node root) {
		leftView(root);
		rightView(root.getRight());
	}
	
	int height(Node root) {
		if(root==null) {
			return 0;
		}
		int x = max(height(root.getLeft()),height(root.getRight()))+1;
		return x;
	}
	
	private int max(int height, int height2) {
		if(height>height2) {
			return height;
		}else
			return height2;
	}

	void InOrder(Node root) {
		if(root!=null) {
			InOrder(root.getLeft());
			System.out.print(root.getData() +" ");
			InOrder(root.getRight());
		}
	}
	
	
	void printLevel(Node root,int level) {
		if(root==null) {
			return;
		}

		if(level==1) {
			System.out.print(root.getData()+" ");
		}
		
		if(level>1) {
			if(root.getLeft()==null) {
				System.out.print("N ");
				
			}
			printLevel(root.getLeft(), level-1);
			if( root.getRight()==null) {
				System.out.print("N ");
			}
			printLevel(root.getRight(), level-1);
			
		}
	}
	
	void forwardLevelOrder(Node root) {
		int height = height(root);
		
		for(int i=1;i<=height;i++) {
			printLevel(root,i);
		}
	}
}