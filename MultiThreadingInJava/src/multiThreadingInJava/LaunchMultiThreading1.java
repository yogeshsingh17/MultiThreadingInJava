package multiThreadingInJava;

class Consumer extends Thread
{
	public void run()
	{
		try
		{
			
			for(int i=0;i<=10;i++)
			{
				System.out.println("This is the consumer");
				//Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("The exception has been handled in consumer class");
		}
	}
}

class Producer extends Thread
{
	public void run()
	{
		try
		{
			//Thread.sleep(3000);
			for(int i=0;i<10;i++)
			{
				System.out.println("This is the producer");
			}
		}
		catch(Exception e)
		{
			System.out.println("The exception has been handled");
		}
	}
}

public class LaunchMultiThreading1 
{

	public static void main(String[] args) 
	{
		Consumer c=new Consumer();
		c.run();
		
		Producer p=new Producer();
		p.run();
	}

}
