package consumerproducer;

import java.util.function.Consumer;

public class Test
{

	public static void main(String[] args) 
	{
		
		Comman c=new Comman();
		
		Producer ps=new Producer(c);
		Comsume cs=new Comsume(c);
		ps.start();
		cs.start();
		
		
	}
		

}
