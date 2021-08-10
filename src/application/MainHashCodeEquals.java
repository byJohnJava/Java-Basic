package application;

import hashCodeEquals.Client;

public class MainHashCodeEquals {
	
	public static void main(String[] args) {
		
		Client c1 = new Client("Joao", "joao@gmail.com");
		Client c2 = new Client("Joao", "joao@gmail.com");
		Client c3 = c1;
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); // Compara o conteúdo
		System.out.println(c1 == c2); // Compara as referências de memória dos objetos
		System.out.println(c1 == c3); // Compara as referências de memória dos objetos
		System.out.println(s1 == s2);
		
	}

}
