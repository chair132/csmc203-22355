
public class SavingsAccount extends BankAccount{
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		this.accountNumber = super.getAccountNumber()+"-"+savingsNumber;
	}
	
	public void postInterest() {
		super.deposit((super.getBalance()*rate) / 12);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	public SavingsAccount(SavingsAccount original, double amount) {
		super(original, amount);
		this.savingsNumber = original.savingsNumber +1;
		this.accountNumber = super.getAccountNumber()+"-"+savingsNumber;
		
	}
}
