class BMSThread implements Runnable
{
	public void run()
	{
		while (true)
		{
			try
			{
				System.out.println("BMS College of Engineering");
				Thread.sleep(10000);
			}
			catch (InterruptedException ie)
			{
				System.out.println("BMS Thread is interrupted");
			}
		}
	}
}

class CSEThread implements Runnable
{
	public void run()
	{
		while (true)
		{
			try
			{
				System.out.println("CSE");
				Thread.sleep(2000);
			}
			catch (InterruptedException ie)
			{
				System.out.println("CSE Thread is interrupted");
			}
		}
	}
}

public class Display
{
	public static void main(String[] args)
	{
		Thread bms = new Thread(new BMSThread());
		Thread cse = new Thread(new CSEThread());
		bms.start();
		cse.start();
	}
}