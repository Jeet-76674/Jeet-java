package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;

/*Write a Java program to join two array lists.*/
public class EX_20 
{
	public static void main(String[] args) 
	{
		ArrayList a20_1 =new ArrayList();
		a20_1.add("First");
		a20_1.add(123);
		a20_1.add("jeet");
		a20_1.add('T');
		ArrayList a20_2 =new ArrayList();
		a20_2.add("second");
		a20_2.add(88.45f);
		ArrayList a20_3 =new ArrayList();
		
		a20_3.addAll(a20_1);
		a20_3.addAll(a20_2);
		System.out.println("joined ArrayList : "+a20_3);

	}
}
