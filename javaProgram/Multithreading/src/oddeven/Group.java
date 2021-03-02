package oddeven;

public class Group extends Thread
{
	
	int st,end;
	
	public Group(int st,int end)
	{
		this.st=st;
		this.end=end;
	}
	
	
	public void run()
	{
		for(int i=st;i<=end;i++)
		{
			System.out.println(i+""+currentThread().getName());
			i++;
		}
	}
	

}
