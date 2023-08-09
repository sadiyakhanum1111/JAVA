
public class ArmstrongNum {
public int Armstrong(int n) {
	int sum=0;
	while(n!=0) {
		int rem=n%10;
		sum=rem*rem*rem+sum;
		n=n/10;
	}
	return sum;
}
}
