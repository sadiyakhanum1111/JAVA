import java.util.*;
/*
 * @author sadiya khanum
 *  
 */
public class Main {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		Number.div2(n);
		Number.div3(n);
		Number.div5(n);
		Number.div25(n);
		Number.div35(n);
		int count = 0;
		for(int i=3;i<=n;i++) {
		  int res=Number.prime(i);
	     	if(res!=0) {
		     	System.out.println(res);
		     	count++;
	     	}
	}
    System.out.println("the total number of prime numbers are "+count);
    Number.even(n);
    Number.odd(n);
}
}