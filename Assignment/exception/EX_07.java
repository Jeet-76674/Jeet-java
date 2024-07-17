package exception;

/*• W.A.J.P to create a custom exception if Customer withdraw amount which is greater 
than account balance then program will show custom exception otherwise amount 
 
will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 
2500 
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction. */
import java.util.Scanner;
import java.util.jar.JarException;

class JeetExaption extends Exception
{
	double amount;
	public JeetExaption(double amount) 
	{
		this.amount=amount;
	}
		
}
class ATM
{
	double balance;
	public void deposite(double amount)
	{
		balance = balance +amount;
		System.out.println(amount+" rs deposited ....");
	}
	public void withdrawal(double amount) throws JeetExaption
	{
		if(amount<=balance)
		{
			balance-=amount;
			System.out.println(amount+" rs withrawal succsesfully...");
		}
		else
		{
			double needs=amount-balance;
			throw new JeetExaption(needs);
		}
	}
}
public class EX_07
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ATM a1=new ATM();
		System.out.println("Enter ammount to Deposit : ");
		double amount=sc.nextDouble();
		a1.deposite(amount);
		
		System.out.println("Enter ammount to Withrawal : ");
		amount=sc.nextDouble();
		
		try 
		{
			a1.withdrawal(amount);
		} catch (JeetExaption e) 
		{
			System.out.println("Sorry, insufficient balance, you need more "+e.amount+ "Rs. To perform this transaction.");
			e.printStackTrace();
		}
	}
}
