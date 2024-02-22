package CIE;

import java.util.Scanner;

public class Internals extends Student
{
	public int marks[] = new int[5];
	public void AcceptMarks()
	{
		Scanner s1 = new Scanner(System.in);
		for (int i=0; i<5; i++)
		{
			marks[i] = s1.nextInt();
		}
	}

	public void DisplayMarks()
	{
		for (int i=0; i<5; i++)
		{
			System.out.println("Marks obtained in CIE subject " + (i+1) + " is: " + marks[i]);
		}
	}
}