package Module1;

import java.util.Scanner;

//Write a program in Java to input 5 numbers from keyboard and find their sum
//and average using for loop.
public class EX_05
{
	public static void main(String[] args) 
	{
		int sum=0;
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Your "+(i+1)+" Number : ");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		int avg=sum/5;
		System.out.println("Sum Of Given 5 number is : "+sum);
		System.out.println("Average Of Given 5 number is : "+avg);
	}
}
