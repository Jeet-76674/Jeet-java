package Array;

import java.util.Scanner;

/*Write a java program to reverse a string and check that the string is palindrome or 
not.*/ 
public class EX_6 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your string : ");
		String str=sc.nextLine();
		
		StringBuffer s1=new StringBuffer(str);
		String str1=s1.reverse().toString();
		if(str1.equals(str))
		{
			System.out.println("given string is palindrome.");
		}
		else
		{
			System.out.println("given string is not palindrome.");
		}
	}
}
