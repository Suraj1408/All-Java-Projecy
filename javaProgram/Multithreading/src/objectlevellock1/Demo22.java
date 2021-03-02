package objectlevellock1;

public class Demo22 extends Thread
{
	
	String msg;
	Demo2 d2;
	
	public  Demo22(String msg,Demo2 d2)
	{
		this.d2=d2;
		this.msg=msg;
		
	}
	
	
	
	public void run()
	{
		d2.dislpay(msg);
	}
	
	

}
