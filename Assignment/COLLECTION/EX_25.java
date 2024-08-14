package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*• Write a Java program to replace the second element of an Array List with the 
specified element.  */
public class EX_25
{
	public static void main(String[] args) 
	{
		ArrayList a25 =new ArrayList();
		a25.add(123);
		a25.add("jeet");
		a25.add(88.45f);
		a25.add("First");
		
		System.out.println("Original ArrayList : "+a25);
		System.out.print("Enter element you want replace with 2nd elemet : ");
		Scanner sc=new Scanner(System.in);
		String newelement=sc.nextLine();
		
		a25.set(1, newelement);
		System.out.println("Updated ArrayList : "+a25);
	}
}
