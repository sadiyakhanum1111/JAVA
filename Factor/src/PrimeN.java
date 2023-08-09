import java.util.Scanner;

public class PrimeN {
	public static void main (String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter N");
		int n=scan.nextInt();
		int flag=1;
		if(n<2)
		{
			System.out.println("not prime");
			return;
			
		}
		else {
			for(int i=2;i<n;i++) {
			if(n%i==0)
				flag=0;
		}
		}
		if(flag==0)
			System.out.println("not a prime");
		else
			System.out.println("prime");
		scan.close(); 
}
}

