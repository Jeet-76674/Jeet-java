package oops;

import java.util.Scanner;

/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 'Area' and 
call all the three methods. */
abstract class Shape
{
	int l,b,s,r;
	abstract public void rectangleArea(int l,int b);
	abstract public void squareArea(int s);
	abstract public void circleArea(int r);
}
class Area1 extends Shape
{
	
	@Override
	public void rectangleArea(int l, int b) 
	{
		System.out.println("Area of rectangle = "+(l*b));
	}

	@Override
	public void squareArea(int s) 
	{
		System.out.println("Area of sqare = "+(s*s));
	}

	@Override
	public void circleArea(int r) 
	{
		System.out.println("Area of circle = "+(3.14*r*r));
	}
	
}
public class EX_11 
{
	public static void main(String[] args) 
	{
		int len,bre,side,radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenght of rectangle : ");
		len=sc.nextInt();
		System.out.println("Enter the breadth of rectangle : ");
		bre=sc.nextInt();
		System.out.println("Enter the side of square : ");
		side=sc.nextInt();
		System.out.println("Enter the radius of circle : ");
		radius=sc.nextInt();
		Area1 a1=new Area1();
		a1.rectangleArea(len, bre);
		a1.squareArea(side);
		a1.circleArea(radius);
		
		
	}
}
