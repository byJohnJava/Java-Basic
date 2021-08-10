package javaio;import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainFileWriter {

	public static void main(String[] args) {
		
		String [] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

		String path = "C:\\teste\\teste.csv";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("Arquivo criado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao criar o arquivo");
		}
		
	}

}
