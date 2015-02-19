
public class Circle extends Figur {
	private double radius;
	
	public Circle() {
		super(); //Gj�res uansett et kall til default constructor i foreldreklasse (Figur), dette trengs egentlig ikke
		radius = 1;
	}
	
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override //Brukes for � sjekke at override gj�res riktig
	public String toString () {
		// return ("x = " + xPos + ", y = " + yPos + ", radius = " + radius); Dette g�r bare n�r xPos og yPos ikke er private i Figur-klassen,
		// men dette er d�rlig innkapsling, gj�res derfor p� m�ten under
		return (super.toString() + ", radius = " + radius);
	}
}
