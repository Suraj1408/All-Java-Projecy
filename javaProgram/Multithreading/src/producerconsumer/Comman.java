package producerconsumer;

public class Comman extends Thread
{
	
	
	public static int value;
	private boolean flag=true;
	
	
	public synchronized void produce(int i)
	{
		if(flag)
		{
			value=i;
			System.out.println("producer produce"+value +" "+"unit");
			flag=false;
			notify();
		}
		else
		{
			try
			{
			  wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	
	public synchronized int consume()
	{
		if(flag)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
		flag=true;
		notify();
		return value;
	}
	

}
