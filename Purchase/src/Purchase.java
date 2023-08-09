import java.util.Scanner;

public class Purchase {
	public static void checkDiscount(double purchaseAmount)

	{
	if(purchaseAmount>100)
		System.out.println("discount applicable");

	}

	public static void main(String[] args)

	{
        Scanner scan=new Scanner(System.in);
        System.out.println("enter purchase amount");
        double amount=scan.nextDouble();
        checkDiscount(amount);
        scan.close();
	}
}
