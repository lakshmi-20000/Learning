package String;

import java.util.Scanner;

public class TemperatureConvertorApp{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Fahrenheit temperature and celcius temperature");
		double fahrenheit = scan.nextDouble();
		double celcius =scan.nextDouble();
		TemperatureConvertor temperatureConvertor = new TemperatureConvertor();
		System.out.println((temperatureConvertor.convertFahrenheitToCelcius(68.0)));
	}
	public class TemperatureConvertor{


		public double convertFahrenheitToCelcius(double fahrenheit) {
			
			return c= (F-32)*5/9;
			 

}
}
}