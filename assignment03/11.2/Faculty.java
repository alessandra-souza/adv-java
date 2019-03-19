
// A faculty member has office hours and a rank.

public class Faculty extends Employee {

	// Data fields
	private String officeHours;
	private char rank;
	
	// Constructor
	Faculty(String name, String address, String phoneNumber, String email, String office, double salary, String officeHours, char rank) {
		super(name, address, phoneNumber, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	// Getters and setters
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public char getRank() {
		return rank;
	}
	
	public void setRank(char rank) {
		this.rank = rank;
	}

	// Method
	@Override
	public String toString() {
		return super.toString() +
			"\nOffice hours: " + this.getOfficeHours() +
			"\nRank: " + this.getRank();
	}
	
	
	
	
}
