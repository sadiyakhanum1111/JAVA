import java.util.*;
public class Main {
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number of fibnocci series you want to print ");
	int n=scan.nextInt();
	Fibnocci.fibnocci(n);
	scan.close(); 
}

}
