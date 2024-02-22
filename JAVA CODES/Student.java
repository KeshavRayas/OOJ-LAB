package CIE;

import java.util.Scanner;

public class Student
{
	public String name,usn;
	public int sem;
	public void Accept()
	{
		Scanner s1 = new Scanner(System.in);
		name = s1.next();
		usn = s1.next();
		sem = s1.nextInt(); 
	}
	
	public void Display()
	{
		System.out.println("Student details:\n" + "Name: " + name + "\nUSN: " + usn + "\nSemester: " + sem);
	}
}