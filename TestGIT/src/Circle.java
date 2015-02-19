
public class Circle extends Figur {
	private double radius;
	
	public Circle() {
		super(); //Gjøres uansett et kall til default constructor i foreldreklasse (Figur), dette trengs egentlig ikke
		radius = 1;
	}
	
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override //Brukes for å sjekke at override gjøres riktig
	public String toString () {
		// return ("x = " + xPos + ", y = " + yPos + ", radius = " + radius); Dette går bare når xPos og yPos ikke er private i Figur-klassen,
		// men dette er dårlig innkapsling, gjøres derfor på måten under
		return (super.toString() + ", radius = " + radius);
	}
}
