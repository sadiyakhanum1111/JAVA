import java.util.*;
public class Factorial {
public static void main (String []args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter N");
	int n=scan.nextInt();
	int f=1;
	for(int i=1;i<=n;i++) {
		f=f*i;
	}
     scan.close();
	System.out.println("factorial of "+n+" is "+f);
}
}
