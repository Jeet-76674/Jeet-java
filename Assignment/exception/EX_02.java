package exception;

/*• Take two numbers from the user and perform the division operation and handle 
Arithmetic Exception. O/P- Enter two numbers: 10 0 Exception in thread 
main java.lang.ArithmeticException:/ by zero */
import java.util.Scanner;
public class EX_02
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
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}

