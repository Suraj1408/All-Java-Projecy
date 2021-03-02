package objectlevellock;

public class DemoMain {

	public static void main(String[] args) 
	{
		
		Demo1 demo1=new Demo1();
		
		Demo11 d1=new Demo11("hello",demo1);
		
		Demo11 d2=new Demo11("Suraj",demo1);
		
		Demo11 d3=new Demo11("Welcome",demo1);
		
		d1.start();
		d2.start();
		d3.start();
		
		Demo1 demo2=new Demo1();
		
		Demo11 d4=new Demo11("to Classes",demo2);
		
		Demo11 d5=new Demo11("Cjc",demo2);
		
		Demo11 d6=new Demo11("pune",demo2);
		
		d4.start();
		d5.start();
		d6.start();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
