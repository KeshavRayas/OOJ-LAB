import java.util.Scanner;

class Book
{
	String name, Author;
	int price,num_pages;
	Book()
	{};
	Book(String name,String Author,int price, int num_pages)
	{
		this.name=name;
        	this.Author=Author;
        	this.price=price;
        	this.num_pages=num_pages;
	}
	void set()
	{
		System.out.println("\nEnter Details of Book: ");
		Scanner S1= new Scanner(System.in);
		System.out.println("Name: ");
		name = S1.next();
		System.out.println("Author: ");
		Author = S1.next();
		System.out.println("Price: ");
		price = S1.nextInt();
		System.out.println("Number of Pages: ");
		num_pages= S1.nextInt();
	}
	void get()
	{
        	System.out.println("\nName: " + name + "\nAuthor: " + Author + "\nPrice: " + price + "\nNumber of Pages: " + num_pages + "\n");

	}
	public String toString()
	{
		return ("\nName: " + name + "\nAuthor: " + Author + "\nPrice: " + price + "\nNumber of Pages: " + num_pages + "\n");
	}
}

class BookDemo
{
	public static void main (String[] args) 
	{
		int n;
        	Scanner S= new Scanner(System.in);
        	System.out.print("Number of Books: ");
        	n=S.nextInt();
        	Book B[] = new Book[n];
        	B[0] = new Book("cant_hurt_me","David_googins",700,360);
        	B[0].get();
		for (int i=1; i<n; i++)
		{
			B[i] = new Book();
			B[i].set();
		}
		for (int i=1; i<n; i++)
		{
			B[i].get();
		}
	}
}
