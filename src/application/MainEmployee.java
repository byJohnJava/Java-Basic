package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		
		System.out.println("Enter with the data of the employee:");
		System.out.print("Name: ");
		e.name = sc.nextLine();
		System.out.print("Gross salary: ");
		e.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		e.tax = sc.nextDouble();
		
		System.out.println();		
		System.out.println(e);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		e.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + e);
		
		sc.close();
	}

}
