package ProducerConsumer1;

public class Consumer extends Thread
{
	
	 Comman c;


	public Consumer(Comman c)
	{
		this.c=c;
	}
	
	
	public void run()
	{
		while(true)
		{
	         int data=c.consume();
			  try
			  {
				sleep(1200);
			}
			 catch (InterruptedException e)
			{
				
				e.printStackTrace();
			} 
		}
        
	}
	
	
	

}
