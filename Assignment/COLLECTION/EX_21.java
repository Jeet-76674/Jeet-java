package COLLECTION;

import java.util.HashSet;

/*Write a Java program to convert a hash set to an array. */
public class EX_21 
{
	public static void main(String[] args) 
	{
		HashSet h21=new HashSet();
		h21.add(123);
		h21.add("jeet");
		h21.add('T');
		h21.add(88.45f);
		h21.add("First");
		h21.toArray();
		System.out.println(h21);
		
	}
}
