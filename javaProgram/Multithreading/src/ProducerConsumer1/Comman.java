package ProducerConsumer1;

import java.beans.IntrospectionException;

import javax.sql.rowset.spi.SyncResolver;

public class Comman 
{
	
	private static int value;
	private boolean flag=true;
	
	
	public synchronized void produce(int i)
	{
		
		if(flag)
		{
			value=i;
			System.out.println(value);
			flag=false;
			notify();
		}
		else
		{
			try
			{
				wait();
			}
			catch (InterruptedException e) 
			{
				System.out.println(e.getMessage());
			//	e.printStackTrace();
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
			  
			  catch (InterruptedException e) 
			  {
				System.out.println(e.getMessage());
			  }			
		}
		
			flag=true;
			notify();	
		   return value;
		
	}




	
	
	
	
	

}
