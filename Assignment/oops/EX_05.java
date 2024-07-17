package oops;
/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 
5 units by creating a class named 'Triangle' without any parameter in its constructor.*/
class Triangle
{
	int a=3,b=4,c=5;
	public Triangle()
	{
		System.out.println("Area of an Triangle is : ");//underroot(s*s-a*s-b*s-c) where s=s1/2
		System.out.println("perimeter of an Triangle is : "+(a+b+c));
	}
}
public class EX_05 
{
	public static void main(String[] args) 
	{
		Triangle t1=new Triangle();
	}
}
