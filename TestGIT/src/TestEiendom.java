import java.util.ArrayList;
import java.util.Scanner;

/**
 * The TestEiendom class is a test class for the 'Eiendom' class.
 * It's main purpose is simply to create a few properties and some bids.
 * It then proceeds to ask for input and locates bids through a simple
 * search function.
 * 
 * @author Martin S. Bruksaas
 */
public class TestEiendom {

	public static void main(String[] args) {
		/**
		 * Creates all the necessary data to be used with the other classes.
		 */
		ArrayList<Eiendom> salgsobjekter = new ArrayList<Eiendom>();
		
		salgsobjekter.add(new Enebolig("Marihandstien 2", "Ole Joan Olsen",
									1100000, 204, 23, 400, 1));
		salgsobjekter.add(new Leilighet("Skolebakken 9", "Bjørn Brunost",
									2500000, 56, 15, 354, 40000, 5000, 2));
		
		salgsobjekter.get(0).nyttBud("Ole Pedersen", 2400000, "90522355", 24);
		salgsobjekter.get(0).nyttBud("John McIntosh", 2500000, "90822655", 12);
		salgsobjekter.get(1).nyttBud("Samuel Kokkstad", 3250000, "45672643", 14);
		salgsobjekter.get(1).nyttBud("Jårre Sjåfjell", 3300000, "47582647", 18);
		
		/**
		 * Runs through the scan. If the entered values are not found in the
		 * 'salgsobjekter' ArrayList, the user is asked to search again
		 * with different values. If an object is found, the program prints
		 * all the bids of that object and terminates.
		 */
		int gnr; int bnr;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Boolean notFound = false;
		
		for(int i = 1; i>0; i++) {
			if(notFound == true) {
				System.out.println("\nBeklager, men vi fant ikke det du søkte etter. Prøv igjen\n");
			} else {
				System.out.println("Velkommen til din boligsøkemotor");
			}
			System.out.print("Hvilket gnr vil du søke etter: ");
			gnr = input.nextInt();
			System.out.print("Hvilket bnr vil du søke etter: ");
			bnr = input.nextInt();
			
			for(Eiendom current : salgsobjekter) {
				if(current.getGnr() == gnr && current.getBnr() == bnr) {
					i = -1;
					System.out.println("\nSalgsobjekt funnet, bud vises nedenfor\n");
					current.skrivAlleBud();
				} else {
					notFound = true;
				}
			}
		}
	}
}
