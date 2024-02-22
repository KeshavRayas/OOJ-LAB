abstract class Shape
{
	int a,b;
	abstract void printArea();
}

class Rectangle extends Shape
{
	Rectangle(int x, int y)
	{
		a=x;
		b=y;
	}
	void printArea()
	{
		System.out.println("The area of rectangle is " + (a*b));
	}
}

class Triangle extends Shape
{
	Triangle(int x, int y)
	{
		a=x;
		b=y;
	}
	void printArea()
	{
		System.out.println("The area of triangle is " + (a*b/2));
	}
}

class Circle extends Shape
{
	Circle(int r)
	{
		a=r;
	}
	void printArea()
	{
		System.out.println("The area of the circle is " + (3.14*a*a));
	}
}

class ShapeDemo
{
	public static void main (String XX[])
	{
		Rectangle r = new Rectangle(5,4);
		Triangle t = new Triangle(5,4);
		Circle c = new Circle(7);
		r.printArea();
		t.printArea();
		c.printArea();
	}
}