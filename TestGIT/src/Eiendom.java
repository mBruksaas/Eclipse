import java.util.ArrayList;

/**
 * The Eiendom class makes it possible to use the two sub-classes
 * 'Enebolig' and 'Leilighet'. The point of this class being to handle
 * the different bids on the specific objects of type 'Enebolig' and
 * 'Leilighet'.
 * 
 * @author Martin S. Bruksaas
 */

abstract class Eiendom {
	private String adresse;
	private String eiersNavn;
	private double takst;
	private int antKvm;
	private int gnr;
	private int bnr;
	private ArrayList<Bud> budOversikt;
	
	/**
	 * The main constructor, used through sub-classes.
	 * @param adresse The address of the property being sold.
	 * @param eiersNavn The owner's name.
	 * @param takst The estimated value of the property.
	 * @param antKvm The amount of usable square meters on the property.
	 * @param gnr The street number.
	 * @param bnr The property's registry number.
	 */
	public Eiendom(String adresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr) {
		this.adresse = adresse;
		this.eiersNavn = eiersNavn;
		this.takst = takst;
		this.antKvm = antKvm;
		this.gnr = gnr;
		this.bnr = bnr;
		budOversikt = new ArrayList<Bud>();
	}
	
	/**
	 * Adds a new bid to the current object.
	 * @param navn Name of the bidder.
	 * @param belop Amount of the bid.
	 * @param telefon Bidder's phone number.
	 * @param frist The amount of hours the bid is valid for.
	 */
	public void nyttBud(String navn, double belop, String telefon, int frist) {
		budOversikt.add(new Bud(navn, belop, telefon, frist));
	}
	public void skrivAlleBud() {};
	
	/**
	 * @return Returns the most recent bid as a string.
	 */
	public String getSisteBud() {
		return budOversikt.get(budOversikt.size()-1).toString();
	}
	
	public String getAdresse() { return adresse; }
	public String getEiersNavn() { return eiersNavn; }
	public double getTakst() { return takst; }
	public int getKvm() { return antKvm; }
	public int getGnr() { return gnr; }
	public int getBnr() { return bnr; }
	public ArrayList<Bud> getBudOversikt() { return budOversikt; }
}
