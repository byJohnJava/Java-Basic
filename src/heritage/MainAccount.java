package heritage;

import java.util.ArrayList;
import java.util.List;

public class MainAccount {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<Account>();
		
		Account acc = new Account(2247, "Dimitrov", 500.00);
		BusinessAccount bacc = new BusinessAccount(1530, "Pablo", 1000.00, 5000.00);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(5208, "José", 0.0, 400.00);
		Account acc3 = new SavingsAccount(8504, "Vanda", 600.00, 0.01);
		
		acc.withdraw(200);
		System.out.println(acc.getBalance());
		
		acc3.withdraw(200);
		System.out.println(acc3.getBalance());
		
		bacc.withdraw(500);
		System.out.println(bacc.getBalance());
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(200.0);
		System.out.println(acc4.getBalance());
		
		// BusinessAccount acc5 = (BusinessAccount) acc3; Não é possível esse tipo de casting pois, uma SavingsAccount não pode ser convertido para BusinessAccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(800.00);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	
	}
	

}
