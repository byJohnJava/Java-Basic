package conditionals;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro para saber se � par ou �mpar: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Esse n�mero � par");
		} else {
			System.out.println("Esse n�mero � �mpar");
		}
		
		sc.close();

	}

}
