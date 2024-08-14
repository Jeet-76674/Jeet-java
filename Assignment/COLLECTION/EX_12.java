package COLLECTION;

import java.util.HashSet;
import java.util.Iterator;

/* Write a Java program to iterate through all elements in a hash list*/
public class EX_12 
{
	public static void main(String[] args) 
	{
		HashSet h1 = new HashSet();
		h1.add(1230);
		h1.add("jeet");
		h1.add(new Integer(100));
		h1.add('t');
		h1.add("jeet");
		Iterator i1=h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
