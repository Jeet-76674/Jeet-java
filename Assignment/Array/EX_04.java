package Array;
/*• Write a java program to make addition, Subtraction and multiplication of two 
matrix using 2-D Array*/

import java.util.Scanner;

public class EX_04 
{
	public static void main(String[] args) 
	{
		int[][] a=new int [3][3];
		int[][] b=new int [3][3];
		int[][] c=new int [3][3];
		int[][] d=new int [3][3];
		int[][] e=new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("For Matrix A : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter value For A : ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("For Matrix B : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter value For B : ");
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition of Matrix A & B : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Substraction of Matrix A & B : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				d[i][j]=a[i][j]-b[i][j];
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Multiplication of Matrix A & B : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				e[i][j]=0;
				for(int k=0;k<3;k++)
				{
					e[i][j]=e[i][j] +a[i][k]*b[k][j];	
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				System.out.print(e[i][j]+" ");
			}
			System.out.println();
		}
	}
}
