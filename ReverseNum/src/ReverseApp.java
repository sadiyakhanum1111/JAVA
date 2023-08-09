import java.util.*;
public class ReverseApp {
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	ReverseNum num=new ReverseNum();
	int sum=num.reversenum(n);
	System.out.println("the reverse of "+n+" is "+sum);
	scan.close();
	if(sum==n)
		System.out.println("palindrome");
	else
		System.out.println("not a palindrome");
	}
}
