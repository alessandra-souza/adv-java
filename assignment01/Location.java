
// 9.13 (The Location class) Design a class named Location for locating a maximal
// value and its location in a two-dimensional array. The class contains public data
// fields row, column, and maxValue that store the maximal value and its indices in
// a two-dimensional array with row and column as int types and maxValue as a
// double type.


import java.util.Scanner;

public class Location {
	
	// attributes
	public int row;
	public int column;
	public double maxValue;
	
	// constructors
	Location(){};
	
	Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	
	// Write the following method that returns the location of the largest element in a
	// two-dimensional array:

	// method
	public static Location locateLargest(double[][] a) {
		
		Location location = new Location(); 
		
		location.row = 0;
		location.column = 0;
		location.maxValue = a[0][0];
		
		// loop through the rows
	    for (int row = 0; row < a.length; row++) {
	    	// loop though the columns
	        for (int col = 0; col < a.length; col++) {
	            if (a[row][col] > location.maxValue) {
	            	location.row = row;
	            	location.column = col;
	            	location.maxValue = a[row][col];
	            }
	        }
	    }
	    
	    return location; 
		
	}
	

	public static void main(String[] args) {
		
		// Get the inputs of rows and columns	    
		Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter the number of rows and columns in the array: ");
	    
		int numOfRows = input.nextInt();
	    int numOfColumns = input.nextInt();
	    
	    // Create a new Array obj	    
	    double[][] array = new double[numOfRows][numOfColumns];
	    
	    // Get the inputs of the array	    
	    System.out.println("Enter the array: ");
	    
	    for (int row = 0; row < array.length; row++) {
	    	for (int col = 0; col < array[row].length; col++) {
	    		array[row][col] = input.nextDouble();
	    	}	    		
	    }
	    
	    input.close();
	    
	    // Print out the largest element	    
	    Location location = locateLargest(array);
	    
	    System.out.println("The location of the largest element is " + (int)location.maxValue + " at (" + location.row + ", " + location.column + ")");

	}

}
