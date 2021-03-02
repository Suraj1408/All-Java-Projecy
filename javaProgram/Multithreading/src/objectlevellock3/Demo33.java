package objectlevellock3;

public class Demo33 extends Thread
{
	
	String msg;
	Demo3 d3;
	
	public Demo33(String msg,Demo3 d3)
	{
		this.msg=msg;
		this.d3=d3;
	}
	
	
	public void run()
	{
		d3.display(msg);
	}
	
	
	

}
