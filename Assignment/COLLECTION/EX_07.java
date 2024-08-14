package COLLECTION;

import java.util.ArrayList;
import java.util.Scanner;

/*• Write a Java program to search an element in an array list.*/
public class EX_07 
{
	public static void main(String[] args) 
	{
		ArrayList a7 =new ArrayList();
		a7.add(1);
		a7.add(2);
		a7.add(3);
		a7.add(4);
		a7.add(5);
		a7.add(6);
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter element you want to Search : ");
		int serch=input.nextInt();
		
		int indexserch=a7.indexOf(serch);
		if(indexserch != -1)
		{
			System.out.println("Elemnent match found!!");
			System.out.println("Yur element is at index "+ indexserch);
		}
		else
		{
			System.out.println("Elemnent match not found!!");
		}
		
	}
}
