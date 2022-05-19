package com.stringDemo;

import java.util.HashSet;

public class StringDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		
		
		String s = "java";
		char demoarr[]= new char[10];
		char arr[]=s.toCharArray();
		boolean flag= false;
		int top =0;
		for(int i =0;i<s.length();i++) {
			char a = arr[i];
			for(int j = 0;j<arr.length;j++) {
				if(a == demoarr[j]) {
					flag = true;
					break;
				}else {
					flag = false;
				}
			}
			if(flag) {
				continue;
			}else {
				demoarr[top++]=a;
			}
			
		}
		
		for (char c : demoarr) {
			System.out.print(c);
		}
		
		

	}

}
