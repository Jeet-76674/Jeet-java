package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/*• Write a Java program to extract a portion of an array list. */
public class EX_17 
{
	public static void main(String[] args) 
	{
		ArrayList a17 =new ArrayList();
		a17.add(123);
		a17.add("jeet");
		a17.add('T');
		a17.add(88.45f);
		a17.add(0, "First");
		System.out.println("Original ArrayList : "+a17);
		int firstIndex=1;//inclusive
		int lastIndex=4;//exclusive
		
		List a171 =a17.subList(firstIndex, lastIndex);
		System.out.println();
		System.out.println("Extracted a portion of an array list : "+a171);
		
	}
}
