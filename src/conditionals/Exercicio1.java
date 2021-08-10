package conditionals;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro para saber se é positivo ou negativo: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("Esse número é negativo");
		} else {
			System.out.println("Esse número é positivo");
		}

		sc.close();
	}

}
