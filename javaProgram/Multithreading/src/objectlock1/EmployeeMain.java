
package objectlock1;

public class EmployeeMain
{
	
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		
		EmployeeInfo ei1=new EmployeeInfo("suraj", e1);
		EmployeeInfo ei2=new EmployeeInfo("kranti", e1);
		
		ei1.start();
		ei2.start();
		
		Employee e2=new Employee();
		EmployeeInfo ei3=new EmployeeInfo("Kavya", e2);
		EmployeeInfo ei4=new EmployeeInfo("surya", e2);
  		
		
		ei3.start();
		ei4.start();
	}
	
	

}
