package COLLECTION;

import java.util.HashSet;

/* • Write a Java program to get the number of elements in a hash set. */
public class EX_13 
{
	public static void main(String[] args) 
	{
		HashSet h2 = new HashSet();
		h2.add(1230);
		h2.add("jeet");
		h2.add(new Integer(100));
		h2.add('t');
		h2.add("jeet");
		System.out.println("number of total element in hash set = "+h2.size());
	}
}
