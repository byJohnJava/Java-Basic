package sequential;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o código da peça 1: ");
		int codPeca1 = sc.nextInt();
		System.out.println("Digite o número de peças 1: ");
		int numPeca1 = sc.nextInt();
		System.out.println("Digite o valor da peça 1: ");
		double valorPeca1 = sc.nextDouble();
		
		System.out.println("Digite o código da peça 2: ");
		int codPeca2 = sc.nextInt();
		System.out.println("Digite o número de peças 2: ");
		int numPeca2 = sc.nextInt();
		System.out.println("Digite o valor da peça 2: ");
		double valorPeca2 = sc.nextDouble();
		
		double total = numPeca1 * valorPeca1 + numPeca2 * valorPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		sc.close();

	}

}
