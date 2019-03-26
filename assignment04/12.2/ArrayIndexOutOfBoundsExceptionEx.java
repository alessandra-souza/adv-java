import java.util.Scanner;

// *12.2 (ArrayIndexOutOfBoundsException) Using the two arrays shown below,
// write a program that prompts the user to enter an integer between 1 and 12 and
// then displays the months and its number of days corresponding to the integer
// entered. Your program should display “wrong number” if the user enters a
// wrong number by catching ArrayIndexOutOfBoundsException.

public class ArrayIndexOutOfBoundsExceptionEx {

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
			}
		} while(!(iMonth > 0 && iMonth < 13));	
		
	}

}
