package hashCodeEquals;

public class MainClient {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com"); 
		Client c2 = new Client("Maria", "maria@gmail.com"); 
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); // Equals compara o conte�do
		System.out.println(c1 == c2); // == compara as refer�ncias de mem�ria
		System.out.println(s1 == s2); // retorna true pois n�o est� sendo criado um objeto na mem�ria com a palavra "new"
	}
}
