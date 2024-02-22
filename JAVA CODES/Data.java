import java.util.Scanner;

import CIE.Student;
import CIE.Internals;
import SEE.Externals;

public class Data
{
	public static void main (String xx[])
	{
		int n;
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		n = s1.nextInt();
		CIE.Student data[] = new CIE.Student[n];
		CIE.Internals marks[] = new CIE.Internals[n];
		SEE.Externals smarks[] = new SEE.Externals[n];
		for (int i=0; i<n; i++)
		{
			data[i] = new CIE.Student();
			marks[i] = new CIE.Internals();
			smarks[i] = new SEE.Externals();
			System.out.println("Enter Student details: ");
			data[i].Accept();
			System.out.println("Enter CIE marks: ");
			marks[i].AcceptMarks();
			System.out.println("Enter SEE marks: ");
			smarks[i].SEEAcceptMarks();
		}
		for (int i=0; i<n; i++)
		{
			data[i].Display();
			marks[i].DisplayMarks();
			smarks[i].SEEDisplayMarks();
		}
	}
}