package Module1;
//Write a Java program to print numbers between 1 to 100 which are divisible
//by 3, 5 and by both.

public class EX_12
{
	public static void main(String[] args) 
	{
		for(int i=1;i<101;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}
