package COLLECTION;

import java.util.HashMap;

/*Write a Java program to associate the specified value with the specified key in a 
Hash Map.*/
public class EX_15
{
	public static void main(String[] args) 
	{
		HashMap hm2=new HashMap();
		hm2.put(555, "jeet");
		hm2.put(512, "Abhayy");
		hm2.put(521, "Saurabh");
		hm2.put(523, "Chintan");
		hm2.put(524, "Mayur");
		hm2.put(526, "Manav");
		hm2.put(530, "Yagnesh");
		hm2.put(547, "Krish");
		System.out.println("HashMap's size  = "+hm2.size());
	}
}
