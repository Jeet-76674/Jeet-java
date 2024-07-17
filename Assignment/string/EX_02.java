package string;

import java.util.Scanner;

/*Write a Java program to print the ASCII value of a given character.*/
public class EX_02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your charcter : ");
		char c=sc.next().charAt(0);
		int asc=c;
		System.out.println("ASCII value of your character : "+asc);
	}
}
