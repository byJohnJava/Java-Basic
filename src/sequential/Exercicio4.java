package sequential;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o c�digo do funcion�rio: ");
		int codFuncionario = sc.nextInt();
		System.out.println("Digite o n�mero de horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o valor da hora trabalhada: ");
		double valorHora = sc.nextDouble();
		
		double salario = valorHora * horasTrabalhadas;
		
		System.out.println("NUMBER = " + codFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);		
		
		
		sc.close();

	}

}
