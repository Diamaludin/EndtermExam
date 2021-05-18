package endterm;

public class AccountUnitTest
{
	public static void main(String[] args)
	{
		account1[] accArr = new account1[10];
		
		accArr[0] = new Checking(10);
		accArr[1] = new Checking(12);
		accArr[2] = new Checking(14);
		accArr[3] = new Checking(16);
		accArr[4] = new Checking(18);
		accArr[5] = new Savings(25,2.0);
		accArr[6] = new Savings(26,2.1);
		accArr[7] = new Savings(27,3.2);
		accArr[8] = new Savings(28,1.6);
		accArr[9] = new Savings(29,2.4);
		
		
		for(int i = 0; i <accArr.length; ++i)
			System.out.println(accArr[i].getAccountInfo() + "\n");
	}
}