package String;

import java.util.Scanner;
public class JoinerStringsApp{
    public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter FirstName SecondName");
		String FirstName= scan.next();
		String SecondName = scan.next();
		System.out.println(joinerString(FirstName, SecondName));

		
		
	}
	
	public static String joinerString( String str1 , String str2) {
		// TODO Auto-generated method stub
		return str1+" "+str2;
	}
	

}
  