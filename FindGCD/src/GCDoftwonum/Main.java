package GCDoftwonum;

import java.util.Scanner;

public class Main {
	public static void findGCD(int a, int b)

	{
    int a1=36,b1=60,temp,GCD=0;
    while(b1!=0) {
    	temp=b1;
    	b1=a1%b1;
    	a1=temp;
    }
    GCD=a1;
    System.out.println(GCD);
	// your code here

	}

	public static void main(String[] args)

	{
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();	
    findGCD(36, 60);

	}

	}

	


