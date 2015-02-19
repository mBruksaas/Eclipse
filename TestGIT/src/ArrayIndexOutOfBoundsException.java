import java.util.Scanner;

/**
 * ArrayIndexOutOfBoundsException is a simple program which purpose is
 * to demonstrate how one can create custom handlers to catch exceptions
 * (in this case; IndexOutOfBoundsExceptions) and bring the program
 * "back on track" when it before would have crashed/terminated.
 * 
 * @author Martin S. Bruksaas
 */
public class ArrayIndexOutOfBoundsException {
	
	/**
	 * The main method simply starts up the program. By initiating the random
	 * integer array here, we are able to get the same results for the same index
	 * until the program is manually terminated (by entering -1 as the index).
	 * @param args Standard args for main
	 */
	public static void main(String[] args) {
		Integer[] ints = new Integer[100];
		for(int i=0; i<100; i++) ints[i] = Integer.valueOf((int) (Math.random() * 1000));
		
		tryArray(ints);
		System.out.println("Terminating program");
	}
	
	/**
	 * Simply tries the input function and catches the error that might come back.
	 * @param ints Gets the random integer array from the main method.
	 */
	public static void tryArray(Integer[] ints) {
		Integer[] temp = ints;
		
		try {
			randomIntArray(ints);
		}
		catch (IndexOutOfBoundsException ex){
			System.out.println("Out of bounds");
			tryArray(temp);
		}
	}
	
	/**
	 * The actual input and retrieve of the specified element at the entered index.
	 * Also breaks out of the loop if -1 is entered.
	 * @param ints Retrieves the random integer array.
	 */
	public static void randomIntArray(Integer[] ints){
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		for(int x=1; x>0; x++) {
			System.out.print("Enter an index between 0 and 99 (-1 to exit): ");
			int temp = input.nextInt();
			if(temp == -1) break;
			System.out.println(ints[temp]);
		}
	}
}
