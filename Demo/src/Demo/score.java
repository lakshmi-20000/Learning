package Demo;
import java.util.Scanner;
public class score {
    public static void main(String[]args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your score");
		int score = scan.nextInt();
		GivenGrade g1= new GivenGrade();
		g1.score(score);
    }
}

		
