package oops;
/*• Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
having a method with the same name 'message' that prints "This is first subclass" 
and "This is second subclass" respectively. Call the methods 'message' by creating 
an object for each subclass. */
class Parent1
{
	public void message()
	{
		System.out.println("This is first subclass");
	}
}
class Subclass1 extends Parent1
{
	public void message()
	{
		System.out.println("This is parent class");
	}
}
class Subclass2 extends Parent1
{
	public void message()
	{
		System.out.println("This is second subclass");
	}
}
public class EX_07
{
	public static void main(String[] args) 
	{
		Parent1 p1=new Parent1();
		Subclass1 s1=new Subclass1();
		Subclass2 s2=new Subclass2();
		p1.message();
		s1.message();
		s2.message();
	}
}
