package loopFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			double num = sc.nextDouble();
			double num2 = sc.nextDouble();
			double num3 = sc.nextDouble();

			double media = (num * 2.0 + num2 * 3 + num3 * 5) / 10;
			
			System.out.printf("%.1f%n", media);

		}
		
		sc.close();

	}

}
