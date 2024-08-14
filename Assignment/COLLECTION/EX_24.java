package COLLECTION;

import java.util.ArrayList;

/*• Write a Java program to increase the size of an array list. */
public class EX_24 
{
	public static void main(String[] args)
	{
		ArrayList a24 =new ArrayList();
		a24.add(123);
		a24.add("jeet");
		a24.add('T');
		a24.add(88.45f);
		a24.add("First");
		System.out.println("default size = "+a24.size());
		a24.ensureCapacity(10);
		a24.add(123);
		a24.add("jeet");
		System.out.println("new size = "+a24.size());
	}
}
