import java.util.Scanner;
public class Arthmetic {
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
    System.out.println(num1-num2);
    System.out.println(num1*num2);
    System.out.println(num1/num2);
    System.out.println(num1%num2);
	}
public static int subtractNumbers(int num1, int num2) {
	return num1- num2;
	
}
public static int multiplyNumbers(int num1, int num2) {
	return num1*num2;
	
}
public static int double divideNumbers(int num1, int num2) {
	return num1*num2;
}
public static int findRemainder(int num1, int num2){
	return num1%num2;

}
}



