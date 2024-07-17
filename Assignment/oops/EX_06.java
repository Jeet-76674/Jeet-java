package oops;

import java.util.Scanner;

/*Print the sum, difference and product of two complex numbers by creating a class 
named 'Complex' with separate methods for each operation whose real and 
imaginary parts are entered by user*/
class Complex
{
	int r1,r2,i1,i2;
	public void setData(int r1,int i1,int r2,int i2)
	{
		this.r1=r1;
		this.r2=r2;
		this.i1=i1;
		this.i2=i2;
	}
	public void sum() 
	{
		int sr=r1+r2;
		int si=i1+i2;
		if(si>0)
		{		
			System.out.println("Addition : "+sr+"+"+si+"i");
		}
		else
		{
			System.out.println("Addition : "+sr+si+"i");
		}
	}
	public void difference()
	{
		int dr=r1-r2;
		int di=i1-i2;
		if(di>0)
		{		
			System.out.println("Substraction : "+dr+"+"+di+"i");
		}
		else
		{
			System.out.println("Substraction : "+dr+di+"i");
		}
	}
	public void product()
	{
		int mr=(r1*r2)-(i1*i2);
		int mi=(r1*i2)+(r2*i1);
		if(mi>0)
		{		
			System.out.println("Multiplication : "+mr+"+"+mi+"i");
		}
		else
		{
			System.out.println("Multiplication : "+mr+mi+"i");
		}
	}
}
public class EX_06 
{
	public static void main(String[] args) 
	{
		System.out.println("For first complex number :");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter real part : ");
		int r1=sc.nextInt();
		System.out.println("Enter imaginary part : ");
		int i1=sc.nextInt();
		if(i1>0)
		{		
			System.out.println("Enterd first complex number is : "+r1+"+"+i1+"i");
		}
		else
		{
			System.out.println("Enterd first complex number is : "+r1+i1+"i");
		}
		System.out.println();
		System.out.println("For second complex number :");
		System.out.println("Enter real part : ");
		int r2=sc.nextInt();
		System.out.println("Enter imaginary part : ");
		int i2=sc.nextInt();
		if(i2>0)
		{		
			System.out.println("Enterd second complex number is : "+r2+"+"+i2+"i");
		}
		else
		{
			System.out.println("Enterd second complex number is : "+r2+i2+"i");
		}
		
		Complex c1=new Complex();
		c1.setData(r1, i1, r2, i2);
		c1.sum();
		c1.difference();
		c1.product();
		
	}
}
