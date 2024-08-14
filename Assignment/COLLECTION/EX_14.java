package COLLECTION;

import java.util.HashMap;

/*Write a Java program to associate the specified value with the specified key in a 
Hash Map.*/
public class EX_14
{
	public static void main(String[] args) 
	{
		HashMap hm1=new HashMap();
		hm1.put(555, "jeet");
		hm1.put(512, "Abhayy");
		hm1.put(521, "Saurabh");
		hm1.put(523, "Chintan");
		hm1.put(524, "Mayur");
		hm1.put(526, "Manav");
		hm1.put(530, "Yagnesh");
		hm1.put(547, "Krish");
		System.out.println("HashMap = "+hm1);
	}
}
