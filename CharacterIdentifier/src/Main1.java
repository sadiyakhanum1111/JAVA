
import java.util.Scanner;
public class Main1 {
	public static void identifyCharacter(char ch)

	{

	// your code here
		if(Character.isDigit(ch)) {
			System.out.println("Digit");
		}
		else if(Character.isLowerCase(ch)) {
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("lower-case vowel");
			}
			else {
			System.out.println("lower-case consonant");
			}
		    }
		else if(Character.isUpperCase(ch)) {
			if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.println("Upper-case vowel");
			}
			else {
			System.out.println("Upper-case consonant");
		    }
		}
		else {
			System.out.println("special character");
		}
	}

	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any character");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	}

}