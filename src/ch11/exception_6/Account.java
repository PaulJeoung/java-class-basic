package ch11.exception_6;

public class Account {
	private long balance;
	
	public Account() {
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws InsufficientException {
		if (balance < money) {
			throw new InsufficientException("잔고부족 : "+(money-balance)+" 부족");
		}
		balance -= money;
	}
}
