package string;

import java.util.Scanner;

/*W.A.J.P to compare a given string to the specified character sequence. Comparing 
topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false*/
public class EX_07 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your 1st string : ");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		
		System.out.println("Enter your 2nd string : ");
		String str2=sc.nextLine();
		
		String st=new String();	
		if(str1.equals(str2))
		{
			System.out.println("True");
		}
		else
		{
			{
				System.out.println("False");
			}
		}
		
		}
}
