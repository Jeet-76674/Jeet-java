package Module1;
//Write a Java program that takes a year from user and print whether that year
//is a leap year or not.
import java.util.Scanner;

public class EX_03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Year :");
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("Your year is an leap year");
		}
		else
		{
			System.out.println("your year is not an leap year");
		}
	}
}
