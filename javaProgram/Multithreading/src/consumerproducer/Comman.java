package consumerproducer;

import java.io.UncheckedIOException;

public class Comman extends Thread
{
	
	private static int value;
	
	private boolean flag=true;
	
	public synchronized void produce(int i)
	{
		if(flag)
		{
			value=i;
			System.out.println("producer produce "+value);
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
			catch(InterruptedException e1)
			{
				System.out.println(e1.getMessage());
			}
		}
		flag=true;
		notify();
		return value;
	}
		
}

