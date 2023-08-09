
public class Number {
        public static void div2(int n) {
        	System.out.println("the numbers divisible by 2 are");
        	for(int i=0;i<n;i++) {
        	if(i%2==0)
        		System.out.println(i);		
        }
   }
        public static void div3(int n){
        	System.out.println("the numbers divisible by 3 are");
        	for(int i=0;i<n;i++) {
        	if(i%3==0)
        		System.out.println(i);		
        }
   }
        public static void div5(int n){
        	System.out.println("the numbers divisible by 5 are");
        	for(int i=0;i<n;i++) {
        	if(i%5==0)
        		System.out.println(i);		
        }
    }
        public static void div25(int n){
        	System.out.println("the numbers divisible by 2 and 5 are");
        	for(int i=0;i<n;i++) {
        	if(i%2==0 && i%5==0)
        		System.out.println(i);		
        }
    }
        public static void div35(int n){
        	System.out.println("the numbers divisible by 3 and comes in table 5 are");
        	for(int i=0;i<n;i++) {
        	if(i%3==0 && i%5==0)
        		System.out.println(i);		
        }
    }
        public static int prime(int n){
        	for(int i=2;i<n;i++) {
        	        if(n%i==0)
        	        	return 0;
        	}
        	return n;
    }
        
        public static void even(int n) {
        	System.out.println("even numbers divisible by 3");
        	for(int i=0;i<n;i++) {
        	if(i%2==0) {
        		if(i%3==0)
        		System.out.println(i);		
        }
   }
        }
        public static void odd(int n){
        	System.out.println("all odd numbers divisible by 5");
        	for(int i=0;i<n;i++) {
        	if(i%2!=0) {
        		if(i%5==0)
        		System.out.println(i);		
        }
        	}
        }
}
        
