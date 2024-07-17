package exception;

import java.util.Scanner;

/*• W.A.J.P to create a class Student with attributes roll no, name, age and course. 
Initialize values through parameterized constructor. If age of student is not in 
between 15 and 21 then generate user defined exception 
"AgeNotWithinRangeException". If name contains numbers or special symbols 
raise exception "NameNotValidException". Define the two exception classes. */
class AgeException extends Exception
{
	
}
class NameException extends Exception
{
	
}
class Student 
{
	int rno,age;
	String name,course;
	public Student(int rno,String name,int age,String course)
	{
		this.rno=rno;
		this.name=name;
		this.age=age;
		this.course=course;
	}
	public void ageVerification() throws AgeException
	{
		if(age<15 || age>21)
		{
			throw new AgeException();
		}
	}
	public void nameVerification() throws NameException
	{
	
		int l = name.length();
		int i=0;
		int s=0,al=0,n=0,o=0;
		while(i<=l-1)
		{
			char b=name.charAt(i);
			int asc=(int)b;
			if(b==' ')
			{
				s++;
			}
			else if(asc>=48 && asc<=57)
			{
				n++;
			}
			else if(asc>=65 && asc<=90 || asc>=97 && asc<=122)
			{
				al++;
			}
			else
			{
				o++;
			}
			i++;
		}
		if(n>0 || o>0)
		{
			throw new NameException();
		}
	}
}
public class EX_08
{
	public static void main(String[] args) 
	{
		int rno,age;
		String name,course;
		System.out.println("Enter your Name : ");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		System.out.println("Enter your Roll No : ");
		rno=sc.nextInt();
		System.out.println("Enter youe Age : ");
		age=sc.nextInt();
		System.out.println("Enter your Course : ");
		course=sc.nextLine();
		
		Student s1=new Student(rno, name, age, course);
		try 
		{
			s1.ageVerification();
		} catch (AgeException e) 
		{
			System.out.println("AgeNotWithinRangeException");
			e.printStackTrace();
		}
		try 
		{
			s1.nameVerification();
		}catch (NameException e) 
		{
			System.out.println("NameNotValidException");
			e.printStackTrace();
		}
		
		
	}
}
