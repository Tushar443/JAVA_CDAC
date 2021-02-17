package com.tushar;

public class BalanceTree {

	public static void main(String[] args) {
		TreeDemo5 t = new TreeDemo5();
		t.insert();
		
		//14 5 12 34 3 25 10
		// Inorder Traverse
		t.InOrder(t.getRoot());
		System.out.println();
		
		//height of tree
		int x=t.height(t.getRoot());
		System.out.println("Height = "+x);
		
		boolean s =t.isBalanced(t.getRoot());
		if(s) {
			System.out.println("UnBalanced");
		}else {
			System.out.println("Balance");
		}
	}

}

class TreeDemo5{
	private Node root;
	
	public TreeDemo5() {}
	
	public Node getRoot() {
		return root;
	}


	public void setRoot(Node root) {
		this.root = root;
	}


	void insert() {
		Node node = new Node(1);
		root=node;
		root.setLeft(new Node(10));
		root.setRight(new Node(39));
		root.getLeft().setLeft(new Node(5));
		root.getLeft().getLeft().setLeft(new Node(23));
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
	
	boolean isBalanced(Node root) {
		boolean flag = false;

		int left = height(root.getLeft());
		int right = height(root.getRight());
		
		if((left-right) >1  ) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
}