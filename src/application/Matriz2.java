package application;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número de linhas da matriz: ");
		int linhas = sc.nextInt();
		System.out.print("Informe o número de colunas da matriz: ");
		int colunas = sc.nextInt();

		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.print("Digite o número a ser encontrado na matriz: ");
		int n = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == n) {
					System.out.println("Position: " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}

				}
			}
		}

		sc.close();

	}

}
