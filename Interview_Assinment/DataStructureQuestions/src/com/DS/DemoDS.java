package com.DS;

import java.util.Scanner;
/**
 * Write a complete program to find the length of  minimum subsequence of '1' in 
 * the given string of '0' & '1' s 

for Example: 

if the given string is '01111001110111011110001110111111

Minimum subsequence of '1'  in the given string is '111' and the length is '3'. 

Note: if there is no subsequence of '1' print '-1'
 * 
 *String s="111011111000111100111101111100011110111111";
//		String s = "0101010100101001";
 */

public class DemoDS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char arr[]= s.toCharArray();
		String [] arrString= new String[s.length()];
		for (String string : arrString) {
			string="0";
		}
		int top =0;
		for(int i =0;i<arr.length;i++) {
			
			char a = arr[i];
			if(a=='0') {
				top++;
				continue;
			}
			if(a=='1') {
				
				arrString[top]+=a;
				
			}	
		}
		int []arrInt=new int[s.length()];
		top=-1;
		for (String string : arrString) {
			if(string ==null) {
				continue;
			}else {
				
				arrInt[++top] = string.length()-4;
			}
		}
		int min=arrInt[0];
		int index = 0;
		for (int i : arrInt) {
			if(min > i && i !=0) {
				min =i;
				index = i;
			}
		}
		if(min==1) {
			System.out.println("-1");
		}
		else {
			if(arrString[index]==null) {
				System.out.println("-1");
				return ;
			}
			System.out.println("SubSequence "+arrString[index].substring(4)+" Min "+min );
		}
		
	}

}
