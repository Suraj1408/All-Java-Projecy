package oddeven;

public class Charector extends Thread
{
	
	char st,end;
	
	public Charector(char st,char end)
	{
		this.st=st;
		this.end=end;
	}
	
	public void run()
	{
		for(char i=st;i<=end;i++)
		{
			//System.out.println(i+" "+currentThread().getPriority());
			System.out.println(i+""+currentThread().getName());
			
		}
	}
	

}
