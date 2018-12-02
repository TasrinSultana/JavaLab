package main;
import java.util.Scanner;

public class SpeedCalculator {

	public double Speed(double m) {
		//Scanner input = new Scanner(System.in);
		double t = 60.0;
		double r = 3.0;
		double max_v;
		//System.out.println("Enter the value of mass : ");
		//double m = input.nextDouble();
		//input.close();
		double v = (t * r) / m;
		v = Math.sqrt(v);
		
		
		if(v >= 40.0)
			max_v = 40.0;
		else if(v >= 20.0)
			max_v = 20.0;
		else if(v >= 10.0)
			max_v = 10.0;
		else if(v >= 1.0)
			max_v = 1.0;
		else
			max_v = 0.0;
		
		//System.out.println("Greatest speed : " + max_v);
		return max_v;
		
		

	}

}
