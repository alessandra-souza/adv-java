import java.util.ArrayList;

// **11.18 (ArrayList of Character) Write a method that returns an array list of Character
// from a string using the following header:
// public static ArrayList<Character> toCharacterArray(String s)
// For example, toCharacterArray("abc") returns an array list that contains
// characters 'a', 'b', and 'c'.

public class CharacterArrayList {
	
	public static ArrayList<Character> toCharacterArray(String s) {
		
		// instantiate a new ArrayList<Character> object
		ArrayList<Character> chars = new ArrayList<Character>();
		
		// iterate through each String and convert them in a character array
		for(char c : s.toCharArray()) {
			chars.add(c);
		}
        
        return chars;
		
	}

	public static void main(String[] args) {
		
		System.out.println(toCharacterArray("abc"));

	}

}
