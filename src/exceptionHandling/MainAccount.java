package exceptionHandling;

import java.util.Locale;
import java.util.Scanner;

import exceptionHandling.entities.Account;
import exceptionHandling.exception.WithdrawInsufficient;
import exceptionHandling.exception.WithdrawLimit;

public class MainAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		Account account = new Account(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();

		try {
			
			account.withdraw(amount);
			System.out.println("New Balance: " + account);
			
		} catch (WithdrawLimit e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (WithdrawInsufficient e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();
	}

}
