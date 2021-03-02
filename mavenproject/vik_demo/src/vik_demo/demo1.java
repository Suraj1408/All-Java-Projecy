package vik_demo;

public class demo1 {
	public static void main(String args[])
	{
		int x=0,y=0;
		
		if(++x>=0&&++y>0)
		{
			System.out.println("X="+x);
			++x;
			System.out.println("X="+x);
		}
		System.out.println("x="+x);
		System.out.println(y+x);
	}

}
