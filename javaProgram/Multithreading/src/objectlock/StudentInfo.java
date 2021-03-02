package objectlock;

public class StudentInfo extends Thread
{
	
	String msg;
	Student s;
	
	public  StudentInfo(String msg,Student s)
	{
		this.msg=msg;
		this.s=s;
		// TODO Auto-generated constructor stub
	}
	
	public void run()
	{
		s.display(msg);
	}
	
	
	

}
