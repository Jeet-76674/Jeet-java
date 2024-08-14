package Multithreading;

/*• W.A.J. P to create one thread by extending Thread class in another Class.*/

class First extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("My First Thread is : "+i);
		}
		System.out.println("MY first thread is complated..");
	};
}
public class EX_02 
{
	public static void main(String[] args) 
	{
		First f1=new First();
		f1.start();
	}
}
