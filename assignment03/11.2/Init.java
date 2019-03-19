
// Write a test program that creates
// a Person, Student, Employee, Faculty, and Staff, and invokes
// their toString() methods.

public class Init {

	public static void main(String[] args) {
		
		// Person
		Person sarah = new Person("Sarah Smith", "34 Main Street", "555-2222", "sarah@mail.com");
		System.out.println(sarah.toString());
		System.out.println("--------------------------------");
		
		// Student
		Student jack = new Student("Jack Brown", "52 Second Ave", "522-5555", "jack@brown.com", 'f');
		System.out.println(jack.toString());
		System.out.println("--------------------------------");
		
		// Employee
		Employee jane = new Employee("Jane Green", "70 Third Ave", "552-2525", "jane@green.ca", "Downtown", 50000);
		MyDate date = new MyDate(2019, 03, 18);
		jane.setDateHired(date);
		System.out.println(jane.toString());
		System.out.println("--------------------------------");
		
		// Faculty
		Faculty mary = new Faculty("Mary Stone", "23 Main Street", "555-5252", "mary@mail.com", "Downtown", 100000, "9am - 11am", 'A');
		mary.setDateHired(new MyDate(2017, 05,19));
		System.out.println(mary.toString());
		System.out.println("--------------------------------");
		
		// Staff
		Staff john = new Staff("John Doe", "55 Third Ave", "525-5522", "john@mail.ca", "Smallville", 30000, "Mr.");
		System.out.println(john.toString());
		
	}

}
