package string;

import java.util.Scanner;

/*• W.A.J.P to check whether a given string ends with the contents of another string. 
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 
import java.util.Scanner;*/

public class EX_08
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your 1st string : ");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		
		System.out.println("Enter your 2nd string to compare : ");
		String str2=sc.nextLine();
		System.out.print(str1+" starts with "+str2+" ? ");
		System.out.println(str1.endsWith(str2));
	}
}
