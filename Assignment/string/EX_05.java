package string;

import java.util.Scanner;

/*• W.A.J.P to get the character at the given index within the String. Original String = 
Tops Technologies! The character at position 0 is T, The character at position 10 is 
o */
public class EX_05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String : ");
		String str=sc.nextLine();
		System.out.println("Enter your index : ");
		int index=sc.nextInt();
		String s1=new String(str);
		System.out.println("The character at position "+index+" is "+s1.charAt(index));
	}
}
