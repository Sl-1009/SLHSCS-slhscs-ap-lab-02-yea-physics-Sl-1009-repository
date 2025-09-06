import static java.lang.System.*;
import java.util.Scanner;
public class Physics {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		out.println("Please enter the velocity:");
		double v=input.nextDouble();
		out.println("Please enter the angle:");
		double a=input.nextDouble();
		
		double distance;
		distance=calculateDistance(v,a);
		String formattedDistance=String.format("%.3f", distance);
		out.print("distance="+formattedDistance+" meters");
	}
	public static double calculateDistance (double x, double y)
	{
		final double g=9.81;
		y=Math.PI/180*y;
		double d=(Math.pow(x, 2)*Math.sin(y*2))/g;
		return d;
	}
}
