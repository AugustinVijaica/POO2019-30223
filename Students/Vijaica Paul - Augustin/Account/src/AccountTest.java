import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

	Bank bank = new Bank();
	



	@Test
	public void test1() {
		Account a1 = bank.openAccount(1);
		a1.deposit(400);
		Assert.assertThat(a1.toString(), Is.is("Account 1: Sold = 400.0"));
		a1.withdraw(200);
		Assert.assertThat(a1.toString(), Is.is("Account 1: Sold = 200.0"));
	}
	
	

	

	@Test
	public void test2() {
		Account a2 = bank.openAccountSavings(2);
		a2.deposit(500);
		Assert.assertThat(a2.toString(), Is.is("Account 2: Sold = 500.0, Interest = 0"));
		a2.withdraw(200);
		Assert.assertThat(a2.toString(), Is.is("Account 2: Sold = 300.0, Interest = 0"));
		bank.updateAccount(30);
		Assert.assertThat(a2.toString(), Is.is("Account 2: Sold = 300.0, Interest = 30"));
	}
	
	@Test
	public void test3() {
		Account a3 = bank.openAccountCurrent(3);
		a3.deposit(200);
		Assert.assertThat(a3.toString(), Is.is("Account 3: Sold = 200.0, Overdraft Limit = -100"));
		a3.withdraw(300);
		Assert.assertThat(a3.toString(), Is.is("Account 3: Sold = -100.0, Overdraft Limit = -100"));
		Assert.assertThat(bank.updateAccount(0), Is.is("Ati atins limita de retragere"));
	}

	
	
}
