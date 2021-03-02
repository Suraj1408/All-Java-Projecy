package objectlevellock3;

public class Demo3Main {

	public static void main(String[] args) 
	{
		
		
		Demo3 demo1=new Demo3();
	    Demo33 d1=new Demo33("suraj",demo1);
	    Demo33 d2=new Demo33("Gaikwad",demo1);
	    d1.start();
	    d2.start();
	    Demo3 demo2=new Demo3();
	    Demo33 d3=new Demo33("kavya",demo2);
	    Demo33 d4=new Demo33("gaikwad",demo2);
	    d3.start();
	    d4.start();
 
		
		// TODO Auto-generated method stub

	}

}
