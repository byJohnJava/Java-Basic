package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class MainCurrencyConverter {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double quantityDollar = sc.nextDouble();
		System.out.println("Amount to be paid in reais = "
				+ String.format("%.2f", CurrencyConverter.convert(quantityDollar, dollar)));

		sc.close();
	}

}
