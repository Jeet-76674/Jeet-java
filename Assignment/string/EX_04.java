package string;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


/*• Write a Java program to display the system time.*/
public class EX_04 
{
	public static void main(String[] args) 
	{
		System.out.println("");
		LocalTime time = LocalTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Sysem time is : "+dtf.format(time));
	}
}
