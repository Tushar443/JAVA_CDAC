package com.LinkList;


public class LinListEvenOdd {

	public static void main(String[] args) {
		LinkList l = new LinkList();
//		l.insert(13);
//		l.insert(23);
		l.insert(54);
//		l.insert(45);
//		l.insert(11);
		l.insert(66);
		l.Display();
		System.out.println("@@@@@@@@@@");
		l.modifyLinkList();
		l.Display();

	}

}

class Node{
	private int data;
	private Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}


class LinkList{
	Node head;
	
	public LinkList() {
		this.head=null;
	}
	
	void insert(int data) {
		Node node = new Node(data);
		if(head ==null) {
			head =node;
		}else {
			Node temp =head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(node);
		}
	}
	
	void modifyLinkList() {
		Node temp = head;
		Node prev = temp;
		Node shift = head;
		int count=0;
		int odd =0,even =0;
		while(temp!=null) {
			count++;
			if(temp.getData()%2==0) {
				even++;
			}else {
				odd++;
			}
			temp=temp.getNext();
		}
		if(odd==0) {
			System.out.println("All Even Number");
			Display();
			System.exit(0);
		}
		if(even == 0) {
			System.out.println("All Odd Number");
			Display();
			System.exit(0);
		}
		int i=0; 
		temp = head;
		while(temp.getNext()!=null && i!=count) {
			i++;
			if(temp.getData()%2 != 0) {
				//System.out.println(temp.getData());
				shift = temp;
				prev.setNext(temp.getNext());
				temp=temp.getNext();
				shift.setNext(null);
				addLast(shift);
				//System.out.println("end if");
			}else {
				prev=temp;
				temp=temp.getNext();
			}
		}
	}
	
	
	private void addLast(Node shift) {
		Node temp = this.head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(shift);
		
	}

	void Display() {
		Node temp =head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
}
