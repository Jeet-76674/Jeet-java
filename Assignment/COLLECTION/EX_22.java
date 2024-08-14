package COLLECTION;

import java.util.ArrayList;
import java.util.HashSet;

/*Write a Java program to convert a hash set to an List/arraylist. */
public class EX_22 
{
	public static void main(String[] args) 
	{
		HashSet h21=new HashSet();
		h21.add(123);
		h21.add("jeet");
		h21.add('T');
		h21.add(88.45f);
		h21.add("First");
		
		ArrayList a22=new ArrayList(h21);
		System.out.println(a22);
		
	}
}
