package runable;

public class Test
{
	public static void main(String[] args) 
	{
		
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		t.start();
		for(int i=1;i<10;i++)
		{
			System.out.println("main"+i);
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
