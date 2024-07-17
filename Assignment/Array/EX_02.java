package Array;
//Write a java program to find out the 2nd max number from given array using 
//function.

public class EX_02
{
	public static void main(String[] args) 
	{
		int[] a= {10,25,41,35,25,02};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]*a[j];
					a[j]=a[i]/a[j];
					a[i]=a[i]/a[j];
					
				}
			}
		}
			System.out.println("2nd Max number is : "+a[a.length-2]);
	}
}
