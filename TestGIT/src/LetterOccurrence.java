import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * LetterOccurrence is a relatively simple program which goes through
 * a user-defined file and checks for how many occurrences each letter
 * in the alphabet has. Upper- or lowercase does not matter.
 * 
 * @author Martin S. Bruksaas
 */
public class LetterOccurrence {

	public static void main(String[] args) {
			try {
				program();
			} catch (FileNotFoundException ex) {
				/*The program throws a FileNotFoundException
				 * at the end of the program if a file that did not exist
				 * was previously searched for. This does not matter as
				 * the program is supposed to terminate there either way,
				 * so we're just catching the exception to make the
				 * console look cleaner. */
			}
	}
	public static void program() throws FileNotFoundException {
		
		//Loops through to find a file
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a filename: ");
		
		File file = new File(input.next());
		if(file.exists() == true) {
			System.out.println("\nFile found, analyzing\n");
			input.close();
		} else { 
			System.out.println("\nThe file you entered doesn't exist, try again\n");
			program();
		}
		
		/*Initiates 123 elements in 'occurrences' to store the occurrences of
		 * each letter, with the index being the ASCII value for each character.
		 * Realistically 'occurrences' only needs to have 26 elements, but doing it
		 * this way makes the coding a tad easier */
		
		ArrayList<Integer> occurrence = new ArrayList<Integer>();
		for(int i=0; i<123; i++) occurrence.add(i, new Integer(0));
		
		//a-z as ASCII is 97-122, 26 letters
		Scanner inputFile = new Scanner(file);
		int count = 0;
		
		//Goes through all the lines and adds 1 to the index of each
		//ASCII character in 'occurrences'
		while(inputFile.hasNext()) {
			String line = inputFile.nextLine();
			line = line.toLowerCase();
			
			for(int i=0; i<line.length(); i++) {
				int ascii = (int) line.charAt(i);
				
				if(ascii >= 97 && ascii <= 122) {
					occurrence.set(ascii, occurrence.get(ascii)+1);
					count++;
				}
			}
		}
		inputFile.close();
		
		//Prints a summary of the occurrences of each letter, and the total
		//letter count
		System.out.println("The occurrence of each letter (A-z) in the file is listed below\n");
		for(int i=97; i<123; i++) {
			char temp = Character.toUpperCase((char)i);
			System.out.print(temp + ": " + occurrence.get(i) + "\t");
			if((i-96) % 9 == 0) System.out.print("\n");
		}
		System.out.println("\n\nTotal letter count: " + count);
	}
}
