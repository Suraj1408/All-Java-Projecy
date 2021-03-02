package ProducerConsumer1;

public class Test {

	public static void main(String[] args) 
	{
		Comman c=new Comman();
		
		Consumer cs=new Consumer(c);
		Producer ps=new Producer(c);
		cs.start();
		ps.start();
		
		
		
		
	

	}

}
