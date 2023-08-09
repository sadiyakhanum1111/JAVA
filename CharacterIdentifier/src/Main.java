import java.util.*;;
public class Main {
	public static void identifyCharacter(char ch)

	{

	if(Character.isDigit(ch))
		System.out.println("it is a digit");
	else if(!Character.isLetter(ch)) 
		System.out.println("it is a special character");
	else
	{
		switch(Character.toLowerCase(ch))
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			if(Character.isLowerCase(ch))
				System.out.println("lower case vowel");
			else
				System.out.println("upper case vowel");
			break;
		default:
			if(Character.isLowerCase(ch))
				System.out.println("lower case consonent");
			else
				System.out.println("upper case consonent");
		}
	}
	}

	public static void main(String[] args)

	{
     Scanner scan=new Scanner(System.in);
     System.out.println("enter the input");
     char ch=scan.next().charAt(0);
     identifyCharacter(ch);
     scan.close();
	}
}
