import java.util.*;
public class Main {
	public static void getProduct(String productCode)

	{
      switch(productCode)
      {
      case "P01":{
    	  System.out.println("coca cola");
    	  break;
      }
      case "P02" :{
    	  System.out.println("fanta");
    	  break;}
      case "P03":
    	  System.out.println("mazaa");{
    		  break;
    	  }
       default:
    	  System.out.println("pepsi");
      }
	}

	public static void main(String[] args)

	{
     Scanner scan=new Scanner(System.in);
     System.out.println("enter the product code");
     System.out.println("PO1-----------> coca cola \n PO2----------->fanta \n PO3------------->maaza \n PO4------------>pepsi");
     String productCode=scan.nextLine();
     getProduct(productCode);
     
	}
}
