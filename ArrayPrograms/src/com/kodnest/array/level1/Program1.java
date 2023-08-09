package com.kodnest.array.level1;

	import java.util.Scanner;
	public class Program1 {
	  public static void main(String []args) {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("enter the length of array");
		  int []arr=new int[scan.nextInt()];
		  System.out.println("enter the array elements");
		  for(int i=0;i<=arr.length-1;i++)
			  arr[i]=scan.nextInt();
		  System.out.println("the array contents are......");
		  for(int j=0;j<=arr.length-1;j++)
			  System.out.println((arr[j]+5)+" ");
		  scan.close();
		  
	  }
	}

