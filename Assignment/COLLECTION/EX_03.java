package COLLECTION;

import java.util.ArrayList;

/*• Write a Java program to insert an element into the array list at the first position. 
*/
public class EX_03 
{
	public static void main(String[] args) 
	{
		ArrayList a3=new ArrayList();
		a3.add(123);
		a3.add("jeet");
		a3.add('T');
		a3.add(88.45f);
		a3.add(0, "First");//TO ADD ELEMENT AT FIST POTION
		System.out.println("First element is : "+a3.get(0));
	}
}
