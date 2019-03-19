import java.util.ArrayList;
import java.util.Date;

class Account {
	
	// Data fields
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	// Add a new data field name of the String type to store the name of the customer
	private String name;
	// Add a new data field named transactions whose type is ArrayList that stores the transaction for the accounts
	//  Each transaction is an instance of the Transaction class
	ArrayList<Transaction> transactions = new ArrayList<>();

	// Constructors
	public Account() {
		this(0, 0);
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}
	// Add a new constructor that constructs an account with the specified name, id, and balance
	public Account(int id, double balance, String name) {
		this.id = id;
		this.balance = balance;
		this.name = name;
	}

	// Getters and setters
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public static void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 1200);
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	// new getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	// Methods
	// Modify the withdraw and deposit methods to add a transaction to the transactions array list
	public void withdraw(double amount) {
		balance -= amount;
		Transaction widthdrawTransaction = new Transaction(new Date(), 'W', balance, "You executed a widthdraw", amount);
		transactions.add(widthdrawTransaction);
	}
	
	public void deposit(double amount) {
		balance += amount;
		Transaction depositTransaction = new Transaction(new Date(), 'D', balance, "You executed a deposit", amount);
		transactions.add(depositTransaction);
	}

}