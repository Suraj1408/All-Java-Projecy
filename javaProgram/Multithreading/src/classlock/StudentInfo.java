package classlock;

public class StudentInfo extends Thread
{
	String msg;
	Student s;
	
     public StudentInfo(String msg,Student s)
	{
		this.s=s;
		this.msg=msg;
	}
	
	public void run()
	{
		s.display(msg);
	}
	

}
