import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * The Bud class is to be used with the 'Eiendom' class as a way to
 * store information about each individual bid on the specific properties.
 * 
 * @author Martin S. Bruksaas
 */
public class Bud {
	private GregorianCalendar budGitt;
	private GregorianCalendar budFrist;
	private String navn;
	private double belop;
	private String telefon;
	
	/**
	 * The main constructor, assigns parameters to values and calculates the
	 * expiration date of the bid.
	 * @param navn navn Name of the bidder.
	 * @param belop Amount of the bid.
	 * @param telefon Bidder's phone number.
	 * @param frist The amount of hours the bid is valid for.
	 */
	public Bud(String navn, double belop, String telefon, int frist) {
		budGitt = new GregorianCalendar();
		this.navn = navn;
		this.belop = belop;
		this.telefon = telefon;
		budFrist = (GregorianCalendar) budGitt.clone();
		budFrist.add(Calendar.HOUR_OF_DAY, frist);
	}
	
	/**
	 * @return Returns the information about this bid as an organized string.
	 */
	public String toString() {
		return budGitt.getTime() + "\t" + budFrist.getTime() +
				"\t" + navn + "\t\t" + telefon + "\t" + belop + " kr";
	}
	
	public String getBudGitt() { return "" +  budGitt.getTime(); }
	public String getBudFrist() { return "" + budFrist.getTime(); }
	public String getNavn() { return navn; }
	public double getBelop() { return belop; }
	public String getTelefon() { return telefon; }
}
