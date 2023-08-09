import java.util.Scanner;

public class ArmstrongApp {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		ArmstrongNum num=new ArmstrongNum();
		int sum=num.Armstrong(n);
		if(sum==n)
			System.out.println("armstrong number");
		else
			System.out.println("not a armstrong number");
		scan.close();
	}
}
