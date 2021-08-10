package conditionals;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois n�meros inteiros para saber se s�o m�ltiplos ou n�o: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("Os n�meros digitados s�o m�ltiplos");
		} else {
			System.out.println("Os n�meros digitados n�o s�o m�ltiplos");
		}

		sc.close();

	}

}
