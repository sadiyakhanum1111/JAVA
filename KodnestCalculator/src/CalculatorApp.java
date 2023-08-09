import java.util.*;
public class CalculatorApp {
	void  calculator(int ch) {
		Scanner scan=new Scanner(System.in);
	       void addition() {
			System.out.println("enter the two numbers for addition");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=a+b;
			System.out.println("addition:"+c);
		}
		case '-':
		{
			System.out.println("enter the two numbers for substraction");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=a-b;
			System.out.println("addition:"+c);
			break;
		}
		case '*':
		{
			System.out.println("enter the two numbers for multiplication");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=a*b;
			System.out.println("addition:"+c);
			break;
		}
		case '/':
		{
			System.out.println("enter the two numbers for division");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=a/b;
			System.out.println("addition:"+c);
			break;
		}
		case '!':
		{
			System.out.println("stoppedddd..........");
			break;
		}
		default:
			System.out.println("not a proper choice.................");
		}
	}

}
}