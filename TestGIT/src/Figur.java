
public class Figur {
	private int xPos;
	private int yPos;
	
	public Figur () {
		xPos = 0;
		yPos = 0;
	}
	
	public Figur (int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	@Override //Brukes for å sjekke at override gjøres riktig
	public String toString () {
		return ("x = " + xPos + ", y = " + yPos);
	}
}
