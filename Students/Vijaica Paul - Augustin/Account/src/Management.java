
public class Management {
	public static void main(String[] args) {
		Bank bank = new Bank();

		Account a1 = bank.openAccount(1);
		a1.deposit(400);
		a1.print();
		a1.withdraw(200);
		a1.print();
		bank.depositDivident(30, 1);
		a1.print();
	
		Account a2 = bank.openAccountSavings(2);
		
		a2.print();
		a2.deposit(500);
		a2.print();
		a2.withdraw(200);
		a2.print();
		bank.updateAccount(30);
		a2.print();
		bank.depositDivident(70,2);
		a2.print();


		Account a3 = bank.openAccountCurrent(3);
		a3.print();
		a3.deposit(200);
		a3.print();
		a3.withdraw(300);
		a3.print();
		bank.updateAccount(0);
		System.out.println(bank.updateAccount(0));
		a3.print();
		a3.withdraw(600);
		System.out.println(bank.updateAccount(0));
		a3.print();
	
		bank.closeAccount(1);
		bank.closeAccount(2);
		bank.closeAccount(3);

	}
}