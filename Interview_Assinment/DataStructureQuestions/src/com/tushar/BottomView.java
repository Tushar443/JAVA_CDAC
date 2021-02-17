package com.tushar;

import java.util.LinkedList;
import java.util.Queue;

public class BottomView {

	public static void main(String[] args) {
		TreeDemo3 t = new TreeDemo3();
		t.insert(20);
		t.insert(8);
		t.insert(22);
		t.insert(5);
		t.insert(3);
		t.insert(25);
		t.insert(10);
		t.insert(14);
		t.insert(12);
		t.insert(34);
		t.insert(54);
		t.insert(87);
		t.insert(56);
		t.insert(45);
		t.insert(20);
		t.insert(54);
		t.insert(87);
		t.insert(56);
		t.insert(45);
		t.insert(20);
		//14 5 12 34 3 25 10
		//Inorder Traverse
		t.InOrder(t.getRoot());
		System.out.println();
		
		//height of tree
		int x=t.height(t.getRoot());
		System.out.println("Height = "+x);
		
		t.bottomView(t.getRoot());
		
	}

}

class TreeDemo3{
	private Node root;
	
	public TreeDemo3() {
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

	void InOrder(Node root,int i) {
		if(root!=null) {
			InOrder(root.getLeft(),i+1);
			if(i>2) {
				System.out.print(root.getData() +" ");
				//return;
			}
			InOrder(root.getRight(),i+1);
		}
	}
	
	void bottomView(Node root) {
		int height= height(root);
		
		if(height <= 2) {
			InOrder(root,3);
			return;
		}else
			InOrder(root,1);
	}
}