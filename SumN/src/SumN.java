import java.util.*;
public class SumN {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int sum=0;
		System.out.println("the sum of "+n+" natural numbers are");
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		scan.close();
	}

}
