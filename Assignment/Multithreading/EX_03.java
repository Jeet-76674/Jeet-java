package Multithreading;



/*• W.A.J.P to create 2 threads and execute that threads by providing sleep time as 
2000ms and check the execution.*/
class Thierd extends Thread
{
	public void run()//running
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My First Thread is : "+i);
		}
		System.out.println("MY first thread is complated..");
	}
}

public class EX_03
{
	public static void main(String[] args) 
	{
		Thierd f1=new Thierd();//newborn
		f1.start();//runnable
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My Main Thread is : "+i);
		}
		System.out.println("MY Main Thread is complated..");
	}
}
