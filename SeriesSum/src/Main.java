import java.util.*;
public class Main {
	public static void calculateSumOfSeries(int n)

	{
		double sum=1;
		for(int i=2;i<=n;i++) {
			sum=sum+(double)1/i;
		}
      System.out.println("the sum of series of "+n+" is "+sum);
	}

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the number");
      int n=scan.nextInt();
      calculateSumOfSeries(n);
	}
}
