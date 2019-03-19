
// A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant.

public class Student extends Person {
	
	// Data fields
	private char status;
	public final static char FRESHMAN = 'f';
	public final static char SOPHOMORE = 'p';
	public final static char JUNIOR = 'j';
	public final static char SENIOR = 's';
	
	// Constructor
	public Student(String name, String address, String phoneNumber, String email, char status) {
		super(name, address, phoneNumber, email);
		this.status = status;
	}
	
	// Getters and setters
	public String getStatus() {
		switch (status) {
			case 'f' : return "freshman"; 
			case 'p' : return "sophomore"; 
			case 'j' : return "junior"; 
			case 's' : return "senior";
			default : return ""; 
		}
	}

	public void setStatus(char status) {
		this.status = status;
	}
	

	// Method
	@Override
	public String toString() {
		return super.toString() +
			"\nStatus: " + getStatus();
	}	
	
}
