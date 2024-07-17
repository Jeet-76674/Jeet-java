package Array;

import java.util.Scanner;

public class EX_05
{
	public static void main(String[] args) 
	{
		int length=0;
		System.out.println("Enter your String : ");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char[] str1=new char[256];
		
		System.out.println(a.lastIndexOf(length));
		
		try
		{
			for(int i=0;i<200;i++)
			{
				if(a.charAt(i)!='\0')
				{
					str1[i]=a.charAt(i);
				}
			}
			for(int i=0;i<200;i++)
			{
				if(str1[i]!='\0')
				{
					length++;
				}
			}
			System.out.println("Lenth of given string is : "+length);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
