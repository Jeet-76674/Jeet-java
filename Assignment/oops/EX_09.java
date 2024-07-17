package oops;

import java.util.Scanner;

/*We have to calculate the percentage of marks obtained in three subjects (each out of 
100) by student A and in four subjects (each out of 100) by student B. Create an 
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
other classes 'A' and 'B' each having a method with the same name which returns the 
percentage of the students. The constructor of student A takes the marks in three 
subjects as its parameters and the marks in four subjects as its parameters for student 
B. Create an object for each of the two classes and print the percentage of marks for 
both the students.*/
abstract class Marks
{	int a1,a2,a3,b1,b2,b3,b4;
	abstract public void getPercentage();
	
}
class A extends Marks
{
	public A(int a1,int a2,int a3) 
	{
		this.a1=a1;
		this.a2=a2;
		this.a3=a3;
	}
	
	public void getPercentage()
	{
		int pr_a=(a1+a2+a3)/3;
		System.out.println("Percentage of Student A : "+pr_a+"%");
	}
	
}
class B extends Marks
{
	public B(int b1, int b2, int b3, int b4)
	{
		this.b1=b1;
		this.b2=b2;
		this.b3=b3;
		this.b4=b4;
	}
	public void getPercentage() 
	{
		int pr_b=(b1+b2+b3+b4)/4;
		System.out.println("Percentage of Student B : "+pr_b+"%");
	}
	
}
public class EX_09 
{
	public static void main(String[] args) 
	{
		System.out.println("For student A : ");
		System.out.println("Enter 1st subject mark : ");
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		System.out.println("Enter 2nd subject mark : ");
		int a2=sc.nextInt();
		System.out.println("Enter 3rd subject mark : ");
		int a3=sc.nextInt();
		
		System.out.println("For student B : ");
		System.out.println("Enter 1st subject mark : ");
		int b1=sc.nextInt();
		System.out.println("Enter 2nd subject mark : ");
		int b2=sc.nextInt();
		System.out.println("Enter 3rd subject mark : ");
		int b3=sc.nextInt();
		System.out.println("Enter 4th subject mark : ");
		int b4=sc.nextInt();
		
		A a=new A(a1,a2,a3);
		a.getPercentage();
		B b=new B(b1,b2,b3,b4);
		b.getPercentage();



	}
}
