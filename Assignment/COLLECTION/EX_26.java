package COLLECTION;

import java.util.ArrayList;

public class EX_26 
{
	public static void main(String[] args) 
	{
		ArrayList a26 =new ArrayList();
		a26.add(123);
		a26.add("jeet");
		a26.add(88.45f);
		a26.add("First");
		for (int i = 0; i < a26.size(); i++) 
		{
            System.out.println("Element at index " + i + ": " + a26.get(i));
        }
	}
}
