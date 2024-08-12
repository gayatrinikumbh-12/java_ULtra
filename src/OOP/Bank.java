package OOP;

import java.util.ArrayList;

public class Bank {

	String name; 
	
	ArrayList<BankAccount > accounts = new ArrayList<BankAccount >() ;
	
	public void addAccount(BankAccount a)
	{
		
		this.accounts.add(a);
	}
	
	public void getTotalBalance()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bn = new Bank();
		
	//	bn.addAccount("Piku ");
		
	}

}
