package com.kodnest.level4;

public class Pattern7 {
	public static void main(String []args) {
		for(int j=1;j<=5;j++) {
		for(int i=1;i<=j;i++) {
			System.out.print(" ");
		}
		for(int i=1;i<=j;i++) {
			System.out.print("*");
		}
	
		System.out.println();
		}
		for(int j=4;j>=1;j--) {
			for(int i=1;i<=j;i++) {
				System.out.print(" ");
			}
			for(int i=1;i<=j;i++) {
				System.out.print("*");
			}
		
			System.out.println();
			}
	}
}
