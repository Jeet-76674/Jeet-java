package oops;
/*• Create a class named 'Member' having the following members: 
	1. Data members 
	2. Name 
	3. Age 
	4. Phone number 
	5. Address 
	6. Salary
	It also has a method named 'printSalary' which prints the salary of the members.*/
class Member
{
	String Name,Address;
	int age,salary;
	long pno;
	public void setData()
	{
		Name="jeet vinaykumar tetar";
		age=18;
		pno=635473828;
		Address = "ffghffhgfhgfhgfghfhgfghfghf";
		salary=1550000;
	}
	public void printSalary()
	{
		System.out.println("salary = "+salary);
	}
	
}
public class EX_03 
{
	public static void main(String[] args) 
	{
		Member s1=new Member();
		s1.setData();
		s1.printSalary();
	}
}
