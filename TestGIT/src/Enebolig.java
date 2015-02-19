/**
 * The Enebolig class is a sub-class of 'Eiendom'. It is a specific type of
 * property that can be up for sale.
 * 
 * @author Martin S. Bruksaas
 */
public class Enebolig extends Eiendom {
	private int type;

	/**
	 * The main constructor, sends the basic parameters to 'Eiendom'
	 * and uses the specialized parameters in this class.
	 * @param type The type of property. 1 for freestanding, 2 for townhouse
	 * and 3 for two-man.
	 */
	public Enebolig(String adresse, String eiersNavn, double takst,
			int antKvm, int gnr, int bnr, int type) {
		super(adresse, eiersNavn, takst, antKvm, gnr, bnr);
		this.type = type;
	}
	
	/**
	 * Prints out a summary of all the bids on this property.
	 */
	public void skrivAlleBud() {
		System.out.println("Bud gitt for " + this.getAdresse() + ", takst: " +
				this.getTakst() + " kr, gnr: " + this.getGnr() + ", bnr: " +
				this.getBnr() + ", type: " + this.getTypeAsString() + " enebolig\n");
		
		System.out.println("Bud gitt\t\t\tBud frist\t\t\tNavn\t\t\tTelefon\t\tBeløp\n");
		
		for(Bud current : this.getBudOversikt()) {
			System.out.println(current.toString());
		}
		System.out.println("");
	}
	
	/**
	 * @return Returns the type (int) as text.
	 */
	public String getTypeAsString() {
		switch(type) {
			case 1: return "Frittstående";
			case 2: return "Rekke";
			case 3: return "Tomanns";
			default: return "Ikke oppgitt";
		}
	}
}
