package entities;

public class Account {
	
	private int numberAccount;
	private String accountHolder;
	private double balance;
	
	public Account() {
	}
	
	public Account(int numberAccount, String accountHolder, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
	
	public Account(int numberAccount, String accountHolder) {
		this.numberAccount = numberAccount;
		this.accountHolder = accountHolder;
	}

	public String getCardHolderName() {
		return accountHolder;
	}

	public void setCardHolderName(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		this.balance -= withdraw + 5.00;
	}
	
	public String toString() {
		return "Account " + numberAccount + ", " + "Holder: " + accountHolder + ", " + "Balance: $ " + balance;
	}
	
	
	
	

}
