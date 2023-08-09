import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		CalculatorApp calcu=new CalculatorApp();
		System.out.println("Hello Welcome to kodnest calculator");
		System.out.println("+ ---> addition");
		System.out.println("- ---> substraction");
		System.out.println("* ---> multiplication");
		System.out.println("/ ---> division");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ur choice");
		int ch=scan.nextInt();
		calcu.calculator(ch);
	}

}
