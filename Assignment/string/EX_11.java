package string;

import java.util.Scanner;

/*W.A.J.P to find the second most frequent character in a given string. The given string 
is: successes The second most frequent char in the string is: c*/
public class EX_11 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your string : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String st=new String();
		
		char[] a=new char[str.length()];
		/*NOW WE ASSIGN ALL CHARACTER OF STRING IN ARRAY*/
		for(int i=0;i<=str.length()-1;i++)
		{
			a[i]=str.charAt(i);
		}
//		for(int i=0;i<=str.length()-1;i++)
//		{
//			System.out.println(a[i]);
//		}
		/*NOW WE CREATE ANOTHER ARRAY IN WHICH WE ADD ALPHABETS FROM 
		  STRING AFTER REMOVING DUPLICATES*/
		char[] c=new char[35];
		int k=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			int flag=0;
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(a[i]==a[j])
				{
					flag=1;
				}
				
			}
			if(flag==0)
			{
				c[k]=a[i];
				k++;
			}
		}
		
//		for(int i=0;i<=34;i++)
//		{
//			if(c[i]!='\0')
//			{
//				
//				System.out.println(c[i]);
//			}
//		}
		int antiduplicatearraysize=0;
		for(int i=0;i<=34;i++)
		{
			if(c[i]!='\0')
			{
				antiduplicatearraysize++;
			}
		}
//		System.out.println(antiduplicatearraysize);
		
		/*now create array of same size of anti duplicate array in which we add count
		  of that latter in given string*/
		int[] ans=new int[antiduplicatearraysize];
		for(int i=0;i<antiduplicatearraysize;i++)
		{
			int l=0;
			for(int j=0;j<str.length();j++)
			{
				if(c[i]==a[j])
				{
					l++;
					continue;
				}
			}
			ans[i]=l;
		}
		
//		for(int i=0;i<antiduplicatearraysize;i++)
//		{
//			System.out.println(ans[i]);
//		}
		
		/*NOW WE ARRENGE ARRAY ANS IN DECENDING ORDER ALSO WE DO SWAPPING FOR ARRAY C
		   SO WE CAN USE BOTH ARRAY CORRESPONDIGLY*/
		
		for(int i=0;i<antiduplicatearraysize;i++)
		{
			for(int j=i+1;j<antiduplicatearraysize;j++)
			{
				if(ans[i]<ans[j])
				{
					/*SWAPPING OF ARRAY ANS*/
					int temp1=ans[i];
					ans[i]=ans[j];
					ans[j]=temp1;
					
					/*SWAPPING OF ARRAY C*/
					char temp2=c[i];
					c[i]=c[j];
					c[j]=temp2;
				}
			}
		}
		
		System.out.println("The Second most frequent char in the given string is :"+c[1]);
	}
}
