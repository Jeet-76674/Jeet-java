package Module1;

import java.util.Scanner;

//Write a Java program to Take three numbers from the user and print the
//greatest number.
public class EX__01 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		System.out.println("Enter thierd number : ");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" Is Maximum.");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" Is Maximum.");
		}
		else
		{
			System.out.println(c+" Is Maximum.");
		}
		}
}
