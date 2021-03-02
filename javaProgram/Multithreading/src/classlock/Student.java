package classlock;

public class Student 
{
	
	synchronized static public void display(String msg)
	{
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
		
		System.out.println("*");
		System.out.println(msg);
		System.out.println("*");
	}
	
	
	

}
