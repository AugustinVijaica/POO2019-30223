public class Bank {
	
	public Account[] account = new Account[5];
	public int NrCont;
	
	public int getNrCont() {
		return NrCont;
	}
	
	public Account openAccount(int i) {
		account[i] =new Account(i);
		NrCont=i;
		return account[i];
    }
	public Account openAccountSavings(int i) {
		account[i] = new SavingsAccount(i, 0);
		NrCont=i;
		return account[i];
    }
	public Account openAccountCurrent(int i) {
		account[i] = new CurrentAccount(i, -100);
		NrCont=i;
		return account[i];
    }
	
	
	
	public String updateAccount(int interest) {
		int i=getNrCont();
		if(i==2) {
			((SavingsAccount) account[i]).addInterest(interest);
		}
		else if(i==3) {
			double currentBalance = account[i].getBalance();
			int limita = ((CurrentAccount) account[i]).getOverdraftLimit();
			if (currentBalance < 0) {
				if (currentBalance <= limita) {
					return "Ati atins limita de retragere";
			}
			}
			}
		return "0";
		}

	public void depositDivident(double divident, int i) {
		account[i].deposit(divident);
	}

	
	public void closeAccount(int i) {
		System.out.println("Contul nr. " + i + " a fost inchis.");
	}
}