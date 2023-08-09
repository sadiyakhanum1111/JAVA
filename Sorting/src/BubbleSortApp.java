import java.util.Scanner;

public class BubbleSortApp {
	public static void main(String []args ) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("array elements are....");
		for (int x :arr)
			System.out.println(x+" ");
		BubbleSort sort=new BubbleSort();
		sort.bubblesort(arr);
		System.out.println("array elements are after sorting....");
		for (int x :arr)
			System.out.println(x+" ");
	}
}
