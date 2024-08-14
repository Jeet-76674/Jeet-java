package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;


/*• Write a Java program to iterate through all elements in an array list.*/

public class EX_02 
{
	public static void main(String[] args) 
	{
		ArrayList a2=new ArrayList();
		a2.add(123);
		a2.add("jeet");
		a2.add('T');
		a2.add(88.45f);
		
		Iterator i1 = a2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
