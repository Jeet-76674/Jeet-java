package Array;
//Write a java program to find out the max number from given array using function
public class EX_01
{
	public static void main(String[] args) 
	{
		int[] a= {10,25,41,35,25,02};
		int max = findMax(a);
		System.out.println(max+" Is Maximum Number");
	}
	
	public static int findMax(int[] a)
	{
		int fm=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>fm)
			{
				fm=a[i];
			}
		}
	 return fm;
	}
}
