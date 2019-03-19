
// A staff member has a title. Override the toString
// method in each class to display the class name and the person’s name.

public class Staff extends Employee {

	// Data fields
	private String title;

	// Constructor
	public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String title) {
		super(name, address, phoneNumber, email, office, salary);
		this.title = title;
	}

	// Getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// Method
	@Override
	public String toString() {
		return super.toString() +
				"\nTitle: " + this.getTitle();
	}
	
	
	
	
	
}
