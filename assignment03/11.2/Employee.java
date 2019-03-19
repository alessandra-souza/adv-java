
// An employee has an office, salary, and date hired. Use the MyDate class defined in Programming
// Exercise 10.14 to create an object for date hired.

public class Employee extends Person {
	
	// Data fields
	private String office;
	private double salary;
	private MyDate dateHired;
	
	// Constructor
	Employee(String name, String address, String phoneNumber, String email, String office, double salary){
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}

	// Getters and setters
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired.getYear() + "-" +
				dateHired.getMonth() + "-" +
				dateHired.getDay();
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
	
	// Methods
	@Override
	public String toString() {
		return super.toString() + 
				"\nOffice: " + this.getOffice() + 
				"\nSalary: " + this.getSalary() + 
				"\nDate hired: " + this.getDateHired();
	}
	
	
	
}
