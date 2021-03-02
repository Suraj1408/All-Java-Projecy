package objectlevellock;
import java.util.*;
public class Demo11 extends Thread
{
	
	String msg;
	
	Demo1 d;
	
	public Demo11(String msg,Demo1 d)
	{
		this.d=d;
		this.msg=msg;
		
	}
	
	public void run()
	{
		d.show(msg);
	}
	
	

}
