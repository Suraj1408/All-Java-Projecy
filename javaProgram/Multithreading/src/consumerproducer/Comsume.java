package consumerproducer;

public class Comsume extends Thread
{
	
	Comman c;
	public  Comsume(Comman c)
	{
		this.c=c;
	}
	
	public void run()
	{
		while(true)
		{
			int data=c.consume();
			System.out.println("conumer consume "+data);
			
			try 
			{
				sleep(1200);
			} 
			
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
