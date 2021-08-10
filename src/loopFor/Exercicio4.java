package loopFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			int num = sc.nextInt();
			int num2 = sc.nextInt();

			if (num2 == 0) {
				System.out.println("Divisão impossível");
			} else {
				double total = (double) num / num2;
				System.out.printf("%.1f%n", total);
			}

		}

		sc.close();

	}

}
