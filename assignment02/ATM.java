import java.util.Date;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		// Create 10 accounts:
		// 1. declare and create your Account[] variable
		// 2. use a loop to create each account, calling the constructor
		
		Account[] accounts = new Account[10];	
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);	
		}
		
		
		// Introduce a loop in your code so that after the transaction the system
		// is ready to accept a new id, choice and perform a new transaction
		int id = 0;
		int choice = 0;
		while (true) {
			id = getID();
			choice = 0;
			while (choice != 4) {
				choice = getChoice();
				doTransaction(id, choice, accounts);
			}
		}

	}

	// Prompt the user for an id, validate it, continue only with a valid id
	public static int getID() {			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your id:");
		int inputId = input.nextInt();
		
		// validate
		while (!(inputId >= 0 && inputId < 10)) {
			System.out.println("You need to enter an id between 0 and 9");
			System.out.println("Enter your id:");
			inputId = input.nextInt();
		}
		
		// return the id
		return inputId;
	}

	// Display the menu, prompt the user for choice and return the choice
	public static int getChoice() {
		Scanner input = new Scanner(System.in);
				
		// display the menu
		System.out.println("********************");
		System.out.println("   Main menu");
		System.out.println("********************");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		System.out.println("Enter a choice:");
		System.out.println("********************");
		
		int inputChoice = input.nextInt();
		
		// return the choice
		return inputChoice;
		
	}

	// Call methods in your Account object to perform the chosen transaction
	public static void doTransaction(int id, int choice, Account[] accounts) {
		
		// get the input
		Scanner input = new Scanner(System.in);
		
		switch(choice) {
			case 1: 
				System.out.println("The balance for account with id " + id + " is " + accounts[id].getBalance());
				break;
			case 2:
				System.out.println("Enter an amount to widthdraw: ");
				double amountToWithdraw = input.nextDouble();
				accounts[id].withdraw(amountToWithdraw);
				System.out.println("You made a widthdraw of " + amountToWithdraw + " and your balance now is " + accounts[id].getBalance());
				break;
			case 3:
				System.out.println("Enter an amount to deposit: ");
				double amountToDeposit = input.nextDouble();
				accounts[id].deposit(amountToDeposit);
				System.out.println("You made a deposit of  " + amountToDeposit + " and your balance now is " + accounts[id].getBalance());
				break;
			case 4:
				System.out.println("Goodbye!");
				break;
		}
	}

}

