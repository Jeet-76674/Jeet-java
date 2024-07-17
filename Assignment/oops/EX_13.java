package oops;

/*• Create a class named 'Shape' with a method to print "This is this is shape". Then 
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both 
having a method to print "This is rectangular shape" and "This is circular shape" 
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print 
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
object of 'Square' class. */
class Shape13
{
	public void displayss() 
	{
		System.out.println("This is this is shape");
	}
}
class Rectangle13 extends Shape13
{
	public void displayr() 
	{
		
		System.out.println("This is rectangular shape");
	}
}
class Circle13 extends Shape13
{
	public void displayc() 
	{
		System.out.println("This is circular shape");
	}
}
class Square13  extends Rectangle13
{
	public void displays() 
	{
		
		System.out.println("Square is a rectangle");
	}
}
public class EX_13 
{
	public static void main(String[] args) 
	{
		Square13 s1=new Square13();
		s1.displayss();
		s1.displayr();
		
	}
}
