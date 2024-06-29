package Module1;
//Write a Java program that accepts an integer (n) and computes the value of
//n+nn+nnn. Input number: 5
//5 + 55 + 555
import java.util.Scanner;

public class EX_11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input an number : ");
		int a=sc.nextInt();
		int res=a*1+a*11+a*111;
		System.out.println(a*1+" + "+a*11+" + "+a*111+" = "+res);
	}
}
