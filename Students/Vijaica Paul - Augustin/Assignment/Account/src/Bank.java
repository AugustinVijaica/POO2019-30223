public class Bank {
	public Account[] account = new Account[100];

	public Account openAcc(int t, int i) {
		if (t == 1) {
			account[i] = new Account(i);
		} else if (t == 2) {
			account[i] = new SavingsAccount(0, i);
		} else if (t == 3) {
			account[i] = new CurrentAccount(-300, i);
		} else {
			System.out.println("Numarul introdus nu reprezinta un cont.");
		}
		return account[i];
	}

	public void updateAcc(int i, int a) {
		if (i == 2) {
			((SavingsAccount) account[i]).addInterest(a);
		} else if (i == 3) {
			double currentBalance = account[i].getBalance();
			int limit = ((CurrentAccount) account[i]).getOverdraftLimit();
			if (currentBalance < 0) {
				if (currentBalance > limit) {
					System.out.println("Overdraft! Mai aveti " + (-limit + currentBalance)
							+ " pana la limita.");
				} else {
					System.out.println(
							"Ati atins/depasit overdraft. Nu mai puteti retrage numerar.");
				}
			}
		}
	}

	public void depositDivident(double divident, int i) {
		account[i].deposit(divident);
	}

	public void closeAcc(int i) {
		System.out.println("Contul nr. " + i + " a fost inchis.");
	}
}