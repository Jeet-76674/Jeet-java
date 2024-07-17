package oops;
/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. Its 
constructor having parameters for length and breadth is used to initialize the length 
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
constructor having a parameter for its side (suppose s) calling the constructor of its 
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.*/ 
class Rectangle
{
	int len,bre;
	public Rectangle(int l,int b)
	{
		len=l;
		bre=b;
	}
	public void  area()
	{
		System.out.println("Area of Rectagle is : "+(len*bre));
	}
	public void perameter()
	{
		System.out.println("Perameter of rectangle is : "+(2*(len+bre)));
	}
}
class Square extends Rectangle
{
	int s;
	public Square(int s) 
	{
		super(s,s);
		this.s=s;
		System.out.println();
	}
	public void  area1()
	{
		System.out.println("Area of Square is : "+(s*s));
	}
	public void perameter2()
	{
		System.out.println("Perameter of rectangle is : "+(4*s));
	}
}
public class EX_04 
{
	public static void main(String[] args) 
	{
		Square r1=new Square(20);
		r1.area();
		r1.perameter();
		r1.area1();
		r1.perameter2();
		
		
	}
}
