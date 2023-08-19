package Grade;
import java.util.Scanner;
public class main {
	    public static void checkGrade(int grade)

		{
          if (grade>50) {
        	  System.out.println("Pass");
          }
          else
          {
        	  System.out.println("Fail");
          }
		// your code here

		}

		public static void main(String[] args)

		{
		  
         Scanner scan =new Scanner(System.in);
         int Grade = scan.nextInt();
		
		checkGrade(Grade);
		}

		}

		



