package com.kodnest.array.level2;

public class ArrayPrint {
public static void ArrayPrin(int arr[]) {
	System.out.println("array in forward direction....");
	for(int i=0;i<=arr.length-1;i++)
		System.out.println(arr[i]+" ");
	
	System.out.println("array in backward direction....");
	for(int j=arr.length-1;j>=0;j--)
		System.out.println(arr[j]+" ");
}
}
