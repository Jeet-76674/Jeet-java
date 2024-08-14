package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;

/*Write a Java program of swap two elements in an array list. */
public class EX_19 
{
	public static void main(String[] args) 
	{
		ArrayList a19 =new ArrayList();
		a19.add(123);
		a19.add("jeet");
		a19.add('T');
		a19.add(88.45f);
		a19.add(0, "First");
		ArrayList a181 = a19;
		System.out.println("Original ArrayList : "+a19);
		Collections.swap(a181, 1, 3);;
		System.out.println("Shuffled ArrayList : "+a19);
	}
}
