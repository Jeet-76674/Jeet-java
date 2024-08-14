package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;

/*• Write a Java program to reverse elements in an array list.*/ 
public class EX_16 
{
	public static void main(String[] args) 
	{
		ArrayList a16 =new ArrayList();
		a16.add(123);
		a16.add("jeet");
		a16.add('T');
		a16.add(88.45f);
		a16.add(0, "First");
		System.out.println("Original ArrayList : "+a16);
		Collections.reverse(a16);
		System.out.println("Reversed ArrayList : "+a16);
	}
}
