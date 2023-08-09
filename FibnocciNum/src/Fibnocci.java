
public class Fibnocci {
	public static void fibnocci(int n) {
		int f1=0;
		int f2=1;
		if(n==0)
			System.out.println(f1);
		else if(n==1) {
			System.out.println(f1+" "+f2);
			}
		else
		{
			System.out.println("the fibnocci series of "+n+"                      is");
			System.out.print(f1+" ");
			System.out.print(f2+" ");
			for(int i=3;i<=n;i++)
			{
				int nextnum=f1+f2;
				System.out.print(nextnum+" ");
				f1=f2;
				f2=nextnum;
			}
		}
	}

}
