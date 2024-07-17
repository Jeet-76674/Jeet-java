package oops;
/*Create a class to print the area of a square and a rectangle. The class has two methods 
with the same name but different number of parameters. The method for printing 
area of a rectangle has two parameters which are length and breadth respectively 
while the other method for printing area of square has one parameter which is side 
of square*/
class Area
{
	public void area(int a,int b) 
	{
		System.out.println("Area of Ractangele is : "+(a*b));
	}
	public void area(int a) 
	{
		System.out.println("Area of sqare is : "+(a*a));

	}
}
public class EX_01 
{
	public static void main(String[] args) 
	{
		Area s1=new Area();
		s1.area(20, 15);
		s1.area(15);
	}
}
