package string;
//Write a Java program to count the letters, spaces, numbers and other
//characters of an input string

import java.util.Scanner;

public class EX_01
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String str=sc.nextLine();
		int l = str.length();
		int i=0;
		int s=0,al=0,n=0,o=0;
		while(i<=l-1)
		{
			char b=str.charAt(i);
			
//			while( b!='\0')
//			{
				int asc=(int)b;
				if(b==' ')
				{
					s++;
				}
				else if(asc>=48 && asc<=57)
				{
					n++;
				}
				else if(asc>=65 && asc<=90 || asc>=97 && asc<=122)
				{
					al++;
				}
				else
				{
					o++;
				}
			//}
			i++;
		}
		System.out.println("Number of letters in string = "+al);
		System.out.println("Number of space in string = "+s);
		System.out.println("Number of numbers in string = "+n);
		System.out.println("Number of other character in string = "+o);

	}
}
