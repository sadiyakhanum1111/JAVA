import java.util.Scanner;

public class GcdApp {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the two numbers");
		int m=scan.nextInt();
		int n=scan.nextInt();
		//GCD gcd=new GCD();
		int res=GCD.findGcd(m, n);
		System.out.println("the gcd of"+m+"and "+n+"is "+res);
       scan.close();
	}
}
