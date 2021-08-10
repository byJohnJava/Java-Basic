package conditionals;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro para saber se é par ou ímpar: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Esse número é par");
		} else {
			System.out.println("Esse número é ímpar");
		}
		
		sc.close();

	}

}
