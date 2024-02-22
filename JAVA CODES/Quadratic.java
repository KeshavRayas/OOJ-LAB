import java.util.Scanner;
import java.lang.Math;
class Quadratic
{
	public static void main(String XX[] )
	{
		System.out.println("Enter coefficients");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		float b=s1.nextFloat();
		float c=s1.nextFloat();
		if (a==0)
			System.out.println("Equation is not quadratic");
		float d=(b*b)-(4*a*c);
		if (d>0)
		{
			double root1 = (-b + Math.sqrt(d))/(2*a);
			double root2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("Real roots are: " + root1 + " and " + root2);
		}
		else if (d==0)
		{
			float root = (-b/2*a);
			System.out.println("Real and equal roots are: " + root + " " + root);
		}
		else
		{
			double root1 = (-b/2*a);
			double root2 = (Math.sqrt(Math.abs(d)))/(2*a);
			System.out.println("Imaginary roots are: " + root1 + "+" + "i" + root2 + " and " + root1 + "-" + "i" + root2);
		}
	}
}