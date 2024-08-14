package Multithreading;

/*• W.A.J.P to start the same Thread twice by calling start () method twice. Test 
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); */

class TestThreadTwice1 extends Thread
{
	public void run()
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
	};
}
public class EX_04
{
	public static void main(String[] args) 
	{
		TestThreadTwice1 t1=new TestThreadTwice1(); 
		t1.start (); 
		t1.start ();
	}
}
