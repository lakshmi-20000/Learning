package String;

import java.util.Scanner;

public class JourneyCalculator {
	public static void main(String[] args)

	{

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter Speed And Time To Calculate Distance");

	double speed=scan.nextDouble();

	double time=scan.nextDouble();

	JourneyCalculator journeyCalculator=new JourneyCalculator();

	double distance=journeyCalculator.calculateDistance(speed, time);

	System.out.println(distance);

	}

	private double calculateDistance(double speed, double time) {
		// TODO Auto-generated method stub
		return speed*time;
	}

	}




