
package classlock;

public class StudentMain 
{
	public static void main(String[] args)
	{
		
		
		Student s1=new Student();
		StudentInfo si1=new StudentInfo("suraj", s1);
		StudentInfo si2=new StudentInfo("kranti",s1);
		StudentInfo si3=new StudentInfo("Kamble", s1);
		
		
		si1.start();
		si2.start();
		si3.start();
		
		
		Student s2=new Student();
		
		StudentInfo si4=new StudentInfo("Surya", s2);
		StudentInfo si5=new StudentInfo("kavya", s2);
		si4.start();
		si5.start();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
