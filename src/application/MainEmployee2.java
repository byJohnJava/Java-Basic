package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class MainEmployee2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int quantity = sc.nextInt();
		
		List<Employee2> list = new ArrayList<Employee2>();

		for (int i = 1; i <= quantity; i++) {
				System.out.println();
				System.out.println("Employee #" + i + ":");
				System.out.print("Id: ");
				sc.nextLine();
				int id = sc.nextInt();
				while (hasId(list, id)) {
					System.out.print("Id already taken. Try again: ");
					id = sc.nextInt();
				}
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();
				list.add(new Employee2(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee2 empList = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (empList == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			empList.increaseSalary(percentage);
		}
		
		System.out.println("List of employees:");
		for (Employee2 employeeList : list) {
			System.out.println(employeeList);
		}

		sc.close();

	}
	
	public static boolean hasId(List<Employee2> list, int id) {
		Employee2 empList = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return empList != null;
	} 

}
