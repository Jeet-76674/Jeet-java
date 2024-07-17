package exception;

/*• W.A.J. P to demonstrate try catch block*/
import java.util.Scanner;
public class EX_01
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

