package COLLECTION;
/*• Write a Java program to append the specified element to the end of a hash set. */

import java.util.HashSet;

public class EX_11 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		h1.add(122);
		h1.add("jeet");
		h1.add('T');
		h1.add(44.65f);
		System.out.println("Original HashSet : "+h1);
		String newitem = "Last";
		h1.add(newitem);
		System.out.println("Updated HashSet : "+h1);
	}
}
