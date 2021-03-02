package objectlevellock1;

public class Demo2Main {

	public static void main(String[] args) 
	{
		
		Demo2 demo1=new Demo2();
		
		Demo22 d1=new Demo22("welcome",demo1);
		d1.start();
		Demo22 d2=new Demo22("back",demo1);
		d2.start();
		
		Demo22 d3=new Demo22("to",demo1);
		d3.start();
		
		Demo2 demo2=new Demo2();
		
		Demo22 d4=new Demo22("java",demo2);
		d4.start();
		Demo22 d5=new Demo22("Classes",demo2);
		d5.start();
		
		
		// TODO Auto-generated method stub

	}

}
