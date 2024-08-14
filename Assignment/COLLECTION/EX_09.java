package COLLECTION;

import java.util.ArrayList;

/*• Write a Java program to copy one array list into another.*/

public class EX_09 
{
	public static void main(String[] args) 
	{
		ArrayList a9_1 =new ArrayList();
		a9_1.add(123);
		a9_1.add("jeet");
		a9_1.add('T');
		a9_1.add(88.45f);
		a9_1.add(0, "First");
		System.out.println("Original ArrayList : "+a9_1);
		ArrayList a9_2 =new ArrayList();
		a9_2=(ArrayList)a9_1.clone();
		System.out.println("Copied ArrayList : "+a9_2);
		
	}
}
