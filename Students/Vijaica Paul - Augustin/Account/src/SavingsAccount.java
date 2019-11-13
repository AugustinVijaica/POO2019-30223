public class SavingsAccount extends Account {
	
	private int interest;

	public SavingsAccount(int number,int interest) {
		super(number);
		this.interest = interest;
	}

	public int getInterest() {
		return interest;
	}
	
	public void setInterest(int interest) {
		this.interest = interest;
	}

	public void addInterest(int s) {
			interest += s;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int newNumber) {
		this.number = newNumber;
	}

	@Override

	public String toString() {
		return "Account " + getNumber() + ": " + "Sold = " + getBalance() + ", " + "Interest = " + getInterest();
	}

}