package com.DS;

import java.util.Stack;

public class QueueUsingStack {

	public static void main(String[] args) {
		Stacks s = new Stacks();
		s.Enqueue(1);
		s.Enqueue(2);
		s.Enqueue(3);
		s.Enqueue(4);
		s.Enqueue(5);
		System.out.println(s.Dequeue());
		System.out.println(s.Dequeue());
		System.out.println(s.Dequeue());
		System.out.println(s.Dequeue());
		System.out.println(s.Dequeue());
		System.out.println(s.Dequeue());
		System.out.println(s.Dequeue());

	}

}

class Stacks{
	public Stack<Integer> s1  = new Stack<Integer>();
	public Stack<Integer> s2 = new Stack<Integer>();
	
	public Stacks() {
		
	}
	
	void Enqueue(int data) {
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	int Dequeue() {
		if(s1.isEmpty()) {
			System.out.println("Empty");
			System.exit(0);
			return -1;
		}
		else {
			return s1.pop();
		}
	}
}

//class Stack1{
//	int []arr1;
//	int top1;
//	int size;
//
//	public Stack1() {}
//	public Stack1(int size) {
//		this.arr1= new int[size];
//		this.size=size;
//		this.top1=-1;
//	}
//	
//}
//
//class Stack2{
//	int []arr2;
//	int top2;
//	int size;
//	public Stack2() {}
//	public Stack2(int size) {
//		this.arr2= new int[size];
//		this.size=size;
//		this.top2=-1;
//	}
//	
//	push
//}
