package Multithreading;

/*• W.A.J. P to create one thread by implementing Runnable interface in 
Class.*/ 



class Second implements Runnable 
{
	  
	public void run()//running
	{
		for (int i=1;i<=5;i++)  
		{
			System.out.println(" My Assignment thread is.. "+i);
		}
		System.out.println(" my second Assignment is completed...");
	}
}
public class EX_01
{
	public static void main(String[] args) 
	{
		Second s1=new Second();
		Thread t1=new Thread(s1);
		t1.start();
		
	}
}
	

