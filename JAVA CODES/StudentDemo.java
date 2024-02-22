import java.util.Scanner;
class Student
{
	String USN , name;
	Scanner S1= new Scanner(System.in);
	int size = S1.nextInt();
	float credits[] =  new float[size];
	float marks[] =  new float[size];
	void accept()
	{
		System.out.println("Enter USN:");
		USN= S1.next();
		System.out.println("Enter Name:");
        	name= S1.next();
        	System.out.println("Marks in the following subjects are 1.Maths 2.Physics 3.C 4.Python 5.Kannada 6.IDT 7.Electronics 8.English");
        	for(int i=0;i<size;i++)
		{
			System.out.print((i+1)+". ");
			marks[i]= S1.nextInt();
		}
        	System.out.println("Respective credits of subjects are 1.Maths 2.Physics 3.C 4.Python 5.Kannada 6.IDT 7.Electronics 8.English");
        	for(int i=0;i<size;i++)
		{
			System.out.print((i+1)+". ");
			credits[i]= S1.nextInt();
        	}
	}
	void display()
	{
        	System.out.println("USN: "+USN+" Name: "+name);
        	System.out.println("Marks and credits in the following subjects are 1.Maths 2.Physics 3.C 4.Python 5.Kannada 6.IDT 7.Electronics 8.English");
        	for(int i=0;i<size;i++)
		{
			System.out.println((i+1)+". marks = "+marks[i]+" credits="+credits[i]+" ");
        	}
	}
	int gpa(int i)
	{
		if(marks[i]>=90) 
			return 10;
		else if(marks[i]>=80 && marks[i]<=89) 
			return 9;
		else if(marks[i]>=70 && marks[i]<=79) 
			return 8;
		else if(marks[i]>=60 && marks[i]<=69) 
			return 7;
		else if(marks[i]>=50 && marks[i]<=59) 
			return 6;
		else if(marks[i]>=40 && marks[i]<=49) 
			return 5;
		else if(marks[i]>=80 && marks[i]<=89) 
			return 4;
		else 
			return 0;
	}
    
	float sgpa()
	{
        	float SGPA , sum=0;
        	for(int i=0;i<size;i++)
		{
			sum=sum+gpa(i)*credits[i];
        	}
        //total credits=20
        SGPA = sum/20;
        return SGPA;
	}
}

class StudentDemo
{
	public static void main (String[] args) 
	{
		student S1 = new student();
		S1.accept();
		S1.display();
		float Ans; 
		Ans = S1.sgpa();
		System.out.println("SGPA of the student is : " + Ans);
        }
}
