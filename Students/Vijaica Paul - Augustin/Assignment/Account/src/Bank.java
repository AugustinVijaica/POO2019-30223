public class Bank {
	public Account[] account = new Account[100];

	public Account openAccount(int i) {{
			account[i] = new Account(i);
			i++;
			account[i] = new SavingsAccount(0, i);
			i++;
			account[i] = new CurrentAccount(-300, i);
			return account[i];
	}

	public void updateAccount(int i, int a) {
		if (i == 2) {
			((SavingsAccount)account[i]).addInterest(a);
		} else if (i == 3) {
			double newBalance = account[i].getBalance();
			int limit = ((CurrentAccount) account[i]).getOverdraftLimit();
			if (newBalance < 0) {
				if (newBalance <= limit) {
					System.out.println("Ati atins/depasit overdraft. Nu mai puteti retrage numerar.");
				}
			}
		}
	}

	public void depositDivident(double divident, int i) {
		account[i].deposit(divident);
	}

	public void closeAccount(int i) {
		System.out.println("Contul " + i + " a fost inchis.");
	}
}
