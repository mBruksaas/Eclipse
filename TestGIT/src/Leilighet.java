/**
 * The Leilighet class is a sub-class of 'Eiendom'. It is a specific type of
 * property that can be up for sale.
 * 
 * @author Martin S. Bruksaas
 */
public class Leilighet extends Eiendom {
	private double fellesGjeld;
	private double husLeie;
	private int etg;

	/**
	 * The main constructor, sends the basic parameters to 'Eiendom'
	 * and uses the specialized parameters in this class.
	 * @param fellesGjeld The shared debt of the property.
	 * @param husLeie The monthly rental price.
	 * @param etg The floor of the property for sale.
	 */
	public Leilighet(String adresse, String eiersNavn, double takst,
			int antKvm, int gnr, int bnr, double fellesGjeld, double husLeie, int etg) {
		super(adresse, eiersNavn, takst, antKvm, gnr, bnr);
		this.fellesGjeld = fellesGjeld;
		this.husLeie = husLeie;
		this.etg = etg;
	}
	
	/**
	 * Prints out a summary of all the bids on this property.
	 */
	public void skrivAlleBud() {
		System.out.println("Bud gitt for " + this.getAdresse() + ", takst: " +
				this.getTakst() + " kr, gnr: " + this.getGnr() + ", bnr: " +
				this.getBnr() + ", fellesgjeld: " + this.getFellesGjeld() +
				" kr, husleie: " + this.getHusLeie() + " kr, etg: " + this.getEtg() +
				", type: Leilighet\n");
		
		System.out.println("Bud gitt\t\t\tBud frist\t\t\tNavn\t\t\tTelefon\t\tBeløp\n");
		
		for(Bud current : this.getBudOversikt()) {
			System.out.println(current.toString());
		}
		System.out.println("");
	}
	public double getFellesGjeld() { return fellesGjeld; }
	public double getHusLeie() { return husLeie; }
	public int getEtg() { return etg; }
}
