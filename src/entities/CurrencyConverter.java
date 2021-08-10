package entities;

public class CurrencyConverter {
	
	public static double convert(double quantityDollar, double dollar) {
		return (quantityDollar * dollar) * 1.06;
	}
	
}
