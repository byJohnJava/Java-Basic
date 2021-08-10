package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.ProductOrder;
import entities.enums.OrderStatus;

public class MainOrder {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Order order = new Order();
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.next();
		Client client = new Client(name, email, sdf.parse(birthDate));
		order.setClient(client);
		
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		order.setStatus(OrderStatus.valueOf(status));
		System.out.print("How many items to this order: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			ProductOrder product = new ProductOrder(productName, price);
			OrderItem item = new OrderItem(quantity, price, product);
			order.addItem(item);
		}
		
		System.out.println(order);
		
		sc.close();
		
	}
	
}
