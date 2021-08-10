package sequential;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite dois números: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
		

	}

}
