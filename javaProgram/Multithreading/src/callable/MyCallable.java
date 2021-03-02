package callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>
{
	int st,end,sum;
	
	public MyCallable(int st,int end)
	{
		this.st=st;
		this.end=end;
	}
	
	
	public Integer call()throws Exception
	{
		
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
			sum=sum+i;
			i++;
		}
		return sum;
	}

}
