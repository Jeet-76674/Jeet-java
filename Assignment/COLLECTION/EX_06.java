package COLLECTION;

import java.util.ArrayList;

/*• Write a Java program to remove the third element from an array list*/

public class EX_06 
{
	public static void main(String[] args) 
	{
		ArrayList a6 =new ArrayList();
		a6.add(1);
		a6.add(2);
		a6.add(3);
		a6.add(4);
		a6.add(5);
		a6.add(6);
		System.out.println("ArrayList before update : "+a6);
		a6.remove(2);
		System.out.println("ArrayList After removing third element : "+a6);
	}
}
