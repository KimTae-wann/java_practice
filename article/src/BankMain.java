
public class BankMain {

	
	public static void main(String[] args) {
		Account account = new Account("김태완", 10000);
		account.chargeAccount(5000);
		account.withdraw(6000);
	}
}


