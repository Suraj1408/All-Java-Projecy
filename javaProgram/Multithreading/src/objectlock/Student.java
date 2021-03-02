package objectlock;

public class Student 
{
	
	synchronized public void display(String msg)
	{
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
	}
	

}
