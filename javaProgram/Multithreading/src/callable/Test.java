package callable;
import java.util.concurrent.*;

import runable.MyThread;
public class Test
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		
		MyThread mt=new MyThread();
		MyCallable odd=new MyCallable(1, 100);
		MyCallable even=new MyCallable(2,100);
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		Future ft=es.submit(odd);
		Future ft1=es.submit(even);
		
		es.submit(mt);
		
		System.out.println(ft.get());
		
		System.out.println(ft.get());
		
		
		
		
		// TODO Auto-generated method stubs

	}

}
