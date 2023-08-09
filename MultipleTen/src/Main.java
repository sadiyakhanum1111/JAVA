import java.util.Scanner;

public class Main {
	 public static void checkMultipleOfTen(int n,int a) { 
		 if(n%a==0) {
			 System.out.println(n+" is a multiple of"+a);
		 }
		 else
			 System.out.println(n+" is not a multiple of  "+a);
		 }
		 public static void main(String[] args) { 
			 Scanner scan =new Scanner(System.in);
			 System.out.println("enter the two number");
			 int n=scan.nextInt();
			 int a=scan.nextInt();
			 checkMultipleOfTen(n,a);
			 scan.close();
		 }
		 
	 }


