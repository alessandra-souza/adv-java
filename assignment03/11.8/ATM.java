
public class ATM {

	public static void main(String[] args) {
		
		// Write a test program that creates an Account with annual interest rate 1.5%,
		// balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the
		// account and withdraw $5, $4, and $2 from the account. Print an account summary
		// that shows the account holder name, interest rate, balance, and all transactions.
		
		Account georgeAcc = new Account(1122, 1000, "George");	
		Account.setAnnualInterestRate(0.015);
		
		// Transactions
		georgeAcc.deposit(30.00);
		georgeAcc.deposit(40.00);
		georgeAcc.deposit(50.00);
		georgeAcc.withdraw(5.00);
		georgeAcc.withdraw(4.00);
		georgeAcc.withdraw(2.00);
		
		// Print summary
		System.out.println("***********************************************************************");
		System.out.println("Information about " + georgeAcc.getName() + "'s account:");
		System.out.println("***********************************************************************");

		System.out.println("Interest rate: " + georgeAcc.getAnnualInterestRate());
		for (Transaction t : georgeAcc.getTransactions()) {
			System.out.println("Balance: " + t.getBalance());
			System.out.println("Transaction: " + t.getDescription() + " of " + t.getAmount() + " in " + t.getDate() + ".");
		}	
		
	}

}
