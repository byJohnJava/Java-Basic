package exceptionHandling.exception;

public class WithdrawInsufficient extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public WithdrawInsufficient(String msg) {
		super(msg);
	}
}
