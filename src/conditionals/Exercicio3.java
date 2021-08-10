package conditionals;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois números inteiros para saber se são múltiplos ou não: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("Os números digitados são múltiplos");
		} else {
			System.out.println("Os números digitados não são múltiplos");
		}

		sc.close();

	}

}
