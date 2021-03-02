package objectlevellock3;

public class Demo3 //implements Runnable 
{
	
	
	
	
	synchronized static public void display(String msg)
	{
		/*synchronized (msg) 
		{
			System.out.println("*");
			System.out.println(msg);
			System.out.println("*");
			System.out.println("[");
			System.out.println(msg);
			System.out.println("]");
			
		}
		*/
		System.out.println("*");
		System.out.println(msg);
		System.out.println("*");
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
		
	}
	
	

}
