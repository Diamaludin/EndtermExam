package endterm;

public abstract class account1
{
	protected int accountNumber;
	protected double balance;
	
	public account1(int acctN)
	
	{
		accountNumber = acctN;
		setBalance(0.0);
	}
	
	public void account(int accountNumber2) 
	
	{
	    accountNumber = accountNumber2;
	}

	public void setBalance(double bal)
	
	{
		balance = bal;
	}
	
	public abstract int getAccountNumber();
	public abstract double getBalance();
	
	
	public abstract String getAccountInfo();
}


