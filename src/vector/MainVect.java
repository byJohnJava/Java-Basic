package vector;

import java.util.Locale;
import java.util.Scanner;

public class MainVect {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n = sc.nextInt();

		double[] vect = new double[3];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;

		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double avg = sum / n;

		System.out.printf("AVERAGE = %.2f%n", avg);

		sc.close();

	}

}
