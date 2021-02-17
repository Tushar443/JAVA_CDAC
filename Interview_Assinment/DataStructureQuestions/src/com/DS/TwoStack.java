package com.DS;

public class TwoStack {

	public static void main(String[] args) {
		TwoStacks t = new TwoStacks(5);
		t.stack1(1);
		t.stack1(2);
		t.stack2(3);
		t.stack2(4);
		t.stack1(5);
		t.stack1(6);
		t.stack2(7);
		
		
		for (int i : t.arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(t.pop1());
		t.stack2(76);
		System.out.println(t.pop2());

		

	}

}
class TwoStacks {
	public int[] arr;
	private int top1,top2;
	private int size ;
	
	public TwoStacks() {}
	public TwoStacks(int n) {
		this.size=n;
		arr=new int[n];
		top1=-1;
		top2=n;
	}
	
	void stack1(int num) {
		if(top1<top2-1) {
			arr[++top1]=num;
		}
		else {
			System.out.println("Stack Overflow "+num);
			return;
		}
	}
	void stack2(int num) {
		if(top1<top2-1) {
			arr[--top2]=num;
		}else {
			System.out.println("Stack Overflow "+num);
			return;
		}
	}
	int pop1() {
		if(top1>=0) {
			return arr[top1--];
		}else {
			System.out.println("Empty Stack");
			return -1;
		}
	}
	int pop2() {
		if(top2<size) {
			return arr[top2++];
		}else {
			System.out.println("Empty Stack");
			return -1;
		}
	}
}