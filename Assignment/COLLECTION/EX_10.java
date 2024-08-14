package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;

/*• Write a Java program to shuffle elements in an array list.*/

public class EX_10 
{
	public static void main(String[] args) 
	{
		ArrayList a10 =new ArrayList();
		a10.add(123);
		a10.add("jeet");
		a10.add('T');
		a10.add(88.45f);
		a10.add(0, "First");
		System.out.println("Original ArrayList : "+a10);
		Collections.shuffle(a10);//The Collections.shuffle method is used to shuffle the elements in the ArrayList.
		System.out.println("Shuffled ArrayList : "+a10);
	}
}
