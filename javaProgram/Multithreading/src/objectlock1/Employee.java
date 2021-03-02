package objectlock1;

public class Employee 
{
	
	
	synchronized public void display(String msg)
	{
		System.out.println("*");
		System.out.println(msg);
		System.out.println("*");
	}

}
