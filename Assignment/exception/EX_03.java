package exception;

/*• W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
exception and another one is to handle 
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;*/ 
public class EX_03
{
	public static void main(String[] args) 
	{
		int[] a =new int[5];
		try 
		{
			a[5]=30/1;
		} catch (ArithmeticException e)
		{
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
}
