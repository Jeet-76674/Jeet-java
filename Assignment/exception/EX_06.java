package exception;

import java.util.Scanner;

/*• W.A.J.P to create the validate method that takes integer value as a parameter. If the 
age is less than 18, then throw an Arithmetic Exception otherwise print a message 
welcome to vote.
O/P- Enter your age: 16 
Exception in thread main java. Lang. Arithmetic Exception: not valid */
class AgeException
{
	int age;
	public void setData(int age)
	{
		this.age=age;
	}
	public void ageVerification()
	{
		if(age>=18)
		{
			System.out.println("welcome to vote.");
		}
		else
		{
			throw new ArithmeticException();
		}
	}
}

public class EX_06 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your age :");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		AgeException a1=new AgeException();
		a1.setData(age);
		try
		{
			a1.ageVerification();
		} catch (ArithmeticException e) 
		{
			System.out.print("Exception in thread main");
			e.printStackTrace();
		}
	}

}
