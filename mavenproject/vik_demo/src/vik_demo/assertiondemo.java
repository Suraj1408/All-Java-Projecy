package vik_demo;

public class assertiondemo {
	 void assertcheck(int a, int b)
	 {
		 assert b!=0:"The value of B can not be Zero";
		 double c=a/b;
		 System.out.println("Value of C="+c);
	 }
	public static void main(String arg[])
	{
		assertiondemo a = new assertiondemo();
		a.assertcheck(5,5);
	}

}
