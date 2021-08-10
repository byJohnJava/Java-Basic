package sequential;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do raio do círculo: ");
		double raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, raio);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();

	}

}
