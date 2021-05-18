package endterm;

public class Savings extends account1
{
	private double interestRate;
	
	public Savings(int accountNumber, double i)
	{
		super(accountNumber);
		setInterestRate(i);
	}
	
	public void setInterestRate(double i)
	{
		interestRate = i;
	}
	
	public double getInterestRate()
	{
		return interestRate;
	}
	
	public int getAccountNumber()
	
	{
		return accountNumber;
	}
	
	public double getBalance()
	
	{
		return balance;
	}
	
	
	public String getAccountInfo()
	
	{
		return("Savings Information\nAccount Number: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nInterest Rate: " + getInterestRate() + "%");
	}
}