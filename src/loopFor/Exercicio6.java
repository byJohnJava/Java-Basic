package loopFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
