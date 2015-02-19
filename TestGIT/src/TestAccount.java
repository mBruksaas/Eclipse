public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account("George", 1122, 1000.0);
		a1.setAIR(1.5);
		
		a1.deposit(30.0, "First D");
		a1.deposit(40.0, "Second D");
		a1.deposit(50.0, "Third D");
		
		a1.withdraw(5.0, "First W");
		a1.withdraw(4.0, "Second W");
		a1.withdraw(2.0, "Third W");
		
		System.out.println("\tAccount summary\n");
		
		System.out.println("Name of account holder: " + a1.getName());
		System.out.println("Annual interest rate: " + a1.getAIR() + "%");
		System.out.println("Balance: $" + a1.getBalance());
		
		System.out.println("\n\tTransactions\n");
		
		System.out.println(a1.getTransactions());
	}

}
