package com.DS;

import java.util.Scanner;

public class demoSum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("2nd");
		 n=sc.nextInt();
		 int minarr[]= new int[n];
		 for(int i=0;i<n;i++) {
			minarr[i]=sc.nextInt();
		 }

		 int max=Math.max(arr.length,minarr.length);
		 int min= Math.min(arr.length, minarr.length);
		 int addarr[]=null;
		 if(max !=min) {
			 int a = max;
			 addarr=new int[max] ;
			for(int i =max-1,j=min-1;i>=0 && j>=0;i--,j--) {
				addarr[i]=minarr[j];
			}
		 }		 
		 int sum[]=new int[max];
		 int top=-1;
		 int upset=0;
		 for(int i=max-1,j=max-1;i>=0 && j>=0;i--,j--) {
			 int s =arr[i]+addarr[j]+upset;
			 upset=0;
			 if(s > 9) {
				 int _2nd = s%10;
				 int _1st = s/10;
				 upset= _1st;
				 s=_2nd;
			 }
				 sum[++top]=s;
		 }
		 
		 for (int i =sum.length-1 ;i>=0;i--) {
			System.out.print(sum[i]+" ");
		}
	}
	
}
