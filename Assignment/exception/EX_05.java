package exception;

/*• W.A.J. P to demonstrate try catch block, take two numbers from the user by 
Command line argument and perform the division operation and handle Arithmetic 
O/P- 
Exception in thread main java. Lang. Arithmetic Exception:/ by zero */
import java.util.Scanner;
public class EX_05
{

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your value A : ");
			int a=sc.nextInt();
			System.out.println("Enter your value B : ");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Divition is "+c);
			System.out.println("Now Program is completed..");		
		}catch(ArithmeticException e) 
		{
			e.printStackTrace();
		}
	}
}

