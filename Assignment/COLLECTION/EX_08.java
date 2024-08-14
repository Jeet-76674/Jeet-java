package COLLECTION;

import java.util.ArrayList;

/*• Write a Java program to sort a given array list*/
public class EX_08 
{
	public static void main(String[] args) 
	{
		ArrayList a8 =new ArrayList();
		a8.add(2);
		a8.add(6);
		a8.add(5);
		a8.add(1);
		a8.add(4);
		a8.add(3);
		System.out.println("ArrayList Before recent update : "+a8);
		a8.sort(null);
		System.out.println("ArrayList After sorting : "+a8);
	}
}
