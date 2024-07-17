package string;

import java.util.Scanner;

//• W.A.J.P to concatenate a given string to the end of another string.
public class EX_06
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First String : ");
		String str1=sc.nextLine();
		
		System.out.println("Enter your Second String : ");
		String str2=sc.nextLine();
		
		System.out.println("Concatenated String = "+str1+" "+str2);
	}
}
