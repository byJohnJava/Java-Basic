package loopWhile;
import java.util.Scanner;

public class Execicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int esc = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (esc != 4) {
			esc = sc.nextInt();
			
			if (esc == 1) {
				alcool++;
			} else if (esc == 2) {
				gasolina++;
			} else if (esc == 3) {
				diesel++;
			}
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
