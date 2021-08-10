package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment = new Date(System.currentTimeMillis());
	private OrderStatus status;

	private Client client;
	private List<OrderItem> orderItems = new ArrayList<OrderItem>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void addItem(OrderItem item) {
		orderItems.add(item);
	}

	public void removeItem(OrderItem item) {
		orderItems.remove(item);
	}

	public double total() {
		double total = 0.0;
		for (OrderItem orderItem : orderItems) {
			total += orderItem.subTotal();
		}
		return total;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n ORDER SUMMARY: " + "\n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items: " + "\n");
		for (OrderItem orderItem : orderItems) {
			sb.append(orderItem + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		return sb.toString();

	}

}
