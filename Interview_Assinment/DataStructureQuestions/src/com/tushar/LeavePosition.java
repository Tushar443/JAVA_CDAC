package com.tushar;

import java.util.LinkedList;
import java.util.Queue;

public class LeavePosition {

	public static void main(String[] args) {
		TreeDemo4 t = new TreeDemo4();
		t.insert(1);
		t.insert(2);
		t.insert(3);
		t.insert(4);
		t.insert(5);
		t.insert(6);
		t.insert(7);
		
		//Inorder Traverse
		t.InOrder(t.getRoot());
		System.out.println();
		
		//height of tree
		int x=t.height(t.getRoot());
		System.out.println("Height = "+x);
		
		t.leavePosition(t.getRoot());
	}

}

class TreeDemo4{
	private Node root;
	
	public TreeDemo4() {
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
	
boolean flag;
	
	boolean printLevel(Node root,int level) {
		if(root==null) {
			return false;
		}
		if(level>1) {
			if(root.getLeft()==null) {
				flag = true;
			}
			printLevel(root.getLeft(), level-1);
			if( root.getRight()==null) {
				flag = true;
			}
			
			printLevel(root.getRight(), level-1);
			
		}
		return flag;
	}
	
	void leavePosition(Node root) {
		int height = height(root);
		boolean x = false ;
		for(int i=1;i<=height;i++) {
			x= printLevel(root,i);
		}
		if(x) {
			System.out.println("No Leaves are at same level");
		}else
			System.out.println("At same level");
	}
	
}