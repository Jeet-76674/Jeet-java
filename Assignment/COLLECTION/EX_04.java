package COLLECTION;

import java.util.ArrayList;

/*•• Write a Java program to retrieve an element (at a spec. index) from a given array list.  
*/
public class EX_04 
{
	public static void main(String[] args) 
	{
		ArrayList a3=new ArrayList();
		a3.add(123);
		a3.add("jeet");
		a3.add('T');
		a3.add(88.45f);
		a3.add(0, "First");
		System.out.println("First element is : "+a3.get(0));//RETRIVING ELKEMENT FROM SPECIFIC INDEX
	}
}
