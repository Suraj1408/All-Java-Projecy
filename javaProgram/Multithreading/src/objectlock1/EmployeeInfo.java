package objectlock1;

public class EmployeeInfo extends Thread
{
	
	
	String msg;
	Employee e;
	
	public EmployeeInfo(String msg,Employee e)
	{
		this.e=e;
		this.msg=msg;
	}
	
	
	public void run()
	{
		e.display(msg);
	}

}
