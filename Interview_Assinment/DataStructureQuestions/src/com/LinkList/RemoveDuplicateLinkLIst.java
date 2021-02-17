package com.LinkList;


public class RemoveDuplicateLinkLIst {

	public static void main(String[] args) {
		LinkList4 l = new LinkList4();
		l.insert(11);
		l.insert(11);
		l.insert(11);
		l.insert(21);
		l.insert(43);
		l.insert(43);
		l.insert(60);
		l.Display();
		System.out.println();
		LinkList4.removeDuplicate(l);
		//l.Display();

	}

}


class LinkList4{
	Node head;
	
	public LinkList4() {
		this.head=null;
	}
	public Node getHead() {
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
	
	static void removeDuplicate(LinkList4 l) {
		Node temp = l.getHead();
		Node prev= temp;
		Node actual = temp;
		int arr[]=new int[8];
		int top =-1;
		boolean flag =false;
		while(temp!=null)
		{
			for (int i= 0;i<8;i++) {
				if(temp.getData() == arr[i]) {
					prev.setNext(temp);
					flag= true;
				}
			}
			if(flag) {
				arr[++top]=temp.getData();
			}
			actual = temp;
			prev=actual;
			temp=temp.getNext();
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	void Display() {
		Node temp =head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
}
