public class CurrentAccount extends Account {
	private int overdraftLimit;

	public CurrentAccount(int number,int overdraftLimit) {
		super(number);
		this.overdraftLimit = overdraftLimit;
	}

	public int getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(int overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override

	public String toString() {
		return "Account " + getNumber() + ": " + "Sold = " + getBalance() + ", " + "Overdraft Limit = "
				+ getOverdraftLimit();
	}

}