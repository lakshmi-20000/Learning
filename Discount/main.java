package Discount;
import java.util.Scanner;
public class main{
      public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double purchaseAmount= scan.nextDouble();
		checkDiscount(purchaseAmount);
	}
		// TODO Auto-generated constructor stub

	private static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount>100) {
			System.out.println("Discount Applicable");
		// TODO Auto-generated method stub
		
	}
	}


}
