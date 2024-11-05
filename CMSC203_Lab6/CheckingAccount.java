

public class CheckingAccount extends BankAccount {
	private static final double FEE = 0.15;
	
	public CheckingAccount(String name, double initialAmount) {
		super(name, initialAmount);
		super.setAccountNumber(getAccountNumber()+"-10");
		
	}
	
	public boolean withdraw(double amount) {
		return super.withdraw(amount+FEE);
	}
	
}
