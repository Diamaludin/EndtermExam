package endterm;

public class Checking extends account1
{
	public Checking(int accountNumber)
	{
		super(accountNumber);
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
		return("Check  Information\nAcct Num: " + getAccountNumber() + "\nBalance: " + getBalance());
	}
}