class WrongAgeException extends Exception 
{
	WrongAgeException(String message) 
	{
        	super(message);
	}
}

class Father 
{
	private int age;
	public Father(int age) throws WrongAgeException 
	{
        	if (age < 0) 
		{
			throw new WrongAgeException("Age cannot be negative");
        	}
        	this.age = age;
	}
	public int getAge() 
	{
        	return age;
	}
}

class Son extends Father 
{
	private int sonAge;
	public Son(int fatherAge, int sonAge) throws WrongAgeException 
	{
		super(fatherAge);
        	if (sonAge >= fatherAge) 
		{
			throw new WrongAgeException("Son's age should be less than Father's age");
        	}
		this.sonAge = sonAge;
	}
	public int getSonAge() 
	{
        	return sonAge;
	}
}

class ExceptionDemo 
{
	public static void main(String[] args) 
	{
        	try 
		{
			Father father = new Father(45);
			Son son = new Son(father.getAge(), 20);
			System.out.println("Father's age: " + father.getAge());
			System.out.println("Son's age: " + son.getSonAge());
        	} 
		catch (WrongAgeException e) 
		{
			System.out.println("Exception: " + e.getMessage());
        	}
	}
}