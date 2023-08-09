
public class ReverseNum {
     public int reversenum(int n) {
    	 int sum=0;
    	 while(n!=0) {
    		 int rem=n%10;
    		 sum=sum*10+rem;
    		 n=n/10;
    		 
    	 }
    	 return sum;
     }
}
