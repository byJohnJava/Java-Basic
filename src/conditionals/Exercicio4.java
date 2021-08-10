package conditionals;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora inicial e a hora final do jogo: ");
		int hora_inicial = sc.nextInt();
		int hora_final = sc.nextInt();
		int tempo_jogo;

		if (hora_inicial < hora_final) {
			tempo_jogo = hora_final - hora_inicial;
			System.out.println("O JOGO DUROU " + tempo_jogo + " HORA(S)");
		} else {
			tempo_jogo = hora_final - hora_inicial + 24;
			System.out.println("O JOGO DUROU " + tempo_jogo + " HORA(S)");
		}

		sc.close();

	}

}
