import java.util.InputMismatchException;
import java.util.Scanner;

// *12.3 (InputMismatchException) The previous program works well as long
// as the user enters an integer. Otherwise, you may get another kind of
// exception. For instance, if you use nextInt() of Scanner, you could have an
// InputMismatchException. Modify it to prevent users entering anything
// other than an integer.

public class InputMismatchExceptionEx {

	public static void main(String[] args) {

		String[] months = {"January", "February", "March", "April",
				"May", "June","July", "August", "September", "October",
				"November", "December"};
		int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		
		
		int iMonth = 0;
		int index;
		Scanner input = new Scanner(System.in);
		
		do {
			try {
				// Ask for an integer
				System.out.println("Enter an integer between 1 and 12:");
				
				// Get the user input
				iMonth = input.nextInt();
				index = iMonth - 1;
				
				// Display the month
				System.out.println("Month: " + months[index]);
				System.out.println("Number of days: " + dom[index]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Wrong number.");
			} catch (InputMismatchException e) {
				input.next();
				System.out.println("You need to enter an integer.");
			}
		} while(!(iMonth > 0 && iMonth < 13) || input.hasNextInt() == false);
		
	}

}
