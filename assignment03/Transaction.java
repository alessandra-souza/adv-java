import java.util.Date;

public class Transaction {
	
	// Data fields
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	// Constructors
	public Transaction(){};
	
	// Construct a Transaction with the specified date, type, balance, and description
	public Transaction(Date date, char type, double balance, String description, double amount) {
		this.date = date;
		this.type = type;
		this.balance = balance;
		this.description = description;
		this.amount = amount;
	}
	
	// Getters and setters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
