package GalacaticArthemetic;
import java.util.*;

public class GalacaticArthemetic {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(galacticAddition(num1,num2));
		
	}
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}

}
