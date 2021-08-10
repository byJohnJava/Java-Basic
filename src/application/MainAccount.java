package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class MainAccount {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)?");
		char choice = sc.next().charAt(0);
		
		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			account = new Account(numberAccount, accountHolder, balance);
		} else {
			account = new Account(numberAccount, accountHolder);
		}
		
		System.out.println();
		System.out.println("Account data:");		
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		
		System.out.println();
		System.out.println("Updated data:");		
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println();
		System.out.println("Updated data:");		
		System.out.println(account);

		sc.close();
		
		
	}

}
