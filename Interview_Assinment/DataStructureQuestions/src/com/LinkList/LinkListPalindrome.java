package com.LinkList;


public class LinkListPalindrome {

	public static void main(String[] args) {
		LinkList3 l = new LinkList3();
		l.insert('R');
		l.insert('A');
		l.insert('D');
		l.insert('a');
		l.insert('k');
//		l.insert(2);
		l.Display();
//		System.out.println('a'=='b');
		System.out.println();
		System.out.println(l.palindromOrNot());
		//l.Display();

	}

}

class Node2{
	private char data;
	private Node2 next;
	
	public Node2(char data) {
		this.data=data;
		this.next=null;
	}
	public char getData() {
		return data;
	}
	public void setData(char data) {
		this.data = data;
	}
	public Node2 getNext() {
		return next;
	}
	public void setNext(Node2 next) {
		this.next = next;
	}
}
class LinkList3{
	Node2 head;
	
	public LinkList3() {
		this.head=null;
	}
	
	void insert(char data) {
		Node2 node = new Node2(data);
		if(head ==null) {
			head =node;
		}else {
			Node2 temp =head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(node);
		}
	}
	
	boolean palindromOrNot() {
		char stackarr[]= new char[10];
		char quearr[]=new char[10];
				
		int top=-1,front=-1,rear=-1;
		Node2 temp = this.head;
		while(temp!=null) {
			stackarr[++top]=temp.getData();
			quearr[++rear]=temp.getData();
			temp=temp.getNext();
		}
		
		boolean flag =false;
		while(top!=-1 || front!=rear) {
			System.out.println();
			if(stackarr[top--]==quearr[++front]) {
				flag =true;
			}else {
				return false;
				
			}
		}
		
		
		return flag;
	}
	
	void Display() {
		Node2 temp =head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
}
