package com.LinkList;

public class IntersectionLinkList {

	public static void main(String[] args) {
		LinkList1 l = new LinkList1();
//		System.out.println("main");
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(6);
		l.Display();
		LinkList1 l2 = new LinkList1();
		System.out.println();
		l2.insert(2);
		l2.insert(4);
		l2.insert(6);
		l2.insert(8);
		l2.Display();
		System.out.println("After InterSection");
		LinkList1.InterSection(l,l2);
		
//		newl.Display();
	}

}
class LinkList1{
	Node head;
	
	public LinkList1() {
		this.head=null;
	}
	Node getHead() {
		return this.head;
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
	
	public static void InterSection(LinkList1 l ,LinkList1 l2) {
		//System.out.println("Insrer");
		LinkList1 newL = new LinkList1();
		
		Node temp =l.getHead();
		
		while(temp!=null) {
			//System.out.println("1st while");
			Node temp2 = l2.getHead();
			while(temp2!=null) {
				//System.out.println("2nd while");
				if(temp.getData() == temp2.getData()) {
					newL.insert(temp2.getData());
				}
				temp2=temp2.getNext();
			}
			temp=temp.getNext();
			
		}
		newL.Display();
	}

	void Display() {
		Node temp =head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
}