package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int l = 0; l < mat.length; l++) {
			for(int c = 0; c < mat[l].length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int l = 0; l < mat.length; l++) {
			System.out.print(mat[l][l] + " ");
		}
		System.out.println();
		
		int count = 0;
		
		for(int l = 0; l < n; l++) {
			for(int c = 0; c < mat[l].length; c++) {
				if (mat[l][c] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);
		
		sc.close();
		
	}

}
