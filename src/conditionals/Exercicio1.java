package conditionals;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro para saber se � positivo ou negativo: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("Esse n�mero � negativo");
		} else {
			System.out.println("Esse n�mero � positivo");
		}

		sc.close();
	}

}
