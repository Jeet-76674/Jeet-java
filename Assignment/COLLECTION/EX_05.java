package COLLECTION;

/*• Write a Java program to update specific array element by given element. */
import java.util.ArrayList;
import java.util.Scanner;

public class EX_05
{
	public static void main(String[] args) 
	{
		ArrayList a5 =new ArrayList();
		a5.add(1);
		a5.add(2);
		a5.add(3);
		a5.add(4);
		a5.add(5);
		a5.add(6);
		System.out.println("ArrayList before update : "+a5);
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter element you want to replace : ");
		int rep=input.nextInt();
		
		System.out.print("Enter new value to change insted of "+rep+" : ");
		int newele =input.nextInt();
		
		int repindex=a5.indexOf(rep);
		a5.set(repindex, newele);
		
		System.out.println("ArrayList After recent update : "+a5);
		
		
	}
}
