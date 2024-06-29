package Module1;

import java.util.Scanner;

//Write a Java program that takes the user to provide a single character from
//the alphabet. Print Vowel or Consonant, depending on the user input. If the
//user input is not a letter (between a & z or A and Z), or is a string of length
//> 1, print an error message.


public class Ex_02 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Single character(between a & z or A and Z) : ");
		String a=sc.next();
		int l=a.length();
		if(l>1 || l<1)
		{
			System.out.println("!!!Enter Single Character ONLY!!!");
		}
		else
		{
			if(a=='a' || a == 'e'|| a == 'i'|| a == 'o'|| a == 'u'|| a == 'A'|| a == 'E'|| a == 'I'|| a == 'O'|| a == 'U' )
			{
				System.out.println("Its An Vowel");
			}
			else
			{
				System.out.println("Its Not An Vowel");
			}
		}
	}
}
