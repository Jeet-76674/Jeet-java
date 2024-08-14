package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;

/*Write a Java program to compare two array lists*/
public class EX_18 
{
	public static void main(String[] args) 
	{
		ArrayList a18 =new ArrayList();
		a18.add(123);
		a18.add("jeet");
		a18.add('T');
		a18.add(88.45f);
		a18.add(0, "First");
		ArrayList a181 = a18;
		Collections.shuffle(a181);
		boolean b=a18.equals(a181);
		if(b)
		{
			System.out.println("both the array list are same.");
		}
		else
		{
			System.out.println("both arry list are not same");
		}
	}
}
