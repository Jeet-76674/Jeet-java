package oops;

import java.util.Scanner;

/*• Write a program to print the factorial of a number by defining a method named 
'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*. 
*(n-1) *n.E.g.- 
4! = 1*2*3*4 = 24 
3! = 3*2*1 = 6         2! = 2*1 = 2               Also, 1! = 1           0! = 0*/
class Factorial1
{
	int n,fact=1;;
	public void factorial(int n)
	{
		this.n=n;
		for(int i=1;i<=n;i++)
		{
			if(i==n)
			{
				fact=fact*i;
				System.out.print(" "+i+" = "+fact);
			}
			else
			{
				System.out.print(" "+i);
				System.out.print(" *");
				fact=fact*i;
			}
		}
	}
}
public class EX_10
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Factorial1 f1=new Factorial1();
		System.out.print(n+"! =");
		f1.factorial(n);
	}
}
