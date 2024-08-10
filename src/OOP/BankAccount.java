package OOP;

public class BankAccount {

	private String accountNumber, holderName; 
	private double balance;
	
	public String getaccountNumber()
	{
		return accountNumber;
	}
	
	public String getholderName()
	{
		return holderName;
		
	}
	
	public double getbalance()
	{
		return balance;
	}
	
	
	public  void SetaccountNumber(String an)
	{
		 this.accountNumber= an;
	}
	
	public void SetholderName(String hn)
	{
		this.holderName=hn;
		
	}
	
	public void Setbalance(double bl)
	{
		this.balance=bl;
	}
	
	public void deposit(double d)
	{
		
		this.balance= this.balance+d;
	}
	
	public void withdraw(double w)
	{
		if(w>this.balance)
		{
			System.out.println("withdrawal amount is greater than the balance");
		}
		else
		{
			this.balance= this.balance-w;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankAccount BA = new BankAccount();
		BA.SetaccountNumber("ABC");
		BA.SetholderName("PIKU");
		BA.Setbalance(6000);
		BA.withdraw(1000);
		System.out.println("After windraw balance "+BA.getbalance());
		BA.deposit(1000);
		System.out.println("After diposit balance "+BA.getbalance());
	}

}
