package ProducerConsumer1;

public class Producer extends Thread
{
	Comman c;
	public Producer(Comman c)
	{
		this.c=c;
	}
	
	public void run()
	{

		int i=1;
		
		while(i<10)
		{
			c.produce(i);
			i++;
			try 
			{
				sleep(1200);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
		}
		
      i++;
	
	
	}
	

}
