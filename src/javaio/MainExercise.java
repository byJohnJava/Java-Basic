package javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ProductFile;

public class MainExercise {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<ProductFile> list = new ArrayList<ProductFile>();
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFile = sourceFolderStr + "\\out\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String line = br.readLine();
			while (line != null) {
				String lines[] = line.split(",");
				String name = lines[0];
				double price = Double.parseDouble(lines[1]);
				int quantity = Integer.parseInt(lines[2]);
				list.add(new ProductFile(name, price, quantity));
				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {

				for (ProductFile productFile : list) {
					bw.write(productFile.getName() + ","
							+ String.format("%.2f", productFile.getTotal()));
					bw.newLine();
				}
				
				System.out.println(targetFile + " Archive created");

			} catch (IOException e) {
				System.out.println("Error creating the file");
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
