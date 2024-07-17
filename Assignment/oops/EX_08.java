package oops;

/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and 
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'are 
subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
method by creating an object of each of the three classes.*/ 
abstract class Bank
{
	int balance_A=0,balance_B=0,balance_C=0;
	abstract public  void getBalance();
}
class BankA extends Bank
{

	@Override
	public void getBalance() 
	{
		balance_A=balance_A+100;
		System.out.println("Your BankA balance is : "+balance_A+"$");
	}
	
}
class BankB extends Bank
{

	@Override
	public void getBalance() 
	{
		balance_B=balance_B+150;
		System.out.println("Your BankB balance is : "+balance_B+"$");
	}
	
}
class BankC extends Bank
{

	@Override
	public void getBalance() 
	{
		balance_C=balance_C+200;
		System.out.println("Your BankC balance is : "+balance_C+"$");
	}
	
}
public class EX_08
{
	public static void main(String[] args) 
	{
		
		BankA b1=new BankA();
		BankB b2=new BankB();
		BankC b3=new BankC();
		b1.getBalance();
		b2.getBalance();
		b3.getBalance();
	}
}
