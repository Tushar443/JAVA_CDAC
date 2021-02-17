package com.LinkList;


public class LinkListOccurance {

	public static void main(String[] args) {
		LinkList2 l = new LinkList2();
		l.insert(1);
		l.insert(2);
		l.insert(1);
		l.insert(4);
		l.insert(1);
		l.insert(2);
		l.Display();
		System.out.println();
		l.findOccarance(5);
		//l.Display();

	}

}

class LinkList2{
	Node head;
	
	public LinkList2() {
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
	
	void findOccarance(int data) {
		Node temp = this.head;
		int count=0;
		while(temp!=null) {
			
			if(temp.getData()==data) 
				count++;
			temp=temp.getNext();
		}
		
		System.out.println("Count of "+data +" is "+ count);
	}
	
	void Display() {
		Node temp =head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
}
