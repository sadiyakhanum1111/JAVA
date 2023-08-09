package ArthemeticOperation;

public class ArthemeticOperation {
	public static void main(String[] args) {
		int a=subtractNumbers(20, 5);
		System.out.println(a);

		int b=multiplyNumbers(4, 5);
		System.out.println(b);

		double c=divideNumbers(20, 4);
		System.out.printf("%.2f\n ",c);

		int d=findRemainder(10, 3);
		System.out.println(d);
	}


	
	public static int subtractNumbers(int num1, int num2) {
		return (num1-num2);
	}

	public static int multiplyNumbers(int num1, int num2) {
		return (num1*num2);
	}

	public static double divideNumbers(int num1, int num2) {
		return (num1/num2);
	}

	public static int findRemainder(int num1, int num2)
	{
		return (num1%num2);
	}
}

