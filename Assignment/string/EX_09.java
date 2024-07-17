package string;

import java.util.Scanner;

/*• W.A.J.P to check whether a given string starts with the contents of another string. 
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts 
with Red? False I3.*/

public class EX_09
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your 1st string : ");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		
		System.out.println("Enter your 2nd string to compare : ");
		String str2=sc.nextLine();
		System.out.print(str1+" starts with "+str2+" ? ");
		System.out.println(str1.startsWith(str2));
	}
}