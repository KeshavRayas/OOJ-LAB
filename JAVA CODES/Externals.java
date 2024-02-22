package SEE;

import CIE.Student;

import java.util.Scanner;

public class Externals extends CIE.Student
{
	public int see_marks[] = new int[5];
	public void SEEAcceptMarks()
	{
		Scanner s1 = new Scanner(System.in);
		for (int i=0; i<5; i++)
		{
			see_marks[i] = s1.nextInt();
		}
	}

	public void SEEDisplayMarks()
	{
		for (int i=0; i<5; i++)
		{
			System.out.println("Marks obtained in SEE subject " + (i+1) + " is: " + see_marks[i]);
		}
	}
}