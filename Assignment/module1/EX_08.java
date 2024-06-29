package Module1;

import java.util.Scanner;

//Write a Java program that reads a positive integer and count the number of
//digits the number.
//Input an integer number less than ten billion: 125463 Number of digits in the
//number: 6
public class EX_08 
{
	public static void main(String[] args) 
	{
		int digit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input an integer number less than ten billion:");
		int a=sc.nextInt();
		
		while(a!=0)
		{
			a/=10;
			digit++;
			
		}
		System.out.println("Number of digits in the Number : "+digit);
	}
}
