package objectlock;

public class StudentMain 
{
	
	
	public static void main(String[] args)
	{
		
		
		Student s1=new Student();
		
		StudentInfo si1=new StudentInfo("suraj",s1);
		StudentInfo si2=new StudentInfo("kranti",s1);
		
		si1.start();
		si2.start();
		
		Student s2=new Student();
		StudentInfo si3=new StudentInfo("surya",s2);
		StudentInfo si4=new StudentInfo("kavya", s2);
		
		
		
		si3.start();
		si4.start();
		
		
		
		
		
	}

}
