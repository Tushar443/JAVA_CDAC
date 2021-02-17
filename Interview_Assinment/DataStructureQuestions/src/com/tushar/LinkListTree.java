package com.tushar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkListTree {

	public static void main(String[] args) {
		TreeDemo6 t = new TreeDemo6();
		t.insert(1);
		t.insert(2);
		t.insert(3);
		t.insert(4);
		t.insert(5);
		t.insert(6);
		t.insert(7);
		
		//Inorder Traverse
		System.out.println("Inorder Traverse");
		t.InOrder(t.getRoot());
		System.out.println();
		
		//height of tree
		int x=t.height(t.getRoot());
		System.out.println("Height = "+x);
		
		t.storeData(t.getRoot());
		System.out.println("Convert into LinkList Forward");
		t.traverseForward();
		System.out.println("Convert into LinkList Backward");
		t.traverseBackward();
	}

}

class LinkNode{
	private int data;
	private LinkNode next;
	private LinkNode prev;
	
	public LinkNode() {}
	public LinkNode(int data) {
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkNode getNext() {
		return next;
	}
	public void setNext(LinkNode next) {
		this.next = next;
	}
	public LinkNode getPrev() {
		return prev;
	}
	public void setPrev(LinkNode prev) {
		this.prev = prev;
	}
	
}

class DoublyLinkList{
	private LinkNode head;
	public DoublyLinkList() {
		// TODO Auto-generated constructor stub
	}
	public void insert(int data) {
		LinkNode node = new LinkNode(data);
		if(head ==null) {
			this.head= node;
		}else {
			LinkNode temp = this.head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			node.setPrev(temp);
			temp.setNext(node);
		}
	}
	
	public void traverseForward() {
		LinkNode temp = this.head;
		while(temp.getNext()!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println(temp.getData());
	}
	
	public void traverseBackward() {
		LinkNode temp = this.head;
		while(temp.getNext()!=null) {	
			temp=temp.getNext();
		}
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getPrev();
		}
		System.out.println();
	}
}

class TreeDemo6{
	private Node root;
	private LinkNode head;
	public TreeDemo6() {}

	public void insertLinkList(int data) {
		LinkNode node = new LinkNode(data);
		if(head ==null) {
			this.head= node;
		}else {
			LinkNode temp = this.head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			node.setPrev(temp);
			temp.setNext(node);
		}
	}
	
	public void traverseForward() {
		LinkNode temp = this.head;
		while(temp.getNext()!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println(temp.getData());
	}
	
	public void traverseBackward() {
		LinkNode temp = this.head;
		while(temp.getNext()!=null) {	
			temp=temp.getNext();
		}
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getPrev();
		}
		System.out.println();
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
	
	void storeData(Node root) {
		if(root!=null) {
			storeData(root.getLeft());
			insertLinkList(root.getData());
			storeData(root.getRight());
		}
	}
}