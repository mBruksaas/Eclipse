public class MyPoint {
	private double x;
	private double y;
	
	public MyPoint () {
		x = 0.0;
		y = 0.0;
	}
	
	public MyPoint (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX () {
		return x;
	}
	
	public double getY () {
		return y;
	}
	
	public double distance (double otherX, double otherY) {
		double dist = Math.sqrt((Math.pow(otherX - x, 2))+(Math.pow(otherY - y, 2)));
		return dist;
	}
	
	public double distance (MyPoint p) {
		double otherX = p.getX();
		double otherY = p.getY();
		
		double dist = Math.sqrt((Math.pow(otherX - x, 2))+(Math.pow(otherY - y, 2)));
		return dist;
	}
}
