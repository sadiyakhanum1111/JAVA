package com.kodnest.array.level2;
import java.util.*;
public class Program2 {
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter the array elements");
	for(int i=0;i<=arr.length-1;i++)
		arr[i]=scan.nextInt();
	ArrayPrint.ArrayPrin(arr);
	scan.close();
}
}
