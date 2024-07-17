package oops;

import java.util.Scanner;

/*Write a program which will ask the user to enter his/her marks (out of 100). Define a 
method that will display grades according to the marks entered as below: 
Marks Grade : 
90-100 A 
80-90 B 
70-80 c 
60-70 d 
50-60 e 
1-50  Fail*/
class Result
{
	int g;
	public void grade(int grade)
	{
		g=grade;
		if(g<0 || g>100)
		{
			System.out.println("!!!!Enter valid marks!!!!");
		}
		else if(g<50 && g>=0)
		{
			System.out.println("Sorry you are Failed!!");
		}
		else if(g<60 && g>=50)
		{
			System.out.println("Grade : E");
		}
		else if(g<70 && g>=60)
		{
			System.out.println("Grade : D");
		}
		else if(g<80 && g>=70)
		{
			System.out.println("Grade : C");
		}
		else if(g<90 && g>=80)
		{
			System.out.println("Grade : B");
		}
		else if(g<=100 && g>=90)
		{
			System.out.println("Grade : A");
		}
	}
}
public class EX_12
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mark out of 100 : ");
		int grade=sc.nextInt();
		Result r=new Result();
		r.grade(grade);
		
		
	}
}
