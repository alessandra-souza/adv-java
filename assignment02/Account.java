import java.util.Date;

class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	public Account() {
		this(0, 0);
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

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

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}

}
